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
public class change2 extends JPanel{
	JLabel jl1= new JLabel("请输入修改的学生信息");
	JLabel jl2= new JLabel("姓名");
	JLabel jl3= new JLabel("学号");
	JLabel jl4= new JLabel("高数成绩");
	JLabel jl5= new JLabel("程序设计成绩");
	JLabel jl6= new JLabel("英语成绩");
	JLabel jl7= new JLabel("软件工程成绩");
	JLabel jl8= new JLabel("线性代数成绩");
	JTextArea jta[]= new JTextArea[7];
	JButton jb1 = new JButton("确认修改");
	change2(final Node head){
		JFrame frame = new JFrame();
		frame.add(this);
		frame.setSize(500, 400);
		this.setSize(500, 400);
		this.setLayout(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setTitle("修改学生信息");
		jl1.setFont(new Font(null,Font.BOLD,30));
		jl2.setFont(new Font(null,Font.BOLD,15));
		jl3.setFont(new Font(null,Font.BOLD,15));
		jl4.setFont(new Font(null,Font.BOLD,15));
		jl5.setFont(new Font(null,Font.BOLD,15));
		jl6.setFont(new Font(null,Font.BOLD,15));
		jl7.setFont(new Font(null,Font.BOLD,15));
		jl8.setFont(new Font(null,Font.BOLD,15));
		jl1.setBounds(100, 10, 400, 80);
		jl2.setBounds(50, 100, 60, 50);
		jl3.setBounds(250, 100, 60, 50);
		jl4.setBounds(50, 150, 100, 50);
		jl5.setBounds(250, 150, 100, 50);
		jl6.setBounds(50, 200, 100, 50);
		jl7.setBounds(250, 200, 100, 50);
		jl8.setBounds(50, 250, 100, 50);
		this.add(jl1);
		this.add(jl2);
		this.add(jl3);
		this.add(jl4);
		this.add(jl5);
		this.add(jl6);
		this.add(jl7);
		this.add(jl8);
		for(int i=0;i<7;i++){
			jta[i]= new JTextArea();
			jta[i].setBounds(150+(i%2)*200, 110+(i/2)*50, 80, 30);
			switch(i){
			case 0:
				jta[i].setText(head.name);
				break;
			case 1:
				jta[i].setText(head.number);
				break;
			case 2:
				jta[i].setText(head.mathscore);
				break;
			case 3:
				jta[i].setText(head.programscore);
				break;
			case 4:
				jta[i].setText(head.engscore);
				break;
			case 5:
				jta[i].setText(head.softscore);
				break;
			case 6:
				jta[i].setText(head.linescore);
				break;
			}
			
			this.add(jta[i]);
		}
		jb1.setBounds(210, 300, 90, 60);
		this.add(jb1);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				head.name=jta[0].getText();
				head.number=jta[1].getText();
				head.mathscore=jta[2].getText();
				head.programscore=jta[3].getText();
				head.engscore=jta[4].getText();
				head.softscore=jta[5].getText();
				head.linescore=jta[6].getText();
				System.out.println("save");
				JOptionPane.showMessageDialog(null, "修改成功");
			}
		});
		this.setVisible(true);
		frame.setVisible(true);
	}
	/*public static void main(String[] args) {
		new change2();

	}*/

}
