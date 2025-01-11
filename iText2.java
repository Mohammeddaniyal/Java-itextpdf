import java.io.*;
import com.itextpdf.awt.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
class iText2
{
public static void main(String gg[])
{
OutputStream outputStream=null;
try
{
File file=new File("eg2.pdf");
outputStream=new FileOutputStream(file);
try
{
Document document=new Document();
PdfWriter.getInstance(document,outputStream);
document.open();

Font font=new Font(Font.FontFamily.TIMES_ROMAN,50.0f,Font.NORMAL,BaseColor.MAGENTA);
Paragraph paragraph=new Paragraph("Hello World!!!!!",font);
document.add(paragraph);
document.close();
System.out.println("Pdf generated");
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