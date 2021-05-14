package view

import java.awt.Color
import java.awt.Font
import javax.swing.*


class MainForm {

    companion object {
        const val SCREEN_HEIGHT = 1080
        const val SCREEN_WIDTH = 1920

        const val WINDOW_HEIGHT = 400
        const val WINDOW_WIDTH = 600

        const val DEFAULT_FONT_SIZE = 14
    }

    val frMain = JFrame()

    val lHeader = JLabel("Главное меню")

    val lClient = JLabel("Таблица клиент")
    val bClient = JButton("Редактировать")

    val lClub = JLabel("Таблица клуб")
    val bClub = JButton("Редактировать")

    val lHall = JLabel("Таблица отдел")
    val bHall = JButton("Редактировать")

    val lComputer = JLabel("Таблица компьтер")
    val bComputer = JButton("Редактировать")

    val bLogOut = JButton("Сменить пользователя")

    fun createUI() {
        frMain.apply {
            setLocation((SCREEN_WIDTH - WINDOW_WIDTH) / 2, (SCREEN_HEIGHT - WINDOW_HEIGHT) / 2)
            layout = null
            title = "Окно редактирования"
            defaultCloseOperation = WindowConstants.DISPOSE_ON_CLOSE
            isVisible = true
            isResizable = false
            contentPane.background = Color(0xD7DDFF)
            setSize(WINDOW_WIDTH + 120, WINDOW_HEIGHT)
        }


        with(lHeader) {
            setSize(150, 20)
            setLocation((WINDOW_WIDTH - 30) / 2 , 20)
            font = Font("TimesRoman", Font.PLAIN, DEFAULT_FONT_SIZE + 5)
            isVisible = true
        }

        with(bLogOut) {
            setSize(110, 20)
            setLocation(WINDOW_WIDTH, 20)
            background = Color(0xC2D8FF)
            isVisible = true
        }

        with(lClient) {
            setSize(150, 20)
            setLocation(WINDOW_WIDTH / 2 - 150, 70)
            font = Font("TimesRoman", Font.PLAIN, DEFAULT_FONT_SIZE)
            isVisible = true
        }

        with(bClient) {
            setSize(150, 20)
            setLocation(WINDOW_WIDTH / 2 - 150, 100)
            font = Font("TimesRoman", Font.PLAIN, DEFAULT_FONT_SIZE)
            background = Color(0xC2D8FF)
            isVisible = true
        }

        with(lClub) {
            setSize(150, 20)
            setLocation(WINDOW_WIDTH / 2 + 150, 70)
            font = Font("TimesRoman", Font.PLAIN, DEFAULT_FONT_SIZE)
            isVisible = true
        }

        with(bClub) {
            setSize(150, 20)
            setLocation(WINDOW_WIDTH / 2 + 150, 100)
            font = Font("TimesRoman", Font.PLAIN, DEFAULT_FONT_SIZE)
            background = Color(0xC2D8FF)
            isVisible = true
        }

        with(lComputer) {
            setSize(150, 20)
            setLocation(WINDOW_WIDTH / 2 - 150, 230)
            font = Font("TimesRoman", Font.PLAIN, DEFAULT_FONT_SIZE)
            isVisible = true
        }

        with(bComputer) {
            setSize(150, 20)
            setLocation(WINDOW_WIDTH / 2 - 150, 260)
            font = Font("TimesRoman", Font.PLAIN, DEFAULT_FONT_SIZE)
            background = Color(0xC2D8FF)
            isVisible = true
        }

        with(lHall) {
            setSize(150, 20)
            setLocation(WINDOW_WIDTH / 2 + 150, 230)
            font = Font("TimesRoman", Font.PLAIN, DEFAULT_FONT_SIZE)
            isVisible = true
        }

        with(bHall) {
            setSize(150, 20)
            setLocation(WINDOW_WIDTH / 2 + 150, 260)
            font = Font("TimesRoman", Font.PLAIN, DEFAULT_FONT_SIZE)
            background = Color(0xC2D8FF)
            isVisible = true
        }

        frMain.apply {
            add(lHeader)
            add(bLogOut)
            add(lClient)
            add(bClient)
            add(lClub)
            add(bClub)
            add(lComputer)
            add(bComputer)
            add(lHall)
            add(bHall)
        }
    }
}