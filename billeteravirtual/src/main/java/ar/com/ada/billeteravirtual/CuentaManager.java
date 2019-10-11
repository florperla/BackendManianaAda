package ar.com.ada.billeteravirtual;

import java.util.logging.Level;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class CuentaManager {
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

    protected void create(Cuenta cuenta) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(cuenta);
  
        session.getTransaction().commit();
        session.close();
    }

    public Cuenta read(int cuentaId) {
        Session session = sessionFactory.openSession();

        Cuenta cuenta = session.get(Cuenta.class, cuentaId);

        session.close();

        return cuenta;
    }

    public Cuenta read(String cuentaId){
        Session session = sessionFactory.openSession();

        Cuenta cuenta = session.get(Cuenta.class, cuentaId);

        session.close();

        return cuenta;
    }

    protected void update(Cuenta cuentaEncontrada) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(cuentaEncontrada);

        session.getTransaction().commit();
        session.close();
    }
}
