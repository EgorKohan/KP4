package kp.DAO;

import kp.entity.Account;
import kp.entity.Admin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO extends AbstractDAO<String, Admin> {

    private static final String SQL_READ_FROM_DB =
            "SELECT * FROM admins WHERE adminLogin = ?";
    private static final String SQL_GET_ALL_RECORDS =
            "SELECT * FROM admins";

    public AdminDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(Admin admin) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Admin read(String s) {
        Admin admin = null;
        try {
            PreparedStatement prep = connection.prepareStatement(SQL_READ_FROM_DB);
            prep.setString(1, s);
            ResultSet res = prep.executeQuery();
            res.next();
            Account account = new Account(res.getString("adminLogin"), "12345");
            admin = new Admin("Valera", "Sich", 78, account);
            close(prep);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
    }

    @Override
    public boolean update(Admin admin) {
        return false;
    }

    @Override
    public boolean delete(Admin admin) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Admin> getAll() {
        List<Admin> admins = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL_GET_ALL_RECORDS);
            Account account = null;
            while (resultSet.next()) {
                account = new Account(
                        resultSet.getString("adminLogin"),
                        "12345");
                admins.add(new Admin(
                                "Egor",
                                "Kokhan",
                                18,
                                account
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admins;
    }
}
