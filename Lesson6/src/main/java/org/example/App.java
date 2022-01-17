package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Dog dog = new Dog();
        dog.setName("Bobik");

        Cat cat = new Cat();
        cat.setName("Murzik");

        dog.run(450);
        dog.swim(9);

        cat.run(250);
        cat.swim(1);

    }
}
