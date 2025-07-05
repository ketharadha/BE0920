package com.chicoo.be0920.module2.oops.polymorphism.dynamicorruntime;


/**
 * The ability of objects taking different forms.
 * Also called method overriding.
 * Decision is made at run time.
 * Same method name and signature, but behavior is defined in the child class.
 */
public class PolymorphismStarter {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.movement();

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.movement();
        cat.movement();
        bird.movement();
    }
}
