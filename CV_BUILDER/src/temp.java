/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajad
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;




public class temp {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
	  Document document = new Document();
	  PdfPTable table = new PdfPTable(new float[] { 2, 2});
	  table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
          table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
          Font f7 = new Font(Font.FontFamily.HELVETICA,18,Font.BOLD );
          Font f2=new Font(Font.FontFamily.TIMES_ROMAN,16,Font.BOLD);
          //Paragraph p=p2+p1;
	  table.addCell(new Paragraph("Name",f7));
          table.addCell(new Paragraph("Description",f7));
          //table.addCell("Location");
	  //table.setHeaderRows(1);
	  PdfPCell[] cells = table.getRow(0).getCells(); 
	  /*for (int j=0;j<cells.length;j++){
	     cells[j].setBackgroundColor(BaseColor.GRAY);
	  }*/
          for (int i=1;i<5;i++){
    	     table.addCell("CV Builder");
             table.addCell("Built A CV Builder blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah ablah albha blah blah blah blah blah blah");
          }
          /*for (int i=1;i<5;i++){
              PdfPCell cell=new PdfPCell();
              cell.setBorder(PdfPCell.NO_BORDER);
              cell.addElement(new Paragraph("CV Builder",f1));
              cell.addElement(new Paragraph("Built A CV Builder blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah ablah albha blah blah blah blah blah blah"));
              table.addCell(cell);
          }*/
	  PdfWriter.getInstance(document, new FileOutputStream("sample.pdf"));
	  document.open();
          document.add(table);
	  document.close();
	  System.out.println("Done");
      }  
}
