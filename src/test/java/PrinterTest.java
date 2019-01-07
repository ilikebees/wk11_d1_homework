import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void paperVolume(){
        Printer printer = new Printer();
        assertEquals(100, printer.paperVolume());
    }

    @Test
    public void tonerVolume(){
        Printer printer = new Printer();
        assertEquals(20, printer.tonerVolume());
    }

    @Test
    public void print(){
        Printer printer = new Printer();
        assertEquals(90, printer.print(5, 2));
    }

//    @Test
//    public void refillPrinterPaper(){
//        Printer printer = new Printer();
//        Printer lowPaper = new Printer();
//        assertEquals(200, lowPaper.refillPrinterPaper());
//    }




}
