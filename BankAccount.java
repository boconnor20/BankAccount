public class BankAccount {
  private double balance;
  private int accountID;
  private String password;
  //1
  public BankAccount(int id, String pw){
    balance=0.0;
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
  public void setpassword(String p){
    password=p;
  }
  /*public String getpassword(){
    return password;
  }*/
}
