package ar.com.ada.billeteravirtual;
import java.util.logging.Level;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class AppManager {
    protected SessionFactory sessionFactory;

    protected void setup() {

        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings
                                                                                                  // from
                                                                                                  // hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
            throw ex;
        }
        
    }

    protected void exit() {
        sessionFactory.close();
    }

    protected void create(App app) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(app);
  
        session.getTransaction().commit();
        session.close();
    }

    public App read(int appId) {
        Session session = sessionFactory.openSession();

        App app = session.get(App.class, appId);

        session.close();

        return app;
    }

    public App read(String appId){
        Session session = sessionFactory.openSession();

        App app = session.get(App.class, appId);

        session.close();

        return app;
    }

    protected void update(App appEncontrada) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(appEncontrada);

        session.getTransaction().commit();
        session.close();
    }
}
