package ru.ivlasov.spring_demo.inroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
Получение объектов из контейнера
 */
public class objFromContainer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Pet p = context.getBean("myPet", Pet.class);
        p.say();
        context.close();
    }
}
