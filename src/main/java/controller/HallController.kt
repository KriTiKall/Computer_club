package controller

import abstracts.AbstractController
import data.entity.Club
import data.entity.Hall
import org.hibernate.SessionFactory
import service.HallService
import view.HallForm
import javax.swing.JComboBox

class HallController(view: HallForm, factory: SessionFactory) :
    AbstractController<Hall, HallForm>(view = view, service = HallService(factory), mock = Hall()) {

    private val hallService = HallService(factory)

    init {
        val comboClub = view.comboComponents.get("club") as JComboBox<Club>?
        hallService.getClubs().forEach { comboClub?.addItem(it) }
    }

    override fun fromUIToApp(entity: Hall, form: HallForm) {
        with(entity) {
            with (form) {
                club = comboComponents["club"]?.selectedItem as Club
                name = textComponents["name"]?.text
                status = textComponents["status"]?.text
            }
        }
    }

    override fun fromAppToUI(form: HallForm, entity: Hall) {
        with(entity) {
            with (form) {
                comboComponents["club"]?.selectedItem = club
                textComponents["name"]?.text = name
                textComponents["status"]?.text = status
            }
        }
    }

    override fun clean() {
        with (view) {
            comboComponents["club"]?.selectedItem = 0
            textComponents["status"]?.text = ""
            textComponents["name"]?.text = ""
        }
    }
}