package ��������ۺ�ʵϰ;
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
	      WritableSheet sheet=book.createSheet("��һҳ",0); 
	       
	      for(int i=0;i<7;i++){
	    	  switch(i){
	    	  case 0:
	    		  sheet.addCell(new Label(i,0,"����"));
	    		  break;
	    	  case 1:
	    		  sheet.addCell(new Label(i,0,"ѧ��"));
	    		  break;
	    	  case 2:
	    		  sheet.addCell(new Label(i,0,"�����ɼ�"));
	    		  break;
	    	  case 3:
	    		  sheet.addCell(new Label(i,0,"������Ƴɼ�"));
	    		  break;
	    	  case 4:
	    		  sheet.addCell(new Label(i,0,"Ӣ��ɼ�"));
	    		  break;
	    	  case 5:
	    		  sheet.addCell(new Label(i,0,"������̳ɼ�"));
	    		  break;
	    	  case 6:
	    		  sheet.addCell(new Label(i,0,"���Դ����ɼ�"));
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
	       
	      /*�ϲ���Ԫ��.�ϲ��ȿ����Ǻ���ģ�Ҳ�����������
	       *WritableSheet.mergeCells(int m,int n,int p,int q);  ��ʾ��(m,n)��(p,q)�ĵ�Ԫ����ɵľ�������ϲ�
	       * */
	      //sheet.mergeCells(0,1,0,2);
	     // sheet.mergeCells(0,3,0,4);
	       
	      //д������
	      book.write(); 
	      //�ر��ļ�
	      book.close(); 
	    }
	    catch(Exception e) { } 
	  }
	}
