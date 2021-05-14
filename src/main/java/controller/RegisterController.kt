package controller

import data.entity.User
import org.hibernate.SessionFactory
import service.AuthService
import view.LoginForm
import view.RegisterForm
import java.awt.event.ActionListener

class RegisterController(
    private val view: RegisterForm,
    private val factory: SessionFactory
) {

    private val service = AuthService(factory)

    fun initView() {
        view.apply {
            bBack.addActionListener(actionOfBack())
            bSignUp.addActionListener(actionOfSignUp())
        }

        view.createUI()
    }

    private fun actionOfBack() = ActionListener {
        view.frMain.dispose()

        val form = LoginForm()
        val controller = LoginController(form, factory)
        controller.initView()
    }

    private fun actionOfSignUp() = ActionListener {
        val current = composeUser()

        if (validate(current)) {
            service.create(current)

            view.frMain.dispose()

            val form = LoginForm()
            val controller = LoginController(form, factory)
            controller.initView()
        }
    }

    private fun validate(user: User): Boolean {
        if (isEmptyField()) {
            view.lMsg.text = "Не все поля заполнены"
            return false
        }
        if (!compPassword()) {
            view.lMsg.text = "Пароли не совпадают"
            return false
        }
        if (service.isExist(user)) {
            view.lMsg.text = "Пользователь уже существует"
            return false
        }
        return true
    }

    private fun composeUser(): User =
        User().apply {
            login = view.tfLogin.text
            password = view.pfPassword.text.hashCode()
            admin = view.isAdmin.isSelected
        }

    private fun compPassword() =
        view.pfPassword.text == view.pfRepeat.text

    private fun isEmptyField() =
        view.tfLogin.text == "" || view.pfPassword.text == "" || view.pfRepeat.text == ""
}