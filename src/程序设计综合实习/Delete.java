package ��������ۺ�ʵϰ;

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
public class Delete extends JPanel{
	JLabel jl1 = new JLabel("��������Ҫɾ��ѧ����������ѧ��");
	JTextArea jta=new JTextArea();
	JButton jb1= new JButton("ȷ��ɾ��");
	String str2;
	JComboBox jcb;
	String str[] = {"����","ѧ��"};
	String select;
	int flag;
	Delete(final Node head){
		JFrame frame = new JFrame();
		frame.add(this);	
		frame.setSize(600, 400);
		this.setSize(600, 400);
		this.setLayout(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("ɾ��");
		jl1.setFont(new Font(null,Font.BOLD,25));
		jl1.setBounds(80, 30, 500, 100);
		this.add(jl1);
		
		jcb = new JComboBox(str);
		jcb.setBounds(150, 160, 100, 30);
		this.add(jcb);
		
		jta.setBounds(255,160,100,30);
		this.add(jta);
		
		jb1.setBounds(240, 300, 100, 50);
		this.add(jb1);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				del(head);
			}
			});
		frame.setVisible(true);
		this.setVisible(true);
	}
	public void del(Node head){
		flag=0;
		select =(String) jcb.getSelectedItem();
		str2 = jta.getText();
		System.out.println(select+"");
		if(select=="����"){
			System.out.println(select+"");
			while(head.next!=null){
				if(head.next.name.equals(str2)){
					System.out.println("�����ɹ�");
					head.next=head.next.next;
					JOptionPane.showMessageDialog(null, "ɾ���ɹ���");
					flag=1;
					break;
				}
				head=head.next;
			}
		}
		else if(select =="ѧ��"){
			System.out.println(select+"");
		}
		if(flag==0){
			JOptionPane.showMessageDialog(null, "δ�ҵ�����");
		}
	}
	public static void main(String[] args) {
		Node head = new Node();
		new Delete(head);
	}
}
