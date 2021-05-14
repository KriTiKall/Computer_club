package view

import abstracts.AbstractForm
import data.entity.Club
import data.entity.Hall
import javax.swing.JComboBox
import javax.swing.JLabel
import javax.swing.JTextField

class HallForm : AbstractForm<Hall>("Зал") {

    init {
        components = mapOf(
            "club" to JLabel("Клюб"),
            "name" to JLabel("Название"),
            "status" to JLabel("Статус"),
        )

        textComponents = mapOf(
            "name" to JTextField(),
            "status" to JTextField(),
        )

        comboComponents = mapOf(
            "club" to JComboBox<Club>()
        )
    }
}