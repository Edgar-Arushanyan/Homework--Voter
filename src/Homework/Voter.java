package Homework;

public class Voter {

    private String name;

    private String address;

    private int age;



    public Voter(String name, String address, int age) {
        this.name=name;
        this.address=address;
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age >= 16) {
            this.age = age;
        }else {

            System.out.println("The voter must be from 16 years old ! ");
        }

    }
}




