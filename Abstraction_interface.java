
interface ATM{
    void withdraw();
    void cash_Counting();
}
class Sbi_Atm implements ATM{
    public void withdraw(){
        System.out.println("withdrawing cash");
    }
    public void cash_Counting(){
          System.out.println("cash Counting");
    }
}
public class Abstraction_interface {
    public static void main(String[] args) {
        ATM atm = new Sbi_Atm();
          atm.withdraw();
          atm.cash_Counting();
    }
}