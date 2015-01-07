//************************************************************
//NAME:
//DATE:
//FILENAME:	Calculator_GUI
//DESCRIPTION: 	This is the interface file which contains 
//            		base code to create a calculator GUI.
//************************************************************

package Calculator.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_GUI extends JFrame implements ActionListener
{
    //CREATE LAYOUT MANAGER 
    FlowLayout myLayout=new FlowLayout();
    
    //CREATE GUI COMPONENTS
    JTextField answer_txt=new JTextField(10);
    JButton one_btn=new JButton("1");
    JButton two_btn=new JButton("2");
    JButton three_btn=new JButton("3");
    JButton four_btn=new JButton("4");
    JButton five_btn=new JButton("5");
    JButton six_btn=new JButton("6");
    JButton seven_btn=new JButton("7");
    JButton eight_btn=new JButton("8");
    JButton nine_btn=new JButton("9");
    JButton add_btn=new JButton("+");
    JButton subtract_btn=new JButton("-");
    JButton multiply_btn=new JButton("*");
    JButton divide_btn=new JButton("/");
    JButton equals_btn=new JButton("=");
    JButton clear_btn=new JButton("clear");
    JButton decimal_btn=new JButton(".");    
    
    
    //VARIABLE DECLARATIONS
    double firstNumber,secondNumber,sum;    
    String currentDisplay="";
    String calculation;
    
    //CONSTRUCTOR METHOD
    public Calculator_GUI()
    {
      
        //DISPLAY COMPONENTS LEFT TO RIGHT     
        setLayout(myLayout);        
        
        //ADD COMPONENTS TO WINDOW
        add(answer_txt);
        //answer_txt.setText("0");
        
        add(one_btn);
        one_btn.addActionListener(this);

        add(two_btn);
        two_btn.addActionListener(this);
        
        add(three_btn);
        three_btn.addActionListener(this);
        
        add(four_btn);
        four_btn.addActionListener(this);
        
        add(five_btn);
        five_btn.addActionListener(this);
        
        add(six_btn);
        six_btn.addActionListener(this);
        
        add(seven_btn);
        seven_btn.addActionListener(this);
        
        add(eight_btn);
        eight_btn.addActionListener(this);
        
        add(nine_btn);
        nine_btn.addActionListener(this);

        add(add_btn);
        add_btn.addActionListener(this);
        
        add(subtract_btn);
        subtract_btn.addActionListener(this);
        
        add(multiply_btn);
        multiply_btn.addActionListener(this);
        
        add(divide_btn);
        divide_btn.addActionListener(this);
        
        
        add(equals_btn);
        equals_btn.addActionListener(this);
        
        add(clear_btn);
        clear_btn.addActionListener(this);
        
        add(decimal_btn);
        decimal_btn.addActionListener(this);
             
        
             
    }

public void actionPerformed(ActionEvent ev)
    {

    	//OBTAIN WHAT IS CURRENTLY IN ANSWER TEXTFIELD
    	currentDisplay=answer_txt.getText();

    	//ACTIONS WHEN '1' IS PRESSED
    	if (ev.getActionCommand().equals("1"))
    	{            	

        	currentDisplay=currentDisplay+"1";
        	answer_txt.setText(currentDisplay);

    	}

	//ACTIONS WHEN '2' IS PRESSED
    	else if (ev.getActionCommand().equals("2"))
    	{       
 	
        	currentDisplay=currentDisplay+"2";
        	answer_txt.setText(currentDisplay);

    	}
        
        //ACTIONS WHEN '3' IS PRESSED
    	if (ev.getActionCommand().equals("3"))
    	{            	

        	currentDisplay=currentDisplay+"3";
        	answer_txt.setText(currentDisplay);

    	}
        
        //ACTIONS WHEN '4' IS PRESSED
    	else if (ev.getActionCommand().equals("4"))
    	{       
 	
        	currentDisplay=currentDisplay+"4";
        	answer_txt.setText(currentDisplay);

    	}
    	
        //ACTIONS WHEN '5' IS PRESSED
    	else if (ev.getActionCommand().equals("5"))
    	{       
 	
        	currentDisplay=currentDisplay+"5";
        	answer_txt.setText(currentDisplay);

    	}
        
        //ACTIONS WHEN '6' IS PRESSED
    	else if (ev.getActionCommand().equals("6"))
    	{       
 	
        	currentDisplay=currentDisplay+"6";
        	answer_txt.setText(currentDisplay);

    	}
        
        //ACTIONS WHEN '7' IS PRESSED
    	else if (ev.getActionCommand().equals("7"))
    	{       
 	
        	currentDisplay=currentDisplay+"7";
        	answer_txt.setText(currentDisplay);

    	}
        
        //ACTIONS WHEN '8' IS PRESSED
    	else if (ev.getActionCommand().equals("8"))
    	{       
 	
        	currentDisplay=currentDisplay+"8";
        	answer_txt.setText(currentDisplay);

    	}
        
        //ACTIONS WHEN '9' IS PRESSED
    	else if (ev.getActionCommand().equals("9"))
    	{       
 	
        	currentDisplay=currentDisplay+"9";
        	answer_txt.setText(currentDisplay);

    	}
        
        //ACTIONS WHEN 'decimal' IS PRESSED
    	else if (ev.getActionCommand().equals("."))
    	{       
 	
        	currentDisplay=currentDisplay+".";
        	answer_txt.setText(currentDisplay);

    	}
        
	//ACTIONS WHEN ADD OPERATOR PRESSED
       	 else if (ev.getActionCommand().equals("+"))
      	 {        

                	calculation="+";
                        //REMEMBER WHAT NUMBER IS ON THE DISPLAY
               		 currentDisplay=answer_txt.getText();
               		 firstNumber=Double.parseDouble(currentDisplay);
                         

                //CLEAR DISPLAY FOR NEXT NUMBER TO BE ENTERED
                answer_txt.setText("");

       	 }
         
         //ACTIONS WHEN Subtract OPERATOR PRESSED
       	 else if (ev.getActionCommand().equals("-"))
      	 {        

                        calculation="-";
                	//REMEMBER WHAT NUMBER IS ON THE DISPLAY
               		 currentDisplay=answer_txt.getText();
               		 firstNumber=Double.parseDouble(currentDisplay);
                         

                //CLEAR DISPLAY FOR NEXT NUMBER TO BE ENTERED
                answer_txt.setText("");

       	 }
         
         //ACTIONS WHEN Multiply OPERATOR PRESSED
       	 else if (ev.getActionCommand().equals("*"))
      	 {        

                        calculation="*";
                	//REMEMBER WHAT NUMBER IS ON THE DISPLAY
               		 currentDisplay=answer_txt.getText();
               		 firstNumber=Double.parseDouble(currentDisplay);
                         

                //CLEAR DISPLAY FOR NEXT NUMBER TO BE ENTERED
                answer_txt.setText("");

       	 }
         
         //ACTIONS WHEN Divide OPERATOR PRESSED
       	 else if (ev.getActionCommand().equals("/"))
      	 {        

                        calculation="/";
                	//REMEMBER WHAT NUMBER IS ON THE DISPLAY
               		 currentDisplay=answer_txt.getText();
               		 firstNumber=Double.parseDouble(currentDisplay);
                         

                //CLEAR DISPLAY FOR NEXT NUMBER TO BE ENTERED
                answer_txt.setText("");

       	 }
         
         //ACTIONS WHEN Clear OPERATOR PRESSED
       	 else if (ev.getActionCommand().equals("clear"))
      	 {        

                	//REMEMBER WHAT NUMBER IS ON THE DISPLAY
               		 //currentDisplay=answer_txt.getText();
               		 //firstNumber=Double.parseDouble(currentDisplay);
                         

                //CLEAR DISPLAY FOR NEXT NUMBER TO BE ENTERED
                answer_txt.setText("");

       	 }






      	 //ACTIONS WHEN EQUALS OPERATOR PRESSED
       	 else if (ev.getActionCommand().equals("="))
       	 {  

                //REMEMBER WHAT NUMBER IS ON THE DISPLAY
                currentDisplay=answer_txt.getText();
                secondNumber=Integer.parseInt(currentDisplay);

                //CALCULATE ANSWER
                sum=firstNumber+secondNumber;
               
                //DISPLAY ANSWER
                answer_txt.setText(""+sum);

       	 }

    }	
  
}
///-------------------------------------------------------------------------------------------------------------------------------------------

    
