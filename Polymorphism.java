//POLYMORPHISM BY METHOD_OVERLOADING
class Calculator {
   public void add(int a , int b){
       System.out.println(a+b);
   }
   public void add(double a , double b){
       System.out.println(a+b);
   }
}
//POLYMORPHISM BY METHOD_OVERRIDING
class Iphone_16{
 public void processor(){
    System.err.println("IOS " + 17);
 }
   public void camera(int b){
         System.out.println(b + " megapixels camera for Iphone 16");
   }
}
class Iphone_17 extends Iphone_16{
    @Override
   public void camera(int b) {
        System.out.println( b + " megapixles camera for Iphone 17");
   }
}
public class Polymorphism {
    public static void main(String[] args) {
        Calculator sum = new Calculator();
        //Polymorphism with Method_Overloading
        sum.add(100,43);
        sum.add(20.45d,31.56d);

        //Ploymorphism with Method_OVERRIDING
        Iphone_16 iphone16 = new Iphone_16();
        System.out.println("Iphone 16");
        iphone16.processor();
        iphone16.camera(10);
         
        Iphone_17 iphone17 = new Iphone_17();
        System.out.println("Iphone 17");
        iphone17.processor();
        iphone17.camera(12);

    }
}