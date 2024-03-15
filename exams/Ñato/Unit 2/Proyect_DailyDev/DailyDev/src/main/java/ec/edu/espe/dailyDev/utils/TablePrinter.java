package ec.edu.espe.unittest.controller;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;

public class TablePrinter {

    public static void printTable(JTable table, JPanel headerPanel, String logoPath, String title) {
        try {
            PrinterJob printerJob = PrinterJob.getPrinterJob();

            printerJob.setPrintable(new Printable() {
                @Override
                public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                    if (pageIndex > 0) {
                        return Printable.NO_SUCH_PAGE;
                    }

                    Graphics2D g2d = (Graphics2D) graphics;

                    int logoWidth = 100;
                    int logoHeight = 50;
                    int x = (int) ((pageFormat.getImageableWidth() - logoWidth) / 2 + pageFormat.getImageableX());
                    int y = (int) pageFormat.getImageableY();
                    g2d.drawImage(loadImage(logoPath), x, y, logoWidth, logoHeight, null);

                    g2d.translate(0, logoHeight);

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String currentDate = dateFormat.format(new Date());
                    int dateX = (int) pageFormat.getImageableX() + 10; 
                    g2d.drawString("Printed on: " + currentDate, dateX, (int) pageFormat.getImageableY());

                    g2d.translate(4, 23);

                    int titleWidth = g2d.getFontMetrics().stringWidth(title);
                    int titleX = (int) ((pageFormat.getImageableWidth() - titleWidth) / 2 + pageFormat.getImageableX());
                    g2d.drawString(title, titleX, (int) pageFormat.getImageableY());

                    g2d.translate(0, 20);

                    double remainingHeight = pageFormat.getImageableHeight() - (logoHeight + 20 + 20);
                    double scale = Math.min(1.0, remainingHeight / table.getHeight());

                    g2d.scale(scale, scale);

                    table.setDoubleBuffered(false);

                    g2d.setFont(table.getFont().deriveFont(8f));

                    table.print(g2d);

                    table.setDoubleBuffered(true);

                    return Printable.PAGE_EXISTS;
                }
            });
            
            if (printerJob.printDialog()) {
                printerJob.print();
            }
        } catch (PrinterException ex) {
            System.out.println("Error printing table: " + ex.getMessage());
        }
    }

    private static Image loadImage(String imagePath) {
        return new ImageIcon(TablePrinter.class.getResource(imagePath)).getImage();
    }
}
