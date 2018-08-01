//package experiments;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.FileNotFoundException;
import java.lang.InterruptedException;
import java.util.Date;
import java.util.Time;
import java.util.ArrayList;


public class Remembrall
{
    String path = "/Users/stanley.zhao/Desktop/AlertReminder/reminders.txt";

    public String[] extractData(String line)
    {
        String[] result = line.split(":");
        return result;
    }

    public void parseData() throws FileNotFoundException, InterruptedException
    {
        File f = new File(path);
        Scanner scan = new Scanner(f);
        //Thread.sleep(5*1000);
        while (scan.hasNextLine())
        {
            String nextLine = scan.nextLine();
            JOptionPane.showMessageDialog(null, nextLine);
            Thread.sleep(5*1000);
        }
    }

    public String getAction(String line)
    {
        String[] result = extractData(line);
        return result[0];
    }

    public String getDate(String line)
    {
      String[] result = extractData(line);
      return result[1];
    }

    public String getTime(String line)
    {
      String[] result = extractData(line);
      return result[2];
    }

    public static void main(String [] args) throws FileNotFoundException, InterruptedException
    {
        Remembrall a = new Remembrall();
        a.parseData();
    }
}
