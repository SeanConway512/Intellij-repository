import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;


public class Problem3 {
    public static void main(String args[]){

        String name;
        Float income, netincome;
        double tax;

        name=JOptionPane.showInputDialog("Enter your name");

        income=JOptionPane.showInputDialog("Enter your income");

        if(income<=20000.00){
         tax = 0;
        }
       else if(income>20000.00 && income<36000.00){
        tax = 0.20;
          netincome=income/tax;
         JOptionPane.showMessageDialog("Your net in come equals " + netincome);
       }
       else if(income>=36000.01){
           tax = 0.41;
            netincome=income/tax;
            JOptionPane.showMessageDialog("Your net in come equals " + netincome);
        }

        }



