import kp.DAO.AdminDAO;
import kp.DAO.ConnectorDB;
import kp.entity.Admin;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Admin> admins = new ArrayList<>();
        try {
            Connection connection = ConnectorDB.getConnection();
            AdminDAO adminDAO = new AdminDAO(connection);
            admins = adminDAO.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (Admin admin :
                admins) {
            System.out.println(admin);
        }
    }
}


