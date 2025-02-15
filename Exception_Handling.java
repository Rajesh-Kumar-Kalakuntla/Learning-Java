import java.util.*;
public class Exception_Handling{
   static void checkAge(int age) throws Exception {
            if(age>=18){
               System.out.println("valid-age Access Granted");
            }
            else {
               throw new Exception("under-age Access Denied");
            }
   }
    public static void main(String[] args){

       try(Scanner sc = new Scanner(System.in)){
         System.out.println("enter your age :");
         int age = sc.nextInt();
          checkAge(age);
       try { 
        //if a invalid value like string is entered then an exception occurs because of int datatype the values should be integers
       System.out.println("enter a number :");
       int a = sc.nextInt();
       System.out.println("enter a number except 0 :");
       int b = sc.nextInt();

       try{
     //if the result is undefined such as 1/0 then an exception occurs
        float result = (float)a/b;
        System.out.println(result);
       }
       catch(Exception e){
        System.out.println("not valid a valid number");
        throw e;
       }

       }
       catch(Exception e){
        System.out.println("not a valid value!!");
        throw e;
       }
       finally {
        System.out.println(" execution is completed or stopped");
       }

     }
    catch(Exception e){
          System.out.println("Error: " + e.getMessage());
    }
}
}