import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManagerFactory;

public class HibernateSessionFactory {

    public static SessionFactory getSessionFactory() {
//        return new Configuration()
//                .configure("hibernate.cfg.xml")
//                .buildSessionFactory();
        EntityManagerFactory em = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        return (SessionFactory) em;

    }
}