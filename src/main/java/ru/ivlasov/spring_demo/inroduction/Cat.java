package ru.ivlasov.spring_demo.inroduction;

public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("Meow");
    }
}
