package org.example;

public class Cat{
    private String name;
    private String color;
    private int age;

    public Cat(){
        this.name = "Неизвестно";
        this.color = "неизвестно";
        this.age = 1;
    }

    public Cat(String name){
        this.name = name;
        this.color = "неизвестно";
        this.age = 1;
    }

    public Cat(String name, String color){
        this.name = name;
        this.color = color;
        this.age = 1;
    }

    public Cat(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Вы ввели некоретный возраст!");
        }
        else {
            this.name = name;
        }
    }
}
