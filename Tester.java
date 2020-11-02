public class Tester{
  public static void main(String[] args) {
    BankAccount b1= new BankAccount(23,"password123");
    System.out.println(b1.getAccountID());
    b1.setPassword("honeynutcheerios");
    System.out.println(b1.authenticate("honeynutcheerios"));
    /*System.out.println(b1.getPassword());
    System.out.println(b1.deposit(100.0));
    System.out.println(b1.withdraw(50.0));
    System.out.println(b1.withdraw(-2.0));
    System.out.println(b1.withdraw(51.0));
    System.out.println(b1.toString());*/

    /*//Steven Lei's tester file with some slight modifications
    BankAccount testAcct = new BankAccount(95, "somepassword");
        // to test each case just replace / with /

        // tests for getBalance() and getAccountID()
        System.out.println(testAcct.getBalance());      // should return 0.0
        System.out.println(testAcct.getAccountID());    // should return 95
        testAcct.setPassword("somenewpassword");        // "somepassword" changed to "somenewpassword"
        //

        // tests for deposit()
        System.out.println(testAcct.deposit(-5.23));    // false because can't deposit negative amount
        System.out.println(testAcct.getBalance());      // return 0.0 since no deposit was made because of what said above
        System.out.println(testAcct.deposit(5));        // return true since you can deposit 5
        System.out.println(testAcct.getBalance());      // return 5.0
        System.out.println(testAcct.deposit(0));        // true since you can deposit 0 (0 is non-negative)
        System.out.println(testAcct.getBalance());      // return 5.0
        //

        // tests for withdraw()
        System.out.println(testAcct.withdraw(-5));      // false because can't withdraw negative amount
        System.out.println(testAcct.withdraw(0));       // true since you can deposit 0
        System.out.println(testAcct.getBalance());      // return 5.0
        System.out.println(testAcct.withdraw(5));       // true
        System.out.println(testAcct.withdraw(4));       // false since current balance is 0, can't withdraw more than balance
        System.out.println(testAcct.deposit(45.5));     // true
        System.out.println(testAcct.withdraw(42));      // true
        //

        // tests for toString()
        System.out.println(testAcct.getBalance());      // return 3.5
        System.out.println(testAcct.toString());        // return 95    3.5 (the space is a tab)
        //
        */
        //Mr. K's test case
        /*BankAccount b1 = new BankAccount(1000001, "abc123");
      BankAccount b2 = new BankAccount(1000231, "abcasdg23");

      System.out.println("Account b1:");
      b1.deposit(3000.0);
      b2.deposit(1234.0);
      System.out.println(b1);
      System.out.println("Account b2:");
      System.out.println(b2);
      System.out.println();


      double cashAmount = 300.0;
      while(cashAmount < 3000){
        System.out.println("Attempt to move $"+cashAmount+" from the b1 to b2 account:");
        if(b1.withdraw(cashAmount) ){
          if(b2.deposit(cashAmount)){
            System.out.println(b1);
            System.out.println(b2);
            System.out.println();

          }else{
            //This should never happen.
            //Error message provided to make sure that is the case
            System.out.println("CRITICAL ERROR! $"+cashAmount +
                               " withdrawn from Account #" +  b1.getAccountID() +
                               "Failed to add to Account #"+b2.getAccountID());
          }
        }else{
          System.out.println("Transfer Failed");
        }

        cashAmount *= 2;
      }*/
  }
}
