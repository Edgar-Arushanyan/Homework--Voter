package Homework;

public class Main {
    //Создать класс Voter (Избиратель) , содержащий поля имя, адрес, возраст
    // а также конструктор, геттеры и сеттеры.
    // При создании должно быть учтено,
    // что минимальный возраст в Германии для участия в выборах - 16 лет.

    public static void main(String[] args) {

        Voter voter = new Voter("Nick","Berlin",16);


       System.out.println("Voter's name is "+voter.getName());
        System.out.println("Voter's address is "+voter.getAddress());
        System.out.println("Voter's age is "+voter.getAge());

        voter.setAge(14);

        System.out.println("Voter age is "+voter.getAge());








    }



}
