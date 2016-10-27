package kata4.control;

import kata4.view.MailListReader;
import kata4.view.MailHistogramBuilder;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\usuario\\Desktop\\Kata4\\Kata4\\emailsfilev1.txt";
        ArrayList<String> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
