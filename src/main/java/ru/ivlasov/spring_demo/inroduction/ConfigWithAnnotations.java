package ru.ivlasov.spring_demo.inroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("ApplicationContextAnnot.xml");

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        Person person = context.getBean("person", Person.class);
        person.callYourPet();

        context.close();
    }
}
