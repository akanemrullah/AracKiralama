import core.Db;
import core.Helper;
import view.LoginView;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection con = Db.getInstance();
        LoginView loginView = new LoginView();
        Helper.setTheme();
    }
}