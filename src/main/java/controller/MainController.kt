package controller

import org.hibernate.SessionFactory
import view.*
import java.awt.event.ActionListener

class MainController(view: MainForm, factory: SessionFactory) {

    private val view = view
    private val factory = factory

    fun initView() {
        with(view) {
            bClient.addActionListener(showClientForm())
            bComputer.addActionListener(showComputerForm())
            bClub.addActionListener(showClubForm())
            bHall.addActionListener(showHallForm())

            bLogOut.addActionListener(doLogout())
        }

        view.createUI()
    }

    private fun showClientForm() = ActionListener {

        val form = ClientForm()
        val con = ClientController(form, factory)
        con.initView()
    }

    private fun showComputerForm() = ActionListener {

        val form = ComputerForm()
        val con = ComputerController(form, factory)
        con.initView()
    }

    private fun showHallForm() = ActionListener {

        val form = HallForm()
        val con = HallController(form, factory)
        con.initView()
    }

    private fun showClubForm() = ActionListener {

        val form = ClubForm()
        val con = ClubController(form, factory)
        con.initView()
    }

    private fun doLogout() = ActionListener {
        view.frMain.dispose()

        val form = LoginForm()
        val con = LoginController(form, factory)
        con.initView()
    }
}