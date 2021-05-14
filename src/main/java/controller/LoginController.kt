package controller

import data.entity.User
import org.hibernate.SessionFactory
import org.hibernate.cfg.Configuration
import service.AuthService
import view.LoginForm
import view.MainForm
import view.RegisterForm
import java.awt.event.ActionListener

class LoginController(
    private val view: LoginForm,
    private val factory: SessionFactory
) {

    private val service = AuthService(factory)

    fun initView() {
        with(view) {
            bSignin.addActionListener(actionOfSignIn())
            bSignUp.addActionListener(actionOfSignUp())
        }

        view.createUI()
    }

    private fun actionOfSignIn() = ActionListener {
        val current = composeUser()

        if (validate(current)) {
            initForm()
            view.frMain.dispose()
        }
    }

    private fun actionOfSignUp() = ActionListener {
        view.frMain.dispose()

        val form = RegisterForm()
        val controller = RegisterController(form, factory)
        controller.initView()
    }

    private fun initForm() {
        val form = MainForm()
        val controller = MainController(form, factory)
        controller.initView()
    }

    private fun validate(user: User): Boolean {
        if (isEmptyField()) {
            view.lMsg.text = "Не все поля заполнены"
            return false
        }
        if (!service.passwordCheck(user)) {
            view.lMsg.text = "Неверный логин или пароль"
            return false
        }
        return true
    }

    private fun composeUser(): User =
        User().apply {
            login = view.tfLogin.text
            password = view.pfPassword.text.hashCode()
        }

    private fun isEmptyField() =
        view.tfLogin.text == "" || view.pfPassword.text == ""
}