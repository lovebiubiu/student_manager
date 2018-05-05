package 程序设计综合实习;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.lang.*;
import java.nio.DoubleBuffer;
import java.util.*;
import javax.swing.*;
import jxl.*;
import jxl.read.biff.BiffException;
import java.io.File;
import java.io.IOException;

public class change extends JPanel{
	JLabel jl1= new JLabel("请修改学生信息");
	int flag;
	String str2;
	String select;
	JComboBox jcb;
	JTextArea jta = new JTextArea();
	JButton jb1 = new JButton("修改此人信息");
	Node head2= new Node();
	Node head3 = new Node();
	change(final Node head){
		head2= head;
		final JFrame frame = new JFrame();
		frame.add(this);
		frame.setSize(500, 300);
		this.setSize(500, 300);
		this.setLayout(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("修改");
		String str[] = {"姓名","学号"};
		jcb = new JComboBox(str);
		jcb.setBounds(50, 100, 100, 30);
		this.add(jcb);
		jl1.setBounds(20, 20, 300, 40);
		jl1.setFont(new Font(null,Font.BOLD,20));
		this.add(jl1);
		jta.setBounds(160, 100, 100, 30);
		this.add(jta);
		jb1.setBounds(280, 100, 120, 30);
		this.add(jb1);	
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				findchange(head,frame);
			}
			});
		this.setVisible(true);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		Node head = new Node();
		new change(head);
	}
public void findchange(Node head,JFrame jf){
	flag=0;
	select =(String) jcb.getSelectedItem();
	str2 = jta.getText();
	System.out.println(select+"");
	if(select=="姓名"){
		System.out.println(select+"");
		while(head.next!=null){
			if(head.name.equals(str2)){
				System.out.println("搜索成功");
				new change2(head);
				jf.setVisible(false);
				flag=1;
				break;
			}
			head=head.next;
		}
	}
	else if(select =="学号"){
		System.out.println(select+"");
		while(head.next!=null){
			if(head.number.equals(str2)){
				System.out.println("搜索成功");
				new change2(head);
				jf.setVisible(false);
				flag=1;
				break;
			}
			head=head.next;
		}
	}
	if(flag==0){
		JOptionPane.showMessageDialog(null, "未找到此人");
	}
}
}
