package org.example;

public class Cat {

    private String name;
    private int appetite;
    private boolean starvation = true;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        starvation = plate.decreaseFood(appetite);
    }

    public void getHungerStatus(){
        if (starvation == false){
            System.out.println("не голоден!");
        }
        else {
            System.out.println("голоден!");
        }
    }

    public String getName() {
        return name;
    }

}
