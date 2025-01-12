import java.io.*;
import com.itextpdf.awt.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
class iText5
{
public static void main(String gg[])
{
OutputStream outputStream=null;
try
{
File file=new File("eg5.pdf");
outputStream=new FileOutputStream(file);
try
{
Document document=new Document();
PdfWriter.getInstance(document,outputStream);
document.open();
Image image=Image.getInstance("snap.jpg");
image.scaleToFit(400,400);
document.add(image);
document.newPage();
image=Image.getInstance("dressup.png");
image.scaleToFit(400,400);
document.add(image);
document.close();
System.out.println("PDF with image generated");
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