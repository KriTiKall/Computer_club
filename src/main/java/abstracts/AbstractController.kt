package abstracts

import java.awt.event.ActionListener
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.DefaultListModel

abstract class AbstractController<Entity : EntityId<Long>, Form : AbstractForm<Entity>>(
    view: Form,
    service: AbstractService<Entity, Long>,
    mock: Entity
) {

    protected val view = view
    protected val dao = service

    var mock: Entity = mock
    var acc = mock

    protected val model = DefaultListModel<Entity>()

    fun initView() {
        view.apply {
            list.model = model
            loadItems()

            bAdd.addActionListener(actionOfAdd())
            bUpdate.addActionListener(actionOfUpdate())
            bDelete.addActionListener(actionOfDelete())
            list.addMouseListener(actionOfUpdateOrDelete())
        }

        view.show()
    }

    private fun actionOfAdd() = ActionListener {
        val temp = mock
        fromUIToApp(temp, view)
        view.bUpdate.isVisible = false
        view.bDelete.isVisible = false

        dao.create(temp)
        loadItems()
        clean()
    }

    private fun actionOfUpdate() = ActionListener {
        view.bUpdate.isVisible = false
        fromUIToApp(acc, view)
        clean()

        dao.update(acc)
        loadItems()
    }

    private fun actionOfDelete() = ActionListener {
        view.bDelete.isVisible = false
        dao.delete(acc)
        loadItems()
    }


    private fun actionOfUpdateOrDelete() = object : MouseAdapter() {
        override fun mouseClicked(evt: MouseEvent) {
            val man = view.list.selectedValue as Entity?
            if (man != null) {
                acc.id = man.id
                if (evt.clickCount % 2 == 0) {
                    view.bUpdate.isVisible = true
                    view.bDelete.isVisible = false
                    fromAppToUI(view, man)
                } else if (evt.clickCount % 2 == 1) {
                    view.bDelete.isVisible = true
                    view.bUpdate.isVisible = false
                    clean()
                }
            }
        }
    }

    protected fun loadItems() {
        model.clear()
        dao.list.forEach { model.addElement(it) }
    }

    protected abstract fun fromUIToApp(entity: Entity, form: Form)

    protected abstract fun fromAppToUI(form: Form, entity: Entity)

    protected abstract fun clean()
}