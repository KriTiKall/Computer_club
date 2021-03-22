package view

import java.awt.Dimension
import java.awt.Font
import javax.swing.*



class yarik_vmer : JFrame() {

    var menuBar1: JMenuBar? = null
    var menu3: JMenu? = null
    var label1: JLabel? = null
    var comboBox1: JComboBox<*>? = null
    var label4: JLabel? = null
    var label2: JLabel? = null
    var comboBox2: JComboBox<*>? = null
    var comboBox3: JComboBox<*>? = null
    var spinner1: JSpinner? = null
    var label3: JLabel? = null
    var scrollPane2: JScrollPane? = null
    var list1: JList<*>? = null
    var scrollPane1: JScrollPane? = null
    var editorPane1: JEditorPane? = null
    var label5: JLabel? = null
    var label6: JLabel? = null
    var button1: JButton? = null // JFormDesigner - End of variables declaration  //GEN-END:variables


    fun initComponents() {
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

        font = Font(Font.DIALOG, Font.PLAIN, 0)
        minimumSize = Dimension(20, 60)
        val contentPane = contentPane

        run {


            {
                menu3!!.text = "text"
            }
            menuBar1!!.add(menu3)
        }
        jMenuBar = menuBar1

        label1!!.text = "\u041a\u043b\u0438\u0435\u043d\u0442\u044b"
        contentPane.add(label1, "cell 1 1 2 1")
        contentPane.add(comboBox1, "cell 4 1 26 1")

        //---- label4 ----
        label4!!.text = "\u0421\u043e\u0437\u0434\u0430\u043d\u0438\u0435 item"
        contentPane.add(label4, "cell 33 1 19 1,alignx center,growx 0")

        //---- label2 ----
        label2!!.text = "\u0421\u043a\u043b\u0430\u0434"
        contentPane.add(label2, "cell 1 2")
        contentPane.add(comboBox2, "cell 4 2 26 1")
        contentPane.add(comboBox3, "cell 33 2 18 1")
        contentPane.add(spinner1, "cell 51 2")

        //---- label3 ----
        label3!!.text = "text"
        contentPane.add(label3, "cell 4 3 24 1")

        //======== scrollPane2 ========
        run { scrollPane2!!.setViewportView(list1) }
        contentPane.add(scrollPane2, "cell 34 5 18 19")

        //======== scrollPane1 ========
        run { scrollPane1!!.setViewportView(editorPane1) }
        contentPane.add(scrollPane1, "cell 1 6 28 17")

        //---- label5 ----
        label5!!.text = "\u0418\u0442\u043e\u0433:"
        contentPane.add(label5, "cell 34 26 2 1")

        //---- label6 ----
        label6!!.text = "text"
        contentPane.add(label6, "cell 37 26")

        //---- button1 ----
        button1!!.text = "text"
        contentPane.add(button1, "cell 1 29")
        pack()
        setLocationRelativeTo(owner)
    }
}