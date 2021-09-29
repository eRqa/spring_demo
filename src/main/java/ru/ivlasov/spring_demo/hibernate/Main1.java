package ru.ivlasov.spring_demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ivlasov.spring_demo.hibernate.entity.Employee;

public class Main1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session s = factory.getCurrentSession();

            Employee e = Employee.of("Pavel", "Vlasov", "IT", 120000);

            s.beginTransaction();
            s.save(e);
            s.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
