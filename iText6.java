import java.io.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
class iText6
{
public static void main(String gg[])
{
OutputStream outputStream=null;
try
{
File file=new File("eg6.pdf");
outputStream=new FileOutputStream(file);
try
{
Document document=new Document();
PdfWriter writer=PdfWriter.getInstance(document,outputStream);
document.open();
PdfContentByte pdfContentByte=writer.getDirectContent();
Font font=FontFactory.getFont(FontFactory.TIMES_ROMAN,12);
pdfContentByte.setFontAndSize(font.getBaseFont(),12);

float x=100; 
float y=700;
pdfContentByte.beginText();
pdfContentByte.moveText(x,y);
pdfContentByte.showText("I have written this on (100,700)");
pdfContentByte.endText();
document.newPage();
pdfContentByte.ellipse(100,500,500,1000);
pdfContentByte.stroke();
pdfContentByte.rectangle(300,30,200,100);
pdfContentByte.stroke();
document.close();
System.out.println("PDF generated");
}catch(DocumentException documentException)
{
System.out.println(documentException.getMessage());
}
}catch(IOException ioException)
{
System.out.println(ioException.getMessage());
}
}
}