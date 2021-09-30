package ru.ivlasov.spring_demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.ivlasov.spring_demo.hibernate.entity.Employee;

public class Main2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session s = factory.getCurrentSession();

            Employee e = Employee.of("Elena", "Petrova", "sales", 250000);

            s.beginTransaction();
            s.save(e);
            s.getTransaction().commit();

            int eId = e.getId();
            s = factory.getCurrentSession();
            s.beginTransaction();
            Employee eFromDB = s.get(Employee.class, eId);
            s.getTransaction().commit();
            System.out.println(eFromDB);
        } finally {
            factory.close();
        }
    }
}
