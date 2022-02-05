package peaksoft.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.entity.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.hibernate.cfg.Environment.*;
public class Util {
    private static final String url = "jdbc:postgresql://localhost:5432/school";
    private static final String user = "postgres";
    private static final String password = "12345";

    public Connection connection() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private static SessionFactory sessionFactory;

    public SessionFactory factory() {
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/school");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "12345");
        configuration.setProperty(HBM2DDL_AUTO, "create");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
        configuration.setProperty(SHOW_SQL, "true");
        configuration.addAnnotatedClass(Car.class);
        configuration.addAnnotatedClass(Company.class);
        configuration.addAnnotatedClass(Garage.class);
        configuration.addAnnotatedClass(Person.class);
        configuration.addAnnotatedClass(SocialMedia.class);
        sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }

    public static void exit() {
        sessionFactory.close();
    }
}


