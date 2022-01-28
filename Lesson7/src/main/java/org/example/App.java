package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурзик", 20);
        cats[1] = new Cat("Барсик", 15);
        cats[2] = new Cat("Кузя", 5);
        Plate plate = new Plate(35);
        plate.info();

        for (int i = 0; i < cats.length; i++){
            System.out.println("Сейчас ест: " + cats[i].getName());
            cats[i].eat(plate);
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.print(cats[i].getName() + " ");
            cats[i].getHungerStatus();
        }

        plate.info();
    }
}
