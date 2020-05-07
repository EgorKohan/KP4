package kp.DAO;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class AbstractDAO<Key, Entity extends Serializable> {
    protected Connection connection;

    public AbstractDAO(Connection connection) {
        this.connection = connection;
    }

    abstract boolean create(Entity entity);

    abstract Entity read(Key key);

    abstract boolean update(Entity entity);

    abstract boolean delete(Entity entity);

    abstract boolean delete(Key key);

    abstract List<Entity> getAll();

    public void close(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) { // лог о невозможности закрытия Statement
            e.printStackTrace();
        }
    }

}
