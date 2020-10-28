public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  //1
  public BankAccount(double b, int id, String pw){
    balance=b;
    accountID=id;
    password=pw;
  }
  //2
  public int getaccountID(){
    return accountID;
  }
  public double balance(){
    return balance;
  }
}
