import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class Problem1 {
    public static void main(String args[]){


        String name,classname,quantity;
        int price=2,netprice=price*quantity;



      name=JOptionPane.showInputDialog("Enter your name");

      classname=JOptionPane.showInputDialog("Enter your ClassName");

      quantity=JOptionPane.showInputDialog("Enter the amount of snacks you want");

      netprice=price*quantity;
      
     JOptionPane.showMessageDialog(null,"Your name is "+name+"Your classname is "+classname+
             "the number of snacks" +quantity+ "The price is"+ netprice);
    }
}
