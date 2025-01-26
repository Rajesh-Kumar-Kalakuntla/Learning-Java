
class Car1{
    String Brand = "Rolls Royce";
    String Engine = "V-8";
    String Color = "black";
    public void Drive(){
        System.out.println("Drive");
    }
    public void Break(){
        System.out.println("Break");
    }
}  
class Car2 extends Car1 {
        String Brand = "BMW";
        String Color = "white";
        public void AI(){
            System.out.println("Auto-poilet");
        }
}

public class Inheritance{
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        Car2 car2 = new Car2();
        System.out.println("Car1 Info");
        System.out.println(car1.Brand);
        System.out.println(car1.Engine);
        System.out.println(car1.Color);
        car1.Drive();
        car1.Break();
        System.out.println("Car2 Info");
        System.out.println(car2.Brand);
        System.out.println(car2.Engine);
        System.out.println(car2.Color);
        car2.Drive();
        car2.Break();
        car2.AI();

    }
}
