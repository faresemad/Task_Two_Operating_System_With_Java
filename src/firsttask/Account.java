/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firsttask;

/**
 *
 * @author Fares Emad
 */
public class Account {
    String id;
    String name;
    int balance =0;
    
    public Account(){
    
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
   //Now We Write A Methods
    public int credit(int amount){
        balance = balance+ amount;
        return balance;
    }
    public int debit(int amount){
        if (amount <= balance){
            balance= balance-amount;
        }else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public void transferTo( Account another , int amount){
        if (amount <= balance){
            another.credit(amount);
            balance=balance-amount;
        }else {
            System.out.println("Amount Exceeded Balance");
        }
    }

    @Override
    public String toString() {
        return "Account { My " + "id is = " + id + ", name is = " + name + ", balance is = " + balance + " }";
    }
    
    
}

