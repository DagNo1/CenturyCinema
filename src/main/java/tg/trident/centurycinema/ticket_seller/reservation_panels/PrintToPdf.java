package tg.trident.centurycinema.ticket_seller.reservation_panels;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PrintToPdf {
    public void print(String title, String release_date, String duration, double price, int room_number, String period, String seats, String user_name) throws IOException {
        PDDocument pdfdoc = new PDDocument();
        PDPage page = new PDPage();
        pdfdoc.addPage(page);

        // Create a PDPageContentStream for writing to the page
        PDPageContentStream contentStream = new PDPageContentStream(pdfdoc, page);

        // Set the font and font size for the text
        PDFont font = PDType1Font.HELVETICA;
        int fontSize = 12;

        // Begin the text section
        contentStream.beginText();

        // Set the font and font size
        contentStream.setFont(font, fontSize);

        // Set the position on the page where you want to write the text
        float x = 100;
        float y = page.getMediaBox().getHeight() - 100;
        contentStream.newLineAtOffset(x, y);

        // Write the text
        String[] lines = {
                "Title: " + title,
                "Release Date: " + release_date,
                "Duration: " + duration,
                "Price: " + price,
                "Room Number: " + room_number,
                "Period: " + period,
                "Seats: " + seats,
                "User Name: " + user_name
        };

        float lineHeight = font.getFontDescriptor().getFontBoundingBox().getHeight() / 1000 * fontSize;
        for (String line : lines) {
            contentStream.showText(line);
            contentStream.newLineAtOffset(0, -lineHeight);
        }

        // End the text section
        contentStream.endText();

        // Close the content stream
        contentStream.close();

        // Save the PDF file
        pdfdoc.save("Pdf/Sample.pdf");

        // Print a success message
        System.out.println("PDF created");

        // Close the document
        pdfdoc.close();
    }
}
