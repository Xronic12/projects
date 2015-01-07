//*********************************************************************
//NAME:
//DATE:
//FILENAME:		Calculator.java 
//DESCRIPTION: 	This is the class file (driver file) to create
//             		a calculator. 
//**********************************************************************
//MAKE ALL FILES IN CALC PROJECT ACCESSIBLE
package Calculator.java;

//MAKE ALL SWING CLASSES AVAILABLE
import javax.swing.*;

//MAKE ALL 'ABSTRACT WINDOW TOOLKIT' CLASSES AVAILABLE
import java.awt.*;
import java.awt.event.*;


public class Calculator
{ 
    public static void main(String[] args)
     {
        //CREATE THE JFRAME WINDOW
        Calculator_GUI window= new Calculator_GUI();
        
        //SET DIMENSIONS OF WINDOW & MAKE FUNCTIONAL
        window.setSize(300,400);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }
}
