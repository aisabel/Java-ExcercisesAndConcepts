package CommonExamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateClass {

    //Java util.Date class that prints current system date


    public static void main (String [] args){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("d/M/yyyy hh:mm:ss");
        System.out.println("Default system date: "+d.toString());
        System.out.println("Formatted date with mins and seconds: "+sd.format(d));
        System.out.println("Formatted date d/M/yyyy: "+sdf.format(d));
    }
}
