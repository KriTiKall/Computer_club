package controller

import abstracts.AbstractController
import data.entity.Client
import data.entity.Computer
import org.hibernate.SessionFactory
import service.ClientService
import view.ClientForm
import javax.swing.JComboBox

class ClientController(view: ClientForm, factory: SessionFactory) :
    AbstractController<Client, ClientForm>(view = view, service = ClientService(factory), mock = Client()) {

    private val clientService = ClientService(factory)

    init {
        val comboComputer = view.comboComponents.get("computer") as JComboBox<Computer>?
        clientService.getComputers().forEach { comboComputer?.addItem(it) }
    }

    override fun fromUIToApp(entity: Client, form: ClientForm) {
        entity.apply {
            form.apply {
                computer = comboComponents["computer"]?.selectedItem as Computer
                nickname = textComponents["nickname"]?.text
                firstName = textComponents["firstname"]?.text
                lastName = textComponents["lastname"]?.text
                link = textComponents["link"]?.text
                mail = textComponents["mail"]?.text
                cost = textComponents["cost"]?.text!!.toInt()
            }
        }
    }

    override fun fromAppToUI(form: ClientForm, entity: Client) {
        entity.apply {
            form.apply {
                comboComponents["computer"]?.selectedItem = computer
                textComponents["nickname"]?.text = nickname
                textComponents["firstname"]?.text = firstName
                textComponents["lastname"]?.text = lastName
                textComponents["link"]?.text = link
                textComponents["mail"]?.text = mail
                textComponents["cost"]?.text= cost.toString()
            }
        }
    }

    override fun clean() {
        view.apply {
            comboComponents["computer"]?.selectedIndex = 0
            textComponents["nickname"]?.text = ""
            textComponents["firstname"]?.text = ""
            textComponents["lastname"]?.text = ""
            textComponents["link"]?.text = ""
            textComponents["mail"]?.text = ""
            textComponents["cost"]?.text= ""
        }
    }
}