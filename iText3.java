import java.io.*;
import com.itextpdf.awt.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
class iText3
{
public static void main(String args[])
{
try
{
OutputStream outputStream;
outputStream=new FileOutputStream(new File("eg3.pdf"));
try
{
Document document;
document=new Document();
PdfWriter.getInstance(document,outputStream);
document.open();
Font font1=new Font(Font.FontFamily.TIMES_ROMAN,30.0f,Font.UNDERLINE,BaseColor.GREEN);
Paragraph p1=new Paragraph("Hello world",font1);
p1.setAlignment(Paragraph.ALIGN_RIGHT);

Font font2=new Font(Font.FontFamily.COURIER,100.0f,Font.BOLD,BaseColor.RED);
Paragraph p2=new Paragraph("Hello After world",font2);
p2.setAlignment(Paragraph.ALIGN_CENTER);

Font font3=new Font(Font.FontFamily.HELVETICA,100.0f,Font.ITALIC,BaseColor.BLUE);
Paragraph p3=new Paragraph("Hello before world",font3);
p3.setAlignment(Paragraph.ALIGN_LEFT);
document.add(p1);
document.add(p2);
document.add(p3);
document.close();
}catch(DocumentException documentException)
{
System.out.println(documentException.getMessage());
}
}catch(IOException ioException)
{
System.out.println(ioException.getMessage());
}
System.out.println("PDF Generated");
}
}