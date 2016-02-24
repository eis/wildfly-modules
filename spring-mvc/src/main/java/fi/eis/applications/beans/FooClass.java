package fi.eis.applications.beans;

import java.sql.SQLException;

import javax.sql.DataSource;

public class FooClass implements FooInterface {
    private DataSource obj;

    public FooClass(DataSource ds) {
        this.obj = ds;
    }

    /*
     * (non-Javadoc)
     * 
     * @see fi.eis.applications.beans.FooInterface#getMessage()
     */
    public String getMessage() {
        try {
            return "Hello from " + obj.getConnection();
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
