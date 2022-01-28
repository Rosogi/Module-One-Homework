package org.example;

public class Plate {

    private int food;
    public Plate(int food){
        this.food = food;
    }

    public void info(){
        System.out.println("В тарелке " + food + " еды");
    }

    public boolean decreaseFood(int n){
        if (n > food){
            System.out.println("В миске недостаточно еды!");
            return true;
        }
        else {
            food = food - n;
            return false;
        }
    }

    public void addFood(int n){
        food = food + n;
    }

}
