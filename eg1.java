import com.itextpdf.kernel.font.*;
import com.itextpdf.layout.*;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.*;
import com.itextpdf.kernel.pdf.*;

import com.itextpdf.io.image.*;
import java.io.*;
class eg1
{
public static void main(String []gg)
{
try
{
PdfWriter w=new PdfWriter(new File("1.pdf"));
PdfDocument pdf=new PdfDocument(w);
Document d1=new Document(pdf);
d1.setMargins(15,15,15,15);
Image icon=new Image(ImageDataFactory.create("dressup.png"));
icon.setWidth(100);

icon.setHorizontalAlignment(HorizontalAlignment.LEFT);
d1.add(icon);
Paragraph p1=new Paragraph();
p1.add("UJJAIN ???????????????");
d1.add(p1);
d1.close();
pdf.addNewPage();
Document d=new Document(pdf);
Paragraph p=new Paragraph();
p.add("Hello, i live in ujjain");
d.add(p);
d.close();
}catch(Exception e)
{
}
}
}
