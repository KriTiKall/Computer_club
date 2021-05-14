package view

import java.awt.Color
import java.awt.Font
import javax.swing.*
import javax.swing.WindowConstants.EXIT_ON_CLOSE

class LoginForm {

    companion object {
        const val SCREEN_HEIGHT = 1080
        const val SCREEN_WIDTH = 1920

        const val WINDOW_HEIGHT = 360
        const val WINDOW_WIDTH = 480

        const val DEFAULT_FONT_SIZE = 14

        const val FONT_NAME = "Arial"
    }

    val frMain = JFrame()
    val lSignin = JLabel("Gamer club")
    val lLogin = JLabel("Логин")
    val tfLogin = JTextField()
    val lPassword = JLabel("Пароль")
    val pfPassword = JPasswordField()
    val lMsg = JLabel()
    val bSignin = JButton("Войти")
    val bSignUp = JButton("Регистрация")

    fun createUI() {
        frMain.apply {
            setLocation((SCREEN_WIDTH - WINDOW_WIDTH) / 2, (SCREEN_HEIGHT - WINDOW_HEIGHT) / 2)
            layout = null
            title = "Добро пожаловать"
            defaultCloseOperation = EXIT_ON_CLOSE
            isVisible = true
            isResizable = false
            contentPane.background = Color(0xD7DDFF)
            setSize(WINDOW_WIDTH, WINDOW_HEIGHT)
        }

        lSignin.apply {
            setSize(150, 50)
            setLocation((WINDOW_WIDTH - 150) / 2, 10)
            font = Font(FONT_NAME, Font.PLAIN, 24)
            isVisible = true
        }

        lLogin.apply {
            setSize(100, 20)
            setLocation(WINDOW_WIDTH / 2 - 80, 100)
            font = Font(FONT_NAME, Font.PLAIN, DEFAULT_FONT_SIZE)
            isVisible = true
        }

        tfLogin.apply {
            setSize(120, 20)
            setLocation(WINDOW_WIDTH / 2, 100)
            isVisible = true
            background = Color(0xF3F3FF)
        }

        lPassword.apply {
            setSize(100, 20)
            setLocation(WINDOW_WIDTH / 2 - 80, 140)
            font = Font(FONT_NAME, Font.PLAIN, DEFAULT_FONT_SIZE)
            isVisible = true
        }

        pfPassword.apply {
            setSize(120, 20)
            setLocation(WINDOW_WIDTH / 2, 140)
            isVisible = true
            background = Color(0xF3F3FF)
        }

        with(lMsg) {
            setSize(210, 20)
            setLocation(WINDOW_WIDTH / 2 - 80, 170)
            foreground = Color.RED
        }

        bSignin.apply {
            setSize(100, 20)
            setLocation((WINDOW_WIDTH - 100) / 2 - 60, 240)
            font = Font(FONT_NAME, Font.PLAIN, DEFAULT_FONT_SIZE)
            background = Color(0xC2D8FF)
            isVisible = true
        }

        bSignUp.apply {
            setSize(140, 20)
            setLocation((WINDOW_WIDTH - 100) / 2 + 60, 240)
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
            add(lMsg)
            add(bSignin)
            add(bSignUp)
        }
    }
}