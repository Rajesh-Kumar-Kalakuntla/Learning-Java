public class Strings {
     public static void main(String[] args) {
        String s1 = "Hello world"; 
        String s2 ="hello";
        String s3 = ""; 
        String s4 =" ";
            System.out.println(s1.startsWith("h")); 
            System.out.println(s1.endsWith("d")); 
            System.out.println(s1.toUpperCase());
            System.out.println(s1.toLowerCase()); 
            System.out.println(s1.equals("Hello World")); 
            System.out.println(s1.equalsIgnoreCase("Hello World")); 
            System.out.println(s1.indexOf("l")); 
            System.out.println(s1.lastIndexOf("l")); 
            System.out.println(s1.replace("l","p"));
            System.out.println(s1.replaceAll("l","p")); 
            System.out.println(s1.trim()); 
            System.out.println(s1.length()); 
            System.out.println(s1.charAt(0)); 
            System.out.println(s1.toCharArray()); 
            String a[] = s1.split("h" , 5); 
            System.out.println(a.toString()); 
            System.out.println(s1.contains(s2)); 
            System.out.println(s3.isEmpty()); 
            System.out.println(s4.isBlank()); 
            System.out.println(s1.substring(5,11)); 
            System.out.println(s1.hashCode()); 
            s1 = s1 + "world"; 
            System.out.println(s1.hashCode()); 
        }
     }
