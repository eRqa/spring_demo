package ru.ivlasov.spring_demo.inroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3_ObjWithOtherProperties {

    public static void main(String[] args) {
        //Внедрена зависимость. У Person есть Pet (кот)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person p = context.getBean("myPerson", Person.class);
        p.callYourPet();
        context.close();
    }

}
