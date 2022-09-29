import javax.swing.*;
// This is a simple login layout window software made by Krish Bishwakarma 
public class grfs{
	public static void main(String[] args){
	JFrame jframe = new JFrame();
	JLabel label = new JLabel("Login to continue");
	JButton btn = new JButton("Login");

	JLabel name = new JLabel("Enter your name");
    JTextField namefield = new JTextField();
	
	JLabel number = new JLabel("Enter your number");
    JTextField numberfield = new JTextField();
	
	JLabel pass = new JLabel("Enter your password");
    JTextField passfield = new JTextField();
	// Credit of this project
	// This project was made and modified by @Krish Bishwakarma
	JLabel note = new JLabel("This project is made and modified by @Krish Bishwakarma");
	
	
     label.setBounds(160,0,200,50);
     name.setBounds(115,40,200,50);
     namefield.setBounds(115,80,200,40);
      
  
	
        number.setBounds(115,120,200,50);
	numberfield.setBounds(115,160,200,40);

	pass.setBounds(115,200,200,50);
        passfield.setBounds(115,240,200,40);
	
	
	btn.setBounds(160,300,100,40);
	note.setBounds(0,360,420,20);
	
	
	
	
	jframe.add(btn);
	jframe.add(label);
	jframe.add(name);
	jframe.add(namefield);

	jframe.add(number);
	jframe.add(numberfield);
	jframe.add(pass);
	jframe.add(passfield);
    jframe.add(note);




	
	jframe.setLayout(null);
	jframe.setSize(420,420);
	jframe.setVisible(true);
		
		
		
		
		}
	
	
	}
