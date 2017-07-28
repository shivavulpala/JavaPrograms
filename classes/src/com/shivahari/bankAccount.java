package com.shivahari;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
/**
 * Created by harikannareddy on 7/7/17.
 */
public class bankAccount {

    private int accnum;
    private double balance;
    private String custname;
    private String email;
    private int phonum;

    public void depositFunds(double deposit){
        this.balance = this.balance + deposit;
        System.out.println("Existing amount: " +this.balance);
    }
    public void withdrawFunds(double withdraw){

        if(this.balance-withdraw <= 0)
        {
            System.out.println("only " + this.balance + " available, withdarwal not processed");
        }
        else
        {
            this.balance = this.balance - withdraw;
            System.out.println("withdrawal of " + withdraw + " processed, remaining balance: " +this.balance);
        }
    }

    public int getAccnum() {
        return accnum;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhonum() {
        return phonum;
    }

    public void setPhonum(int phonum) {
        this.phonum = phonum;
    }
}
