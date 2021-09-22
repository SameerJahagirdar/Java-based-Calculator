package sameercodes;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends WindowAdapter implements ActionListener  {
		Frame frame;
		Label label;
		//Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\samee\\eclipse-workspace\\sameercodes\\src\\sameercodes\\calculator-5.png"); 
		
		Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,eql,clr,pt;
		Button add,sub,mul,div;
		double num1,num2,ans;
		int fun;
		Font boldFont = new Font("Serif", Font.BOLD, 24);
		Calculator(){
			frame=new Frame("Calculator");
			label=new Label();
			
			label.setBackground(Color.LIGHT_GRAY);
			label.setBounds(25,35,350,150);
			
			//buttons
			b1=new Button("1");b1.setBounds(0,200,90,90);
			b2=new Button("2");b2.setBounds(100,200,90,90);
			b3=new Button("3");b3.setBounds(200,200,90,90);
			add=new Button("+");add.setBounds(300,200,90,90);
			
			b4=new Button("4");b4.setBounds(0,300,90,90);
			b5=new Button("5");b5.setBounds(100,300,90,90);
			b6=new Button("6");b6.setBounds(200,300,90,90);
			sub=new Button("-");sub.setBounds(300,300,90,90);
			
			b7=new Button("7");b7.setBounds(0,400,90,90);
			b8=new Button("8");b8.setBounds(100,400,90,90);
			b9=new Button("9");b9.setBounds(200,400,90,90);
			mul=new Button("x");mul.setBounds(300,400,90,90);
			
			clr=new Button("Clear");clr.setBounds(0,500,90,90);
			pt=new Button(".");pt.setBounds(92,500,70,90);
			b0=new Button("0");b0.setBounds(165,500,72,90);
			eql=new Button("=");eql.setBounds(240,500,72,90);
			div=new Button("÷");div.setBounds(315,500,72,90);
			
			
			
			frame.addWindowListener(this);
			frame.setSize(400,600);
			//frame.setIconImage(icon);
			frame.setFont(boldFont);
			
			b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);
			b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);
			b9.addActionListener(this);b0.addActionListener(this);add.addActionListener(this);sub.addActionListener(this);
			clr.addActionListener(this);eql.addActionListener(this);div.addActionListener(this);mul.addActionListener(this);
			pt.addActionListener(this);
			
			frame.add(b1);frame.add(b2);frame.add(b3);frame.add(add);frame.add(b4);frame.add(b5);frame.add(b6);frame.add(sub);
			frame.add(b7);frame.add(b8);frame.add(b9);frame.add(mul);frame.add(clr);frame.add(b0);frame.add(eql);frame.add(div);
			frame.add(label);frame.add(pt);
			
			frame.setLayout(null);
			frame.setVisible(true);
			
		}
	

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s,st,ch="";
			if(e.getSource()==pt) {
				st=label.getText();
				s=st+".";
				label.setText(s);
			}
			if(e.getSource()==b1) {
				st=label.getText();
				  s=st+"1";
				  label.setText(s);
			}
			if(e.getSource()==b2) {
				st=label.getText();
				  s=st+"2";
				  label.setText(s);
			}
			if(e.getSource()==b3) {
				st=label.getText();
				  s=st+"3";
				  label.setText(s);
			}
		
			if(e.getSource()==b4) {
				st=label.getText();
				  s=st+"4";
				  label.setText(s);
			}
			if(e.getSource()==b5) {
				st=label.getText();
				  s=st+"5";
				  label.setText(s);
			}
			if(e.getSource()==b6) {
				st=label.getText();
				  s=st+"6";
				  label.setText(s);
			}
			if(e.getSource()==b7) {
				st=label.getText();
				  s=st+"7";
				  label.setText(s);
			}
			if(e.getSource()==b8) {
				st=label.getText();
				  s=st+"8";
				  label.setText(s);
			}
			if(e.getSource()==b9) {
				st=label.getText();
				  s=st+"9";
				  label.setText(s);
			}
			
			if(e.getSource()==b0) {
				st=label.getText();
				  s=st+"0";
				  label.setText(s);
			}
			if(e.getSource()==add) {
				try {
				num1=Double.parseDouble(label.getText());
			}
				catch(Exception ex) {
					label.setText("Syntax Error");
					System.out.println(ex);
					return;
				}
				s="";
				label.setText(s);
				fun=1;
			}
			if(e.getSource()==sub) {
				try {
				num1=Double.parseDouble(label.getText());
			}
				catch(Exception ex) {
					label.setText("Syntax Error");
					return;
				}
				s="";
				ch="-";
				label.setText(s);
				fun=2;
			}
			if(e.getSource()==mul) {
				try {
				num1=Double.parseDouble(label.getText());
			}
				catch(Exception ex) {
					label.setText("Syntax Error");
					return;
				}
				s="";
				ch="X";
				label.setText(s);
				fun=3;
			}
			if(e.getSource()==div) {
				try {
				num1=Double.parseDouble(label.getText());
			}
				catch(Exception ex) {
					label.setText("Syntax Error");
					return;
				}
				s="";
				
				label.setText(s);
				fun=4;
			}
			if(e.getSource()==eql) {
				try {
				num2=Double.parseDouble(label.getText());
			}
				catch(Exception ex) {
					label.setText("Syntax Error");
					return;
				}
				s="";
				label.setText(s);
			
			 if(fun==1) {ans =num1+num2;ch="+";}
			 if(fun==2){ans =num1-num2;ch="-";}
		     if(fun==3){ans =num1*num2;ch="X";}
			 if(fun==4){ans =num1/num2;ch="÷";}	 
		label.setText(String.valueOf(num1)+" "+ch+" "+String.valueOf(num2)+" = "+String.valueOf(ans));
			}
			
		if(e.getSource()==clr){
			  num1=0;
			  num2=0;
			  fun=0;
			  ans=0;
			  ch="";
			   s="";
			   label.setText(s);
		} 
	}
		public void windowClosing(WindowEvent e) {
			  frame.dispose();
			}
		
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		new Calculator();
	}


}
