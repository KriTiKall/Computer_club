package view

import jdk.nashorn.internal.codegen.ObjectClassGenerator.pack
import net.miginfocom.swing.MigLayout
import java.awt.Dimension
import java.awt.Font
import java.nio.file.Files.getOwner
import javax.swing.*


class MainForm {

    companion object {
        const val SCREEN_HEIGHT = 1080
        const val SCREEN_WIDTH = 1920

        const val WINDOW_HEIGHT = 800
        const val WINDOW_WIDTH = 600
    }

    val frMain = JFrame()

    val lTitle = JLabel("Клиент")

    val lComputer = JLabel("id ПК")
    val tfComputer = JTextField()

    val lNickname = JLabel("Ник")
    val tfNickname = JTextField()

    val lFirstName = JLabel("Имя")
    val tfFirstName = JTextField()

    val lLastName = JLabel()
    val tfLastName = JTextField()

    val lMail = JLabel("Почта")
    val tfMail = JTextField()

    val lName = JLabel()
    val tfName = JTextField()

    val lPhone = JLabel("Телефон")
    val tfPhone = JTextField()

    val lCity = JLabel("Город")
    val tfCity = JTextField()

    val lStreet = JLabel("Улица")
    val tfStreet = JTextField()

    val lBuilding = JLabel("Дом")
    val tfBuilding = JTextField()

    val lOffice = JLabel()
    val tfOffice = JTextField()

    val bAdd = JButton("Добавить")

    private var menuBar1: JMenuBar? = null
    private var menu3: JMenu? = null
    private var label1: JLabel? = null
    private var comboBox1: JComboBox<*>? = null
    private var label4: JLabel? = null
    private var label2: JLabel? = null
    private var comboBox2: JComboBox<*>? = null
    private var comboBox3: JComboBox<*>? = null
    private var spinner1: JSpinner? = null
    private var label3: JLabel? = null
    private var scrollPane2: JScrollPane? = null
    private var list1: JList<*>? = null
    private var scrollPane1: JScrollPane? = null
    private var editorPane1: JEditorPane? = null
    private var label5: JLabel? = null
    private var label6: JLabel? = null
    private var button1: JButton? = null

    fun createUI() {
        frMain.apply {
            setLocation((SCREEN_WIDTH - WINDOW_WIDTH) / 2, (SCREEN_HEIGHT - WINDOW_HEIGHT) / 2)
            layout = null
            title = "Department"
            defaultCloseOperation = WindowConstants.DISPOSE_ON_CLOSE
            isVisible = true
            isResizable = false
            setSize(WINDOW_WIDTH, WINDOW_HEIGHT)
        }

        lComputer.apply {
            setSize(80, 20)
            setLocation(10, 10)
            isVisible = true
        }

        tfComputer.apply {
            setSize(120, 20)
            setLocation(100, 10)
            isVisible = true
        }

        lNickname.apply {
            setSize(80, 20)
            setLocation(10, 40)
            isVisible = true
        }

        tfNickname.apply {
            setSize(120, 20)
            setLocation(100, 40)
            isVisible = true
        }

        lFirstName.apply {
            setSize(80, 20)
            setLocation(10, 70)
            isVisible = true
        }

        tfFirstName.apply {
            setSize(120, 20)
            setLocation(100, 70)
            isVisible = true
        }

        lLastName.apply {
            setSize(80, 20)
            setLocation(10, 100)
            isVisible = true
        }

        tfLastName.apply {
            setSize(120, 20)
            setLocation(100, 100)
            isVisible = true
        }

        lMail.apply {
            setSize(80, 20)
            setLocation(10, 130)
            isVisible = true
        }

        tfMail.apply {
            setSize(120, 20)
            setLocation(100, 130)
            isVisible = true
        }

        menuBar1 = JMenuBar()
        menu3 = JMenu()
        label1 = JLabel()
        comboBox1 = JComboBox<Any?>()
        label4 = JLabel()
        label2 = JLabel()
        comboBox2 = JComboBox<Any?>()
        comboBox3 = JComboBox<Any?>()
        spinner1 = JSpinner()
        label3 = JLabel()
        scrollPane2 = JScrollPane()
        list1 = JList<Any?>()
        scrollPane1 = JScrollPane()
        editorPane1 = JEditorPane()
        label5 = JLabel()
        label6 = JLabel()
        button1 = JButton()

        //======== this ========

        //======== this ========
        setFont(Font(Font.DIALOG, Font.PLAIN, 0))
        setMinimumSize(Dimension(20, 60))
        val contentPane: Container = getContentPane()
        contentPane.setLayout(
            MigLayout(
                "hidemode 3",  // columns
                "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]",  // rows
                ("[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]")
            )
        )

        //======== menuBar1 ========

        //======== menuBar1 ========
        {

            //======== menu3 ========
            {
                menu3.setText("text")
            }
            menuBar1.add(menu3)
        }
        setJMenuBar(menuBar1)

        //---- label1 ----

        //---- label1 ----
        label1.setText("\u041a\u043b\u0438\u0435\u043d\u0442\u044b")
        contentPane.add(label1, "cell 1 1 2 1")
        contentPane.add(comboBox1, "cell 4 1 26 1")

        //---- label4 ----

        //---- label4 ----
        label4.setText("\u0421\u043e\u0437\u0434\u0430\u043d\u0438\u0435 item")
        contentPane.add(label4, "cell 33 1 19 1,alignx center,growx 0")

        //---- label2 ----

        //---- label2 ----
        label2.setText("\u0421\u043a\u043b\u0430\u0434")
        contentPane.add(label2, "cell 1 2")
        contentPane.add(comboBox2, "cell 4 2 26 1")
        contentPane.add(comboBox3, "cell 33 2 18 1")
        contentPane.add(spinner1, "cell 51 2")

        //---- label3 ----

        //---- label3 ----
        label3.setText("text")
        contentPane.add(label3, "cell 4 3 24 1")

        //======== scrollPane2 ========

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(list1)
        }
        contentPane.add(scrollPane2, "cell 34 5 18 19")

        //======== scrollPane1 ========

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(editorPane1)
        }
        contentPane.add(scrollPane1, "cell 1 6 28 17")

        //---- label5 ----

        //---- label5 ----
        label5.setText("\u0418\u0442\u043e\u0433:")
        contentPane.add(label5, "cell 34 26 2 1")

        //---- label6 ----

        //---- label6 ----
        label6.setText("text")
        contentPane.add(label6, "cell 37 26")

        //---- button1 ----

        //---- button1 ----
        button1.setText("text")
        contentPane.add(button1, "cell 1 29")
        pack()
        setLocationRelativeTo(getOwner())
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        frMain.apply {
            add(lComputer)
            add(tfComputer)
            add(lNickname)
            add(tfNickname)
            add(lFirstName)
            add(tfFirstName)
            add(lLastName)
            add(tfLastName)
            add(lMail)
            add(tfMail)
            add(bAdd)
        }
    }
}