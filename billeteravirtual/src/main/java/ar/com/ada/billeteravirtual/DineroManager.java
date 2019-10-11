package ar.com.ada.billeteravirtual;

import java.util.logging.Level;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class DineroManager {
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

    protected void create(Dinero dinero) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(dinero);
  
        session.getTransaction().commit();
        session.close();
    }

    public Dinero read(int dineroId) {
        Session session = sessionFactory.openSession();

        Dinero dinero = session.get(Dinero.class, dineroId);

        session.close();

        return dinero;
    }

    public Dinero read(String dineroId){
        Session session = sessionFactory.openSession();

        Dinero dinero = session.get(Dinero.class, dineroId);

        session.close();

        return dinero;
    }

    protected void update(Dinero dineroEncontrado) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(dineroEncontrado);

        session.getTransaction().commit();
        session.close();
    }
}
