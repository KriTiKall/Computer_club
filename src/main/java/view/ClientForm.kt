package view

import abstracts.AbstractForm
import data.entity.Client
import data.entity.Computer
import javax.swing.*

class ClientForm : AbstractForm<Client>("Клиент") {


    init {
        components = mapOf(
            "computer" to JLabel("Компьютер"),
            "nickname" to JLabel("Ник"),
            "firstname" to JLabel("Имя"),
            "lastname" to JLabel("Фамилия"),
            "link" to JLabel("Соц. сети"),
            "mail" to JLabel("Почта"),
            "cost" to JLabel("Сумма"),
        )

        textComponents = mapOf(
            "nickname" to JTextField(),
            "firstname" to JTextField(),
            "lastname" to JTextField(),
            "link" to JTextField(),
            "mail" to JTextField(),
            "cost" to JTextField(),
        )

        comboComponents = mapOf(
            "computer" to JComboBox<Computer>()
        )
    }

}