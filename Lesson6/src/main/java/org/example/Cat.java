package org.example;

public class Cat extends Animal{
    @Override
    public void run(int meters){
        if (meters > 200){
            System.out.println(getName() + " не смог(ла) пробежать столько :(" );
        }
        else {
            System.out.println(getName() + " пробежал " + meters + " метров!");
        }
    }

    @Override
    public void swim(int meters){
        System.out.println("Кошки не умеют плавать :(");
    }
}
