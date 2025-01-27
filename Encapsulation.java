class Person {
    private	String name;
    //setters and getters by some conditions to access the private fields or methods
     public void setname(String name) {
    	   this.name = name;
     }
     public void getname() {
    	 System.out.println(this.name);
     }
}
public class Encapsulation {
//Encapsulation is used for controlling access
	public static void main(String[] args) {
       Person p1 = new Person();
       Person p2 = new Person();
       p1.setname("ram");
       p2.setname("rajesh");
       p1.getname();
       p2.getname();
	}

}
