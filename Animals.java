/**
 * Java 1. Home work 6
 *
 * @author ToBapuW
 * @version dated August 30, 2018
 */

public class Animals {
    public static void main(String[] args) {
        Cat cat = new Cat("Matroskin", "Gray", 5);
        System.out.println(cat + " run "+ cat.run() + "m, " + " swim " + cat.swim() + "m, " + " Jump " + cat.jump() + "m");
        if(cat.jump()<= 2)
            System.out.println(true);




        Dog dog = new Dog("Sharik", "Brown", 7);
        System.out.println(dog + " run "+ dog.run() + "m, " + " swim " + dog.swim() + "m, " + " Jump " + dog.jump() + "m" );
        if(dog.jump()<= 0.5)
            System.out.println(true);
    }
}

class Cat extends Animal{
    Cat(String name, String color, int age){
        super(name, color, age);
    }
    @Override
    public int run(){
        return 200;
    }
    @Override
    public double jump(){
        return 2;
    }


}


class Dog extends Animal{
    Dog(String name, String color, int age){
        super(name, color, age);
    }
    @Override
    public int run(){
        return 500;
    }
    @Override
    public double jump(){
        return 0.5;
    }
    @Override
    public int swim(){
        return 10;
    }
}


class Animal{
    String name;
    String color;
    int age;

    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

   public int run(){
        return 0;
    }

    public int swim(){
        return 0;
    }

    public double jump(){
        return 0;
    }

    public int canDoIt(){
        return 0;
    }

    @Override
    public String toString(){
        return name + " , " + color + " ," + age;
    }
}