package ua.org.oa.nikolajred;

public class SuperCar {
    public static void main(String[] args) {
        Car car = new Car(120, 500, 70, 3.40, "red", "commonCar", 'a');
        car.informationMessenger();
        car.carTraveledWay(70, 3.40);

        Car carBMW = new Car(150, 600, 100, 3.40, "black", "BMW", 'c');
        carBMW.informationMessenger();
        carBMW.carTraveledWay(100, 3.40);


        Car carFord = new Car(160, 700, 140, 3.40, "white", "Ford",'d');
        carFord.informationMessenger();
        carFord.carTraveledWay(120, 3.40);
    }
}
