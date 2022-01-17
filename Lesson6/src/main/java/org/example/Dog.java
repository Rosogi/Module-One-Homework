package org.example;

public class Dog extends Animal{
    @Override
    public void run(int meters){
        if (meters > 500){
            System.out.println(getName() + " не смог(ла) пробежать столько :(" );
        }
        else {
            System.out.println(getName() + " пробежал " + meters + " метров!");
        }
    }

    @Override
    public void swim(int meters){
        if (meters > 10){
            System.out.println(getName() + " не смог(ла) проплыть столько :(");
        }
        else {
            System.out.println(getName() + " проплыл " + meters + " метров!");
        }
    }
}
