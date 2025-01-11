import java.io.*;
import com.itextpdf.awt.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
class iText1
{
public static void main(String gg[])
{
OutputStream outputStream=null;
try
{
File file=new File("eg1.pdf");
outputStream=new FileOutputStream(file);
try
{
Document document=new Document();
PdfWriter.getInstance(document,outputStream);
document.open();
Paragraph paragraph=new Paragraph("Hello World");
document.add(paragraph);
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