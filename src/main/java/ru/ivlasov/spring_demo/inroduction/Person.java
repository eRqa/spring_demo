package ru.ivlasov.spring_demo.inroduction;

public class Person {

    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Person() {
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet ");
        pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
