import controller.ClientController
import controller.LoginController
import data.dao.ClientDao
import org.hibernate.cfg.Configuration
import view.ClientForm
import view.LoginForm


fun main() {

    val sessionFactory = Configuration().configure().buildSessionFactory()


    val form = LoginForm()
    val con = LoginController(form, sessionFactory)
    con.initView()

//    val view = MainForm()
//    view.createUI()
//    val dao = ClientDao(sessionFactory)
//    dao.list.forEach(::println)

}