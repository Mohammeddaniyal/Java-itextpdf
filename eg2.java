import com.itextpdf.kernel.font.*;
import com.itextpdf.layout.*;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.*;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.io.image.*;
import java.io.*;

public class eg2 {
    public static void main(String[] gg) {
        String fileName = "2.pdf";

        try {
            // Initialize PdfWriter and PdfDocument
            PdfWriter writer = new PdfWriter(new File(fileName));
            PdfDocument pdf = new PdfDocument(writer);

            // Create first page
            Document document1 = new Document(pdf);
            document1.setMargins(15, 15, 15, 15);

            // Add content to first page
            Image icon = new Image(ImageDataFactory.create("dressup.png"));
            icon.setWidth(100);
            icon.setHorizontalAlignment(HorizontalAlignment.LEFT);
            document1.add(icon);

            Paragraph p1 = new Paragraph();
            p1.add("UJJAIN ???????????????");
            document1.add(p1);

            // Close the first page
            document1.close();

            // Add a new page
            pdf.addNewPage();

            // Create second page
            Document document2 = new Document(pdf);

            // Add content to second page
            Paragraph p2 = new Paragraph();
            p2.add("Hello, I live in Ujjain");
            document2.add(p2);

            // Close the second page
            document2.close();

            System.out.println("PDF created successfully: " + fileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
