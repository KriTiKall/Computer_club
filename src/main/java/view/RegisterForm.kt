package view

import java.awt.Color
import java.awt.Font
import javax.swing.*

class RegisterForm {

    companion object {
        const val SCREEN_HEIGHT = 1080
        const val SCREEN_WIDTH = 1920

        const val WINDOW_HEIGHT = 360
        const val WINDOW_WIDTH = 480

        const val DEFAULT_FONT_SIZE = 14

        const val FONT_NAME = "Arial"
    }

    val frMain = JFrame()
    val lSignin = JLabel("Регистрация пользователя")
    val lLogin = JLabel("Логин")
    val tfLogin = JTextField()
    val lPassword = JLabel("Пароль")
    val pfPassword = JPasswordField()
    val lRepeat = JLabel("Повторите")
    val pfRepeat = JPasswordField()
    val isAdmin = JCheckBox("Администратор")
    val lMsg = JLabel()
    val bBack = JButton("Назад")
    val bSignUp = JButton("Регистрация")

    fun createUI() {
        frMain.apply {
            setLocation((SCREEN_WIDTH - WINDOW_WIDTH) / 2, (SCREEN_HEIGHT - WINDOW_HEIGHT) / 2)
            layout = null
            title = "Регистрация"
            defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
            isVisible = true
            isResizable = false
            contentPane.background = Color(0xD7DDFF)
            setSize(WINDOW_WIDTH, WINDOW_HEIGHT)
        }

        lSignin.apply {
            setSize(350, 50)
            setLocation((WINDOW_WIDTH - 350) / 2, 10)
            font = Font(FONT_NAME, Font.PLAIN, 24) //"TimesRoman"
            isVisible = true
        }

        lLogin.apply {
            setSize(100, 20)
            setLocation(WINDOW_WIDTH / 2 - 90, 90)
            font = Font(FONT_NAME, Font.PLAIN, DEFAULT_FONT_SIZE)
            isVisible = true
        }

        tfLogin.apply {
            setSize(120, 20)
            setLocation(WINDOW_WIDTH / 2, 90)
            isVisible = true
            background = Color(0xF3F3FF)
        }

        lPassword.apply {
            setSize(100, 20)
            setLocation(WINDOW_WIDTH / 2 - 90, 120)
            font = Font(FONT_NAME, Font.PLAIN, DEFAULT_FONT_SIZE)
            isVisible = true
        }

        pfPassword.apply {
            setSize(120, 20)
            setLocation(WINDOW_WIDTH / 2, 120)
            isVisible = true
            background = Color(0xF3F3FF)
        }

        lRepeat.apply {
            setSize(100, 20)
            setLocation(WINDOW_WIDTH / 2 - 90, 150)
            font = Font(FONT_NAME, Font.PLAIN, DEFAULT_FONT_SIZE)
            isVisible = true
        }

        pfRepeat.apply {
            setSize(120, 20)
            setLocation(WINDOW_WIDTH / 2, 150)
            isVisible = true
            background = Color(0xF3F3FF)
        }

        isAdmin.apply {
            setSize(150, 20)
            setLocation(WINDOW_WIDTH / 2 - 85, 180)
            isVisible = true
            background = Color(0xD7DDFF)
        }

        with(lMsg) {
            setSize(210, 20)
            setLocation(LoginForm.WINDOW_WIDTH / 2 - 80, 200)
            foreground = Color.RED
        }

        bBack.apply {
            setSize(100, 20)
            setLocation((WINDOW_WIDTH - 100) / 2 - 60, 250)
            font = Font(FONT_NAME, Font.PLAIN, DEFAULT_FONT_SIZE)
            background = Color(0xC2D8FF)
            isVisible = true
        }

        bSignUp.apply {
            setSize(140, 20)
            setLocation((WINDOW_WIDTH - 100) / 2 + 60, 250)
            font = Font(FONT_NAME, Font.PLAIN, DEFAULT_FONT_SIZE)
            background = Color(0xC2D8FF)
            isVisible = true
        }

        frMain.apply {
            add(lSignin)
            add(lLogin)
            add(tfLogin)
            add(lPassword)
            add(pfPassword)
            add(lRepeat)
            add(pfRepeat)
            add(isAdmin)
            add(lMsg)
            add(bBack)
            add(bSignUp)
        }
    }
}