import java.io.*;

import com.itextpdf.text.*;

import com.itextpdf.text.pdf.*;

class iText4
{
public static void main(String gg[])
{
OutputStream outputStream=null;
try
{
File file=new File("eg4.pdf");
outputStream=new FileOutputStream(file);
try
{
Document document=new Document();
PdfWriter.getInstance(document,outputStream);
document.open();

PdfPTable table=new PdfPTable(3);
float [] columnWidths={1f,3f,2f};
table.setWidths(columnWidths);

Font titleFont=FontFactory.getFont(FontFactory.TIMES_BOLD,20);
Font dataFont=FontFactory.getFont(FontFactory.TIMES_ROMAN,16);

PdfPCell title1=new PdfPCell(new Phrase("S.No.",titleFont));
title1.setHorizontalAlignment(Element.ALIGN_CENTER);
title1.setVerticalAlignment(Element.ALIGN_MIDDLE);
title1.setMinimumHeight(40f);
PdfPCell title2=new PdfPCell(new Phrase("Name",titleFont));
title2.setHorizontalAlignment(Element.ALIGN_CENTER);
title2.setVerticalAlignment(Element.ALIGN_MIDDLE);
title2.setMinimumHeight(40f);
PdfPCell title3=new PdfPCell(new Phrase("Gender",titleFont));
title3.setHorizontalAlignment(Element.ALIGN_CENTER);
title3.setVerticalAlignment(Element.ALIGN_MIDDLE);
title3.setMinimumHeight(40f);

table.addCell(title1);
table.addCell(title2);
table.addCell(title3);

PdfPCell data;
data=new PdfPCell(new Phrase("1",dataFont));
data.setHorizontalAlignment(Element.ALIGN_RIGHT);
data.setMinimumHeight(30f);
table.addCell(data);
data=new PdfPCell(new Phrase("Naruto Uzumaki",dataFont));
data.setHorizontalAlignment(Element.ALIGN_LEFT);
data.setMinimumHeight(30f);
table.addCell(data);
data=new PdfPCell(new Phrase("Male",dataFont));
data.setHorizontalAlignment(Element.ALIGN_LEFT);
data.setMinimumHeight(30f);
table.addCell(data);



data=new PdfPCell(new Phrase("2",dataFont));
data.setHorizontalAlignment(Element.ALIGN_RIGHT);
data.setMinimumHeight(30f);
table.addCell(data);

data=new PdfPCell(new Phrase("Asta",dataFont));
data.setHorizontalAlignment(Element.ALIGN_LEFT);
data.setMinimumHeight(30f);
table.addCell(data);

data=new PdfPCell(new Phrase("Male",dataFont));
data.setHorizontalAlignment(Element.ALIGN_LEFT);
data.setMinimumHeight(30f);
table.addCell(data);

data=new PdfPCell(new Phrase("3",dataFont));
data.setHorizontalAlignment(Element.ALIGN_RIGHT);
data.setMinimumHeight(30f);
table.addCell(data);

data=new PdfPCell(new Phrase("Mery",dataFont));
data.setHorizontalAlignment(Element.ALIGN_LEFT);
data.setMinimumHeight(30f);
table.addCell(data);

data=new PdfPCell(new Phrase("Female",dataFont));
data.setHorizontalAlignment(Element.ALIGN_LEFT);
data.setMinimumHeight(30f);
table.addCell(data);

document.add(table);
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