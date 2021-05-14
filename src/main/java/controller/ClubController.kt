package controller

import abstracts.AbstractController
import data.entity.Club
import org.hibernate.SessionFactory
import service.ClubService
import view.ClubForm

class ClubController(view: ClubForm, factory: SessionFactory) :
    AbstractController<Club, ClubForm>(view = view, service = ClubService(factory), mock = Club()) {

    override fun fromUIToApp(entity: Club, form: ClubForm) {
        with(entity) {
            with(form) {
                phone = textComponents["phone"]?.text
                specialization = textComponents["specialization"]?.text
                city = textComponents["city"]?.text
                street = textComponents["street"]?.text
                houseNumber = textComponents["houseNumber"]?.text?.toInt()
            }
        }
    }

    override fun fromAppToUI(form: ClubForm, entity: Club) {
        with(entity) {
            with(form) {
                textComponents["phone"]?.text = phone
                textComponents["specialization"]?.text = specialization
                textComponents["city"]?.text = city
                textComponents["street"]?.text = street
                textComponents["houseNumber"]?.text = houseNumber.toString()
            }
        }
    }

    override fun clean() {
        with(view) {
            textComponents["phone"]?.text = ""
            textComponents["specialization"]?.text = ""
            textComponents["city"]?.text = ""
            textComponents["street"]?.text = ""
            textComponents["houseNumber"]?.text = ""
        }
    }
}