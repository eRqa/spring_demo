package ru.ivlasov.spring_demo.inroduction;
/*
Классический вариант создания объектов без Spring Container
 */
public class ObjWithoutContainer {
    public static void main(String[] args) {
        Pet charlie = new Dog();
        charlie.say();

        Pet bylka = new Cat();
        bylka.say();
    }
}
