package 程序设计综合实习;

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.nio.DoubleBuffer;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import jxl.*;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class stuboundary extends JPanel{
	JLabel jl[][]= new JLabel[200][7];
	JLabel label= new JLabel();
	JButton jb1 = new JButton("查找");
	JButton jb5 = new JButton("刷新");
	int length;
	int i;
	Node head2;
	stuboundary(Node head){
		head2 = new Node();
		head2 = head;
		final JFrame frame = new JFrame();
		frame.add(this);
		frame.setVisible(true);
		frame.setSize(1200 , 800);
		this.setSize(1200 , 800);
		this.setVisible(true);
		this.setLayout(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setTitle("北农成绩管理系统");
		for(int i=0;i<100;i++)
			for(int j=0;j<7;j++)
				jl[i][j]= new JLabel();
		jb1.setBounds(1000, 120, 120, 60);
		this.add(jb1);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new search(head2.next);
			}
		});
		
		jb5.setBounds(1000, 220, 120, 60);
		this.add(jb5);
		jb5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				refreash(head2,frame);
			}
		});

		label.setText("姓名                              学号                  高数成绩          程序设计成绩          英语成绩          软件工程成绩          线性代数成绩");
		label.setBounds(150, 120, 800, 50);
		this.add(label);
		refreash(head2,frame);
		
	}
	public void refreash(Node head2,JFrame frame){
		System.out.println("刷新成功");
		head2=head2.next;
		System.out.println(""+head2.name);
		for(i=0;head2.next!=null;i++){
			for(int j=0;j<7;j++){
				System.out.println(i+","+j);
				jl[i][j].setFont(new Font(null,Font.BOLD,15));
				switch(j){
				case 0:
					jl[i][j].setText(""+head2.name);
					break;
				case 1:
					jl[i][j].setText(""+head2.number);
					break;
				case 2:
					jl[i][j].setText(""+head2.mathscore);
					break;
				case 3:
					jl[i][j].setText(""+head2.programscore);
					break;
				case 4:
					jl[i][j].setText(""+head2.engscore);
					break;
				case 5:
					jl[i][j].setText(""+head2.softscore);
					break;
				case 6:
					jl[i][j].setText(""+head2.linescore);
					break;
				}
				jl[i][j].setBounds(150+j*100, 150+i*50, 800, 100);
				this.add(jl[i][j]);
			}
			
			head2=head2.next;
		}
		for(i=i;i<=10;i++){
			for(int j=0;j<7;j++){
				System.out.println(i+","+j);
				jl[i][j].setFont(new Font(null,Font.BOLD,15));
				switch(j){
				case 0:
					jl[i][j].setText("");
					break;
				case 1:
					jl[i][j].setText("");
					break;
				case 2:
					jl[i][j].setText("");
					break;
				case 3:
					jl[i][j].setText("");
					break;
				case 4:
					jl[i][j].setText("");
					break;
				case 5:
					jl[i][j].setText("");
					break;
				case 6:
					jl[i][j].setText("");
					break;
				}
				jl[i][j].setBounds(150+j*100, 150+i*50, 800, 100);
				this.add(jl[i][j]);
			}
		}
	}
}
