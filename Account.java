import java.until.Scanner;

public class Account {
  // class variables 
  int balance;
  int previousTransaction;
  String customerName;
  String customerID;

  // class constructor 
  Account(String cname, String cid) {
    customerName = cname;
    customerID = cid;
  }

  //Function for Depositing money 
  void deposit(int, amount) {
    if (amount != 0) {
      balance = balance + amount;
      previousTransaction = amount;
    }
  }

  //Function for withdrawing money 
  void withdraw(int amount) {
    if (amount != 0) {
      balance = balance - amount;
      previousTransaction = -amount;
    }
  }

  //Function showing the previous transaction
  void getPreviousTransaction() {
    if (previousTransaction > 0) {
      System.out.println("Deposited: " + previousTransaction)
    } else if (previousTransaction < 0) {
      System.out.println("Withdrawn: " + Math.abs(previousTransaction));
    } else {
      System.out.println("No transaction occured");
    }
  }






}