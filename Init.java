//Linebaseret processing
import java.io.*;
import java.util.*;


public class Init
{


   public static void main (String[] args)
      throws FileNotFoundException
   {
      FileDataHandler fdh = new FileDataHandler();
      fdh.startFileHandling(); 
       StartMenu();
   }
   public static void StartMenu()
     throws FileNotFoundException
   {
      Scanner userInput = new Scanner(System.in);
      Scanner console = new Scanner(System.in);
         
      //Søger på en serie
      System.out.print("What serie are you searching for?");
      String serieName;
      Search s = new Search();
      while (true)
     {  
         //Search.searchCount++;
         serieName = console.nextLine();
         s.searchLog(serieName);
         s.searchForSeries(serieName);
         System.out.println("Search again? \n 1 for yes. \n 2 for no.");
         int search = userInput.nextInt();
         if (search == 1)
         {
            System.out.println("Make a new searching: ");
         }
            else if (search == 2)
         {
            System.out.println("Exiting program - See you next time!");
            break;
         }
         else 
         {
            System.out.println("Not an option - please try again");
         }
      }

   }
}