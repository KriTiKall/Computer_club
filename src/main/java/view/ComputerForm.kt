package view

import abstracts.AbstractForm
import data.entity.Club
import data.entity.Computer
import data.entity.Hall
import javax.swing.JComboBox
import javax.swing.JLabel
import javax.swing.JTextField

class ComputerForm : AbstractForm<Computer>("Компьютер") {

    init {
        components = mapOf(
            "hall" to JLabel("Зал"),
            "videoCard" to JLabel("Видеокарта"),
            "processor" to JLabel("Процессор"),
            "mouse" to JLabel("Мышь"),
            "keyboard" to JLabel("Клавиатура"),
            "level" to JLabel("Уровень"),
            "status" to JLabel("Статус"),
        )

        textComponents = mapOf(
            "videoCard" to JTextField(),
            "processor" to JTextField(),
            "mouse" to JTextField(),
            "keyboard" to JTextField(),
            "level" to JTextField(),
            "status" to JTextField(),
        )

        comboComponents = mapOf(
            "hall" to JComboBox<Hall>()
        )
    }
}