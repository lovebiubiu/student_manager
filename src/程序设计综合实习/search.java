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

public class search extends JPanel{
	JLabel jl1= new JLabel("��������Ҫ��ѯ����Ϣ");
	JLabel jl2= new JLabel("����:");
	JLabel jl3= new JLabel("ѧ��:");
	JLabel jl4= new JLabel("����     ѧ��     ��ѧ     �������     Ӣ��     �������     ���Դ���");
	JLabel JL[]= new JLabel[5];
	JTextArea jta1=new JTextArea();
	JTextArea jta2=new JTextArea();
	JButton jb1= new JButton("����");
	String str1,str2;
	int temp;
	int flag;
	Node head2 = new Node();
	Node head3 = new Node();
	search(Node head){
		head2=head;
		JFrame frame = new JFrame();
		frame.add(this);
		frame.setVisible(true);
		frame.setSize(700, 500);
		this.setSize(700, 500);
		this.setVisible(true);
		this.setLayout(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("����");
		jl1.setFont(new Font(null,Font.BOLD,30));
		jl1.setBounds(80, 30, 400, 100);
		jl2.setFont(new Font(null,Font.BOLD,15));
		jl2.setBounds(100, 150, 50, 50);
		jl3.setFont(new Font(null,Font.BOLD,15));
		jl3.setBounds(300, 150, 50, 50);
		jl4.setFont(new Font(null,Font.BOLD,15));
		jl4.setBounds(60, 180, 600, 100);
		this.add(jl1);
		this.add(jl2);
		this.add(jl3);
		this.add(jl4);
		jta1.setBounds(155,160,100,30);
		jta2.setBounds(355,160,100,30);
		this.add(jta1);
		this.add(jta2);
		jb1.setBounds(500, 160, 60, 30);
		this.add(jb1);
		for(int i=0;i<5;i++){
			JL[i]= new JLabel();
			JL[i].setBounds(60, 200+i*30, 900, 100);
			this.add(JL[i]);
		}
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				temp=0;
				str1=jta1.getText();
				str2=jta2.getText();
				head3=head2;
				System.out.println("��ʼ����");
				if(str1!=null){
					System.out.println("��������");
					while(head3.next!=null){
						System.out.println(head3.name+"");
						if(head3.name.equals(str1)&&temp<5){
							JL[temp++].setText(head3.name+"      "+head3.number+"      "+head3.mathscore+"              "+head3.programscore+"                  "+head3.engscore+"                   "+head3.softscore+"                        "+head3.linescore);
							System.out.println("�����ɹ�");
							break;
						}
						head3=head3.next;
					}
					System.out.println("��������");
				}
				head3=head2;
				if(str2!=null){
					System.out.println("ѧ������");
					while(head3.next!=null){
						System.out.println(head3.number+"");
						if(head3.number.equals(str2)&&temp<5){
							JL[temp++].setText(head3.name+"      "+head3.number+"      "+head3.mathscore+"              "+head3.programscore+"                  "+head3.engscore+"                   "+head3.softscore+"                        "+head3.linescore);
							System.out.println("�����ɹ�");
							break;
						}
						head3=head3.next;
					}
				}
			}
		});
	}
	
}
