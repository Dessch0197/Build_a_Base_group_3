//Linebaseret processing
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu
{
   //Attributes, er static pga. de er i main klassen
  public static Episode[] episodeArray = new Episode[100000000];
  public static SeriesNew[] seriesArray = new SeriesNew[100000000];
   static int counterEpisode = 1;
   static int counterSeries = 1;
   static int counter = 1;
   

   public static void main (String [] args)
      throws FileNotFoundException
   {
   //åbner min filen
   File f = new File("episode.csv");

   //sæt scanner på fil. Bruger UTF-8 er så jeg kan læse hele filen (havde problemer med at indlæse den.
   Scanner filInput = new Scanner(f, "UTF-8");
   counter = 1;
  
   //læs linier så længe der er flere
   while(filInput.hasNextLine())
   {
      //læs linie
      String s = filInput.nextLine();
      
      //Laver en counter så den springer overskriften over
      if (counter==1)
      {
         counter++;
         //betyder at den ikke går videre til processLine ved overskriften
         continue;
      }
      //processer næste linie
      processLine(s);
    
   }
   
   //her nulstiller jeg den igen så den tager overskriften med i min nye fil
   counter =1;
        
   //åbner min anden fil titelbasics her
   f= new File("titelbasics.csv");
   
   //sæt scanner på fil.Bruger UTF-8 er så jeg kan læse hele filen, ellers ville den stoppe ved linie 659.
   Scanner filInput2 = new Scanner(f, "UTF-8");
   //filInput2.useDelimiter("\t");
   
   //læs linier sæ længe der er flere
   while(filInput2.hasNextLine())
   {
      //læs linie
      String ord = filInput2.nextLine();
      
      //Laver en counter så den springer overskriften over
      if (counter==1)
      {
         counter++;
         //betyder at den ikke går videre til processLine ved overskriften
         continue;
      }
      
      //processer næste linie
      processLine2(ord);
    
    
   }
    Scanner console = new Scanner(System.in);
         
    //Søger på en serie
    System.out.print("What serie are you searching for?: ");
    String serieName = console.nextLine();
   
   Search s = new Search();
   s.searchLog(serieName);
   s.searchForSeries(serieName);
  // s.searchForSeries("BBC Sunday-Night Theatre");
   //Armchair Theatre
   
} 
   public static void processLine2(String text)
   {

     //System.out.println(text);
     //laver et array så jeg kan splitte kolonnerne op i tapulaterskift isedet for mellemrum
     String[] columns = text.split("\t"); 
     //System.out.println(columns[1]);
     
     String tconst = columns[0];
     String titelType = columns[1];
     String primaryTitel = columns[2];
     String orginalTitel = columns[3];
     String startYear = columns[4];
     String endYear = columns[5];
     String runtimeMinutes = columns[6];
     String genre = columns[7];
     
     //laver et nyt objekt af type seriesNy
     SeriesNew serie = new SeriesNew(tconst, titelType, primaryTitel, orginalTitel, startYear, endYear, runtimeMinutes, genre);
     
      //bruger mit klasse array til at gemme min fil serie i
      seriesArray[counterSeries] = serie;
      //min tæller
      counterSeries++;

      
      
      //System.out.println(" ID: " + tconst + " Titel Type:" + titelType + " Titel: " + primaryTitel + " Orginal Titel: " + orginalTitel + " Start Year:" + startYear + " End Year: " + endYear + " Minutes: " + runtimeMinutes + " Genre:" + genre); 
     
    }
  
   //processer linie
   public static void processLine(String text)
   {
      //udskriver linie
      //System.out.println(text);
      String[] colums = text.split("\t");
      
      String tconst = colums[0];
      String parentTconst = colums[1];
      //System.out.println(parentTconst);
      String seasonNumber = colums[2];;
      //pga fejl prøver jeg at printe dem ud hver især
      //System.out.println(seasonNumber);
      String episodeNumber = colums[3];
      //System.out.println(episodeNumber);
      
      //laver et nyt opjekt af type Episode
      Episode ep = new Episode (tconst,parentTconst,seasonNumber,episodeNumber);
      
      //bruger mit klasse array til at gemme min fil episode i
      episodeArray[counterEpisode] = ep;
      //min tæller 
      counterEpisode++;

      
     //System.out.println(tconst + " ID " + parentTconst + " parent TV serie " + seasonNumber + " Season: " + episodeNumber + "Episode: ");  
   
      
   
   }
   
   
     
}