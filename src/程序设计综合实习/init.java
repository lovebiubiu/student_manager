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

public class init{
	int i;
	Sheet sheet;
	Workbook book;
	Cell cell1,cell2,cell3,cell4,cell5,cell6,cell7;
	
	init(){
		Node head = new Node();
		Node p = new Node();
		head.next=p;
		ReadExcel(p,head);
		new login(head);
	}
	
	public void ReadExcel(Node p,Node head){
		try{
			book = Workbook.getWorkbook(new File("src/hello.xls"));
			sheet = book.getSheet(0);
			i=1;
			while(true){
				System.out.println("正在导入第"+i+"名学生数据");
				cell1=sheet.getCell(0,i);
				cell2=sheet.getCell(1,i);
				cell3=sheet.getCell(2,i);
				cell4=sheet.getCell(3,i);
				cell5=sheet.getCell(4,i);
				cell6=sheet.getCell(5,i);
				cell7=sheet.getCell(6,i);
				if("".equals(cell1.getContents())==true){
					System.out.println("数据为空，结束导入");
					break;
				}	
				p.name=cell1.getContents();
				p.number=cell2.getContents();
				p.mathscore=cell3.getContents();
				p.programscore=cell4.getContents();
				p.engscore=cell5.getContents();
				p.softscore=cell6.getContents();
				p.linescore=cell7.getContents();
				p.next= new Node();
				p=p.next;
				//System.out.println(cell1.getContents()+"\t"+cell2.getContents()+"\t"+cell3.getContents()+"\t"+cell4.getContents()+"\t"+cell5.getContents()+"\t"+cell6.getContents());
				i++;
			}
			book.close();
		}catch(Exception e){}
		System.out.println("导入数据成功,总共有"+(i-1)+"名学生");
			head.len=i-1;
	}
}
