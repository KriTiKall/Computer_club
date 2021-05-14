package abstracts

import java.awt.Color
import javax.swing.*
import javax.swing.text.JTextComponent

abstract class AbstractForm<Entity> (name: String){

    companion object {
        const val SCREEN_HEIGHT = 1080
        const val SCREEN_WIDTH = 1920

        const val WINDOW_HEIGHT = 360
        const val WINDOW_WIDTH = 500

        const val FIRST_W = 90
        const val FIRST_H = 20
        const val FIRST_X = 10
        const val FIRST_Y = 20

        const val SECOND_W = 120
        const val SECOND_H = 20
        const val SECOND_X = 110
        const val SECOND_Y = 20

        const val STEP = 30
    }

    val entityName = name

    var locationHelper = 0
    var locationDiv = 0

    open lateinit var components: Map<String, JComponent>
    open var textComponents: Map<String, JTextComponent> = mapOf()
    open var comboComponents: Map<String, JComboBox<out EntityId<Long>>> = mapOf()

    val lManage = JLabel("Реактирование сущности ")
    val frMain = JFrame()

    val list = JList<Entity>()
    val scList = JScrollPane(list)

    val bAdd = JButton("Добавить")
    val bUpdate = JButton("Обновить")
    val bDelete = JButton("Удалить")

    fun show() {
        createUI()

        val labels = components.values
        val texts = textComponents.values
        val combos = comboComponents.values

        for (i in 0..(labels.size - 1)) {
            locationHelper++
            toPlaceLabel(labels.elementAt(i))
            if (combos.size > i)
                toPlaceCombo(combos.elementAt(i))
            else
                toPlaceText(texts.elementAt(i - combos.size))
        }

        lManage.text += entityName
        frMain.title = entityName

        locationHelper += 2
        initButton()
    }

    private fun createUI() {
        frMain.apply {
            setLocation(
                (SCREEN_WIDTH - WINDOW_WIDTH) / 2,
                (SCREEN_HEIGHT - WINDOW_HEIGHT) / 2
            )
            layout = null
            title = "null"
            defaultCloseOperation = WindowConstants.DISPOSE_ON_CLOSE
            isVisible = true
            isResizable = false
            setSize(WINDOW_WIDTH, WINDOW_HEIGHT)
            contentPane.background = Color(0xD7DDFF)
        }

        lManage.apply {
            setSize(FIRST_W + 200, FIRST_H)
            setLocation(
                (WINDOW_WIDTH - FIRST_W - 200) / 2,
                FIRST_Y + (STEP * locationHelper) - 10
            )
        }

        locationHelper++

        list.apply {
            setSize(SECOND_W + 120, SECOND_H + 150)
            setLocation(SECOND_X + SECOND_W + 20, SECOND_Y + (STEP * locationHelper))
            background = Color(0xF3F3FF)
        }

        scList.apply {
            setSize(SECOND_W + 120, SECOND_H + 150)
            setLocation(SECOND_X + SECOND_W + 20, SECOND_Y + (STEP * locationHelper))
            verticalScrollBarPolicy = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS
        }

        locationHelper--

        frMain.apply {
            add(lManage)
            add(scList)
            add(bAdd)
            add(bUpdate)
            add(bDelete)
        }
    }

    protected fun initButton() {
        val temp = locationHelper

        if (locationHelper < 8) {
            locationHelper = 8
        }

        bAdd.apply {
            setSize(FIRST_W + 50, FIRST_H)
            setLocation(FIRST_X, FIRST_Y + (STEP * locationHelper))
            background = Color(0xC2D8FF)
        }

        bUpdate.apply {
            setSize(FIRST_W + 50, FIRST_H)
            setLocation(FIRST_X + FIRST_W + 60, FIRST_Y + (STEP * locationHelper))
            isVisible = false
            background = Color(0xCBFFC2)
        }

        bDelete.apply {
            setSize(FIRST_W + 50, FIRST_H)
            setLocation(FIRST_X + (FIRST_W + 60) * 2, FIRST_Y + (STEP * locationHelper))
            isVisible = false
            background = Color(0xFFC2C2)
        }

        locationHelper = temp
    }


    private fun toPlace(comp: JComponent, x: Int, y: Int, h: Int, w: Int) {
        with(comp) {
            setSize(w, h)
            setLocation(x, y + (STEP * locationHelper))
        }
        frMain.add(comp)
    }

    protected fun toPlaceLabel(component: JComponent) {
        toPlace(component, FIRST_X, FIRST_Y, FIRST_H, FIRST_W)
    }

    private fun toPlaceCombo(component: JComponent) {
        toPlace(component, SECOND_X, SECOND_Y, SECOND_H, SECOND_W)
    }

    protected fun toPlaceText(component: JTextComponent) {
        toPlaceCombo(component)
        component.background = Color(0xF3F3FF)
    }

    fun getSelected(): Entity? = list.selectedValue as Entity?
}