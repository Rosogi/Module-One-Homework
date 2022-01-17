package org.example;

public class Worker {

    private String firstName;
    private String secondName;
    private String fatherName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    //Заменяем автоматически созданый конструктор по умолчанию своим
    public Worker(){
        this.firstName = "Неизвестно";
        this.secondName = "Неизвестно";
        this.fatherName = "Неизвестно";
        this.position = "Неизвестно";
        this.email = "Неизвестно";
        this.phoneNumber = "Неизвестно";
        this.salary = 0;
        this.age = 0;
    }
    //Конструктор для создания сотрудника
    public Worker(String firstName, String secondName, String fatherName, String position, String email, String phoneNumber,int salary, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("Сотрудник: " + secondName + " " + firstName + " " + fatherName + " занимает должность " + position);
        System.out.println("Контакты: email-" + email + ", телефон-" + phoneNumber);
        System.out.println("Другая информация: зарплата-" + salary + ", возраст-" + age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
