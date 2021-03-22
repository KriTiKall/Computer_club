import data.dao.ClientDao
import data.entity.Client
import org.hibernate.cfg.Configuration
import org.jboss.jandex.Main
import view.MainForm
import view.SigInForm


fun main() {

    val form = SigInForm()
    form.createUI()

}