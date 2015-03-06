
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application
{
    public static void main(String[] args)
    {
        Test test = new Test();

        /*
         try
         {
         test.run();
         }
         catch (IOException ex)
         {
         System.out.println("Io issue");
         }
         catch (ParseException ex)
         {
         System.out.println("Could not parse command file");
         }
         */
        /*
         try
         {
         test.run();
         }
         catch (IOException | ParseException ex)
         {
         Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
         }
         */
        try
        {
            test.input();
        }
        catch (FileNotFoundException e)
        {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, e);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
