import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Problem1 {
    public static void main(String args[]){

        int price=2,quantity;
        String name,classname;


      name=JOptionPane.showInputDialog("Enter your name");

      classname=JOptionPane.showInputDialog("Enter your ClassName");

      quantity=JOptionPane.showInputDialog("Enter the amount of snacks you want");
      
     JOptionPane.showMessageDialog(null,"Your name is "+name+"Your classname is "+classname+ "the number of snacks" +quantity+ "The price is"+(quantity*price));
    }
}
