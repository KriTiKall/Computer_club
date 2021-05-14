package view

import abstracts.AbstractForm
import data.entity.Club
import javax.swing.JLabel
import javax.swing.JTextField

class ClubForm : AbstractForm<Club>("Клуб") {

    init {
        components = mapOf(
            "phone" to JLabel("Телефон"),
            "specialization" to JLabel("Тип"),
            "city" to JLabel("Город"),
            "street" to JLabel("Улица"),
            "houseNumber" to JLabel("Здание"),
        )

        textComponents = mapOf(
            "phone" to JTextField(),
            "specialization" to JTextField(),
            "city" to JTextField(),
            "street" to JTextField(),
            "houseNumber" to JTextField(),
        )
    }
}