public class Tester{
  public static void main(String[] args) {
    BankAccount b1= new BankAccount(23,"password123");
    System.out.println(b1.getAccountID());
    /*b1.setpassword("honeynutcheerios");
    System.out.println(b1.getPassword());*/
    System.out.println(b1.deposit(100.0));
    System.out.println(b1.withdraw(50.0));
    System.out.println(b1.withdraw(-2.0));
    System.out.println(b1.withdraw(51.0));
  }
}
