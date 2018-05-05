package 程序设计综合实习;
import jxl.*;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;

import jxl.Workbook;
import jxl.write.Boolean;
import jxl.write.DateFormats;
import jxl.write.DateTime;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
public class output{
	  output(Node head){
	    try { 
	      WritableWorkbook book= Workbook.createWorkbook(new File("src/save.xls")); 
	      WritableSheet sheet=book.createSheet("第一页",0); 
	       
	      for(int i=0;i<7;i++){
	    	  switch(i){
	    	  case 0:
	    		  sheet.addCell(new Label(i,0,"姓名"));
	    		  break;
	    	  case 1:
	    		  sheet.addCell(new Label(i,0,"学号"));
	    		  break;
	    	  case 2:
	    		  sheet.addCell(new Label(i,0,"高数成绩"));
	    		  break;
	    	  case 3:
	    		  sheet.addCell(new Label(i,0,"程序设计成绩"));
	    		  break;
	    	  case 4:
	    		  sheet.addCell(new Label(i,0,"英语成绩"));
	    		  break;
	    	  case 5:
	    		  sheet.addCell(new Label(i,0,"软件工程成绩"));
	    		  break;
	    	  case 6:
	    		  sheet.addCell(new Label(i,0,"线性代数成绩"));
	    		  break;
	    	  }
	    	  
	      }
	         
	      for(int i=1;head.next!=null;i++)  
	      {
	        for(int j=0;j<7;j++)
	        {
	          switch(j){
	          case 0:
	    		  sheet.addCell(new Label(j,i,head.name));
	    		  break;
	    	  case 1:
	    		  sheet.addCell(new Label(j,i,head.number));
	    		  break;
	    	  case 2:
	    		  sheet.addCell(new Label(j,i,head.mathscore));
	    		  break;
	    	  case 3:
	    		  sheet.addCell(new Label(j,i,head.programscore));
	    		  break;
	    	  case 4:
	    		  sheet.addCell(new Label(j,i,head.engscore));
	    		  break;
	    	  case 5:
	    		  sheet.addCell(new Label(j,i,head.softscore));
	    		  break;
	    	  case 6:
	    		  sheet.addCell(new Label(j,i,head.linescore));
	    		  break;
	          } 
	        }
	        head=head.next;
	      }
	       
	      /*合并单元格.合并既可以是横向的，也可以是纵向的
	       *WritableSheet.mergeCells(int m,int n,int p,int q);  表示由(m,n)到(p,q)的单元格组成的矩形区域合并
	       * */
	      //sheet.mergeCells(0,1,0,2);
	     // sheet.mergeCells(0,3,0,4);
	       
	      //写入数据
	      book.write(); 
	      //关闭文件
	      book.close(); 
	    }
	    catch(Exception e) { } 
	  }
	}
