import business.UserManager;
import core.Db;
import core.Helper;
import view.AdminView;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {

        Connection con = Db.getInstance();
        //LoginView loginView = new LoginView();
        Helper.setTheme();
        UserManager userManager = new UserManager();
        AdminView adminView = new AdminView(userManager.findByLogin("admin","1234"));
    }
}