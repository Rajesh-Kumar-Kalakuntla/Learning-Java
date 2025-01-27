abstract class Vechile {
    abstract void start();
    abstract void drive();
}
class Car extends Vechile{
    @Override
    public void start(){
        System.out.println("starting");
    }
    @Override
    public void drive(){
        System.out.println("driving");
    }
}
public class Abstraction_abstractClass {
public static void main(String[] args) {
    Vechile car1 = new Car();
    car1.start();
    car1.drive();
}
}