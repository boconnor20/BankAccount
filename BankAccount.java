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
  public int getAccountID(){
    return accountID;
  }
   public double getBalance(){
    return balance;
  }
  //3
  public void setPassword(String p){
    password=p;
  }
  /*public String getPassword(){
    return password;
  }*/
  //4a
  public boolean deposit(double amount){
    if (amount>=0){
      balance+=amount;
      return true;
    }
    else return false;
  }
  //4b
  public boolean withdraw(double amount){
    if (amount<0||amount>balance){
      return false;
    }
    else {
      balance-=amount;
      return true;
    }
  }
}
