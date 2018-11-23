package ua.org.oa.nikolajred;

public class Car {
    static int height;
    static int weight;
    static int speed;
    static double time;
    static String color;
    static  String name;
    static char classCar;

    public Car(int height, int weight, int speed,double time, String color, String name, char classCar){
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.time = time;
        this.color = color;
        this.name = name;
        this.classCar = classCar;
    }

    // this method show distance has been traveled by car

    public  static int carTraveledWay(int speed, double time){
        int carTraveledWay = (int) (speed * time);
        System.out.println("I traveled " + carTraveledWay + " kilometers for "+ time +" hour whith speed " + speed + " km/h");

        if (speed > 130){
            System.out.println("I'm law-abiding car");
            System.out.println("                                            ");
        }else {
            System.out.println("I'm traffic offender");
            System.out.println("                                            ");
        }
        return carTraveledWay;
    }

    // this method show information about car
    public void informationMessenger(){
        System.out.println("I'm a car, my name is " + name);
        System.out.println("My height is " + height + " centimeters");
        System.out.println("My weight is " + weight + " kilograms");
        System.out.println("My color is " + color);
        System.out.println("My class is " + classCar);

    }
}
