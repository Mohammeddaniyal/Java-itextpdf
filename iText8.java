import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.*;
class iText7
{
public static void main(String gg[])
{
try
{
PdfWriter writer=new PdfWriter(new File("ex1.pdf"));
PdfDocument pdf=new PdfDocument(writer);
Document doc=new Document(pdf);
doc.add(new Paragraph("Daniyal"));
pdf.addNewPage();
doc.add(new Paragraph("Rehmani"));
pdf.addNewPage();
doc.add(new Paragraph("Thinking Machines"));
doc.close();
}catch(Exception exception)
{
System.out.println(exception.getMessage());
}
}
}