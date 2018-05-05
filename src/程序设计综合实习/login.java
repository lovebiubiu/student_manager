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
public class login extends JPanel{
	JLabel jl1= new JLabel();
	JButton jb1 = new JButton("教师端");
	JButton jb2 = new JButton("学生端");
	login(final Node head){
		final JFrame frame = new JFrame();
		frame.add(this);
		frame.setVisible(true);
		frame.setSize(500, 400);
		this.setSize(500, 400);
		this.setVisible(true);
		this.setLayout(null);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setTitle("登录系统");
		jb1.setBounds(100, 200, 120, 60);
		jb2.setBounds(280, 200, 120, 60);
		this.add(jb1);
		this.add(jb2);
		jl1.setText("欢迎使用北京农学院学生成绩管理系统");
		jl1.setFont(new Font(null,Font.BOLD,25));
		jl1.setBounds(25, 80, 450, 100);
		this.add(jl1);
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame.setVisible(false);
				new boundary(head);
			}
		});
		jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame.setVisible(false);
				new stuboundary(head);
			}
		});
	}
}
