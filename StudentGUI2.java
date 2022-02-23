package Functions;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class StudentGUI2 {
	
	
	
	public StudentGUI2() {
		
		JFrame frame=new JFrame("STUDENT REGISTRATION");
		frame.setSize(1050,530);
		ImageIcon imagenitesh=new ImageIcon("hancie.jpg");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.getContentPane().setBackground(new Color(255,255,255));
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		
		
		
		JLabel lblStudent=new JLabel("STUDENT REGISTRATION", SwingConstants.CENTER);
		lblStudent.setBounds(0,0,1050,55);
		lblStudent.setFont(new Font("Helvetica", Font.BOLD, 25));
		lblStudent.setBackground(new Color(156,29,231));
		lblStudent.setOpaque(true);
		frame.add(lblStudent);
		
		JPanel panel=new JPanel();
		panel.setBounds(450,78,560,390);
		panel.setBackground(new Color(156,29,231));
		panel.setLayout(null);
		frame.add(panel);
		
		JLabel hancie1=new JLabel("Designed by Hancie Phago");
		hancie1.setBounds(20,460,300,35);
		hancie1.setFont(new Font("Verdana", Font.BOLD, 15));
		frame.add(hancie1);
		
		JLabel label=new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("hancie.png")).getImage();
		label.setIcon(new ImageIcon(img));
		label.setBounds(0,30,560,450);
		frame.add(label);
		
		JLabel label1=new JLabel("Name: ");
		label1.setBounds(50,10,100,55);
		label1.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(label1);
		
		JTextField txtName=new JTextField();
		txtName.setBounds(160,20,250,30);
		txtName.setBorder(new LineBorder(Color.WHITE,2));
		txtName.setFont(new Font("Helvetica", Font.PLAIN, 15));
		panel.add(txtName);
		
		JLabel label2=new JLabel("ID: ");
		label2.setBounds(50,50,100,55);
		label2.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(label2);
		
		JTextField txtPh=new JTextField();
		txtPh.setBounds(160,60,250,30);
		txtPh.setBorder(new LineBorder(Color.WHITE,2));
		txtPh.setFont(new Font("Helvetica", Font.PLAIN, 15));
		panel.add(txtPh);
		
		JLabel label3=new JLabel("Address:");
		label3.setBounds(50,90,100,55);
		label3.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(label3);
		
		JTextField txtAddress=new JTextField();
		txtAddress.setBounds(160,100,250,30);
		txtAddress.setBorder(new LineBorder(Color.WHITE,2));
		txtAddress.setFont(new Font("Helvetica", Font.PLAIN, 15));
		panel.add(txtAddress);
		
		JLabel label4=new JLabel("Gender:");
		label4.setBounds(50,130,100,55);
		label4.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(label4);
		
		String hancie[]= {"Male", "Female","Others"};
		JComboBox txtCombo=new JComboBox(hancie);
		txtCombo.setBackground(new Color(255,255,255));
		txtCombo.setBounds(160,140,100,30);
		panel.add(txtCombo);
		
		JLabel label5=new JLabel("Email:");
		label5.setBounds(50,170,100,55);
		label5.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(label5);
		
		JTextField txtEmail=new JTextField();
		txtEmail.setBounds(160,180,250,30);
		txtEmail.setBorder(new LineBorder(Color.WHITE,2));
		txtEmail.setFont(new Font("Helvetica", Font.PLAIN, 15));
		panel.add(txtEmail);
		
		JLabel label6=new JLabel("Semester:");
		label6.setBounds(50,210,150,55);
		label6.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(label6);
		
		String semester[]= {"L4", "L5","L6"};
		JComboBox txtCombo1=new JComboBox(semester);
		txtCombo1.setBackground(new Color(255,255,255));
		txtCombo1.setBounds(160,220,100,30);
		panel.add(txtCombo1);
		
		JLabel label7=new JLabel("Section:");
		label7.setBounds(50,250,150,55);
		label7.setFont(new Font("Verdana", Font.BOLD, 18));
		panel.add(label7);
		
		JRadioButton txtA=new JRadioButton("A");
		txtA.setBounds(160,260,50,30);
		txtA.setBackground(new Color(156, 29, 231));
		txtA.setOpaque(true);
		panel.add(txtA);
		
		JRadioButton txtB=new JRadioButton("B");
		txtB.setBounds(210,260,50,30);
		txtB.setBackground(new Color(156, 29, 231));
		txtB.setOpaque(true);
		panel.add(txtB);
		
		JButton btn=new JButton("Register");
		btn.setBounds(130,320,100,35);
		btn.setBackground(new Color(61,90,241));
		btn.setForeground(Color.WHITE);
		panel.add(btn);
		
		
		
		
		frame.setVisible(true);
		
	}
	
	public static void main(String[]args) {
		new StudentGUI2();
	}
	
}