package controller

import abstracts.AbstractController
import data.entity.Computer
import data.entity.Hall
import org.hibernate.SessionFactory
import service.ComputerService
import view.ComputerForm
import javax.swing.JComboBox

class ComputerController(view: ComputerForm, factory: SessionFactory) :
    AbstractController<Computer, ComputerForm>(view = view, service = ComputerService(factory), mock = Computer()) {

    private val service = ComputerService(factory)

    init {
        val comboClub = view.comboComponents.get("hall") as JComboBox<Hall>?
        service.getHalls().forEach { comboClub?.addItem(it) }
    }

    override fun fromUIToApp(entity: Computer, form: ComputerForm) {
        with(entity) {
            with(form) {
                hall = comboComponents["hall"]?.selectedItem as Hall
                videoCard = textComponents["videoCard"]?.text
                processor = textComponents["processor"]?.text
                mouse = textComponents["mouse"]?.text
                keyboard = textComponents["keyboard"]?.text
                level = textComponents["level"]?.text
                status = textComponents["status"]?.text
            }
        }
    }

    override fun fromAppToUI(form: ComputerForm, entity: Computer) {
        with(entity) {
            with(form) {
                comboComponents["hall"]?.selectedItem = hall
                textComponents["videoCard"]?.text = videoCard
                textComponents["processor"]?.text = processor
                textComponents["mouse"]?.text = mouse
                textComponents["keyboard"]?.text = keyboard
                textComponents["level"]?.text = level
                textComponents["status"]?.text = status
            }
        }
    }

    override fun clean() {
        with(view) {
            comboComponents["hall"]?.selectedIndex = 0
            textComponents["videoCard"]?.text = ""
            textComponents["processor"]?.text = ""
            textComponents["mouse"]?.text = ""
            textComponents["keyboard"]?.text = ""
            textComponents["level"]?.text = ""
            textComponents["status"]?.text = ""
        }

    }
}
