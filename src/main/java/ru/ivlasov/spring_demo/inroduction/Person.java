package ru.ivlasov.spring_demo.inroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Pet pet;
    private int age;

    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
