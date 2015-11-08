package Kata4v4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Kata4v4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pathname="C:\\Users\\usuario\\Desktop\\mail.txt";
        ArrayList <String> mailList = MailReader.read(pathname);
        Histogram<String> histogram= MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
