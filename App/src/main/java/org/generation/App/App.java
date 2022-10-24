package org.generation.App;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class App 
{
    public static void main( String[] args ){
    	Document doc = new Document();
    	try {
			PdfWriter.getInstance(doc, new FileOutputStream("CH17.pdf"));
	    	doc.open();
	    	doc.add(new Paragraph("CH17 semana 10!!!"));
    	} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    	}//catch
    	doc.close();
        System.out.println( "Hello World CH17!!!" );
    }//main
}//class App
