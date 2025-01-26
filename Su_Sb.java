public class Su_Sb {
public static void main(String[] args) {
    @SuppressWarnings("StringBufferMayBeStringBuilder")
    StringBuffer sb = new StringBuffer("Hello world");
    StringBuffer s1 = new StringBuffer("Hello");
    StringBuilder su = new StringBuilder("hello");
    System.out.println(su.append(" world"));
    System.out.println(sb.length());
    System.out.println(sb.reverse());
    System.out.println(sb.compareTo(s1));
    System.out.println(sb.equals(s1));
    System.out.println(sb.insert(11," String Buffer" ));
    System.out.println(sb.delete(5,11));
    System.out.println(sb.deleteCharAt(3));
}
}