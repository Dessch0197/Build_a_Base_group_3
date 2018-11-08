//Linebaseret processing
import java.io.*;
import java.util.*;

public class myFileReader

{
   //klasse variabler, er static pga. de er i main klassen
    Episode[] episodeArray = new Episode[100000000];
    Series[] seriesArray = new Series[100000000];
    int counterEpisode = 1;
    int counter = 1;
         
   
   public void FileReader()
  throws FileNotFoundException
   {
  
     //�bner min filen
   File f = new File("episode.csv");

   //s�t scanner p� filen
   Scanner filInput = new Scanner(f);
   //s� den ikke tager overskriften med 
   counter = 1;
   
   //l�s linier s� l�nge der er flere linier
   while(filInput.hasNextLine())
   {
      //l�s linie
      String s = filInput.nextLine();
      
      //Laver en counter s� den springer overskriften over
      if (counter==1)
      {
         counter++;
         //betyder at den ikke g�r videre til processLine ved overskriften
         continue;
      }
      //processer n�ste linie
      processLine(s);
    
   }
   
   
   
   //her nulstiller jeg den igen s� den tager overskriften med i min nye fil
   counter =1;
        
   //�bner min anden fil titelbasics her
   f= new File("titelbasics.csv");
   
   //s�t scanner p� fil
   Scanner filInput2 = new Scanner(f);
   
   //l�s linier s� l�nge der er flere
   while(filInput2.hasNextLine())
   {
      //l�s linie
      String s = filInput2.nextLine();
      
      //Laver en counter s� den springer overskriften over
      if (counter==1)
      {
         counter++;
         //betyder at den ikke g�r videre til processLine ved overskriften
         continue;
      }
      
      //processer n�ste linie
      processLine2(s);
    
   }
   //processer linie
      
} 
   public static void processLine2(String text)
   {
     System.out.println(text);
     //scanner linie
     Scanner linie = new Scanner(text);
     String tconst = linie.next();
     String titelType = linie.next();
     String primaryTitel = linie.next();
     String orginalTitel = linie.next();
     int startYear = linie.nextInt();
     int endYear = linie.nextInt();
     int runtimeMinutes = linie.nextInt();
     String genre = linie.next();
     
      //laver et nyt objekt af type seriesNy
     SeriesNew serie = new SeriesNew(tconst, titelType, primaryTitel, orginalTitel, startYear, endYear, runtimeMinutes, genre);
     
   }
  
   //processer linie
   public void processLine(String text)
   {
      //udskriver linie
      //System.out.println(text);
      
      //scanner linie
      Scanner linie = new Scanner(text);
      String tconst = linie.next();
      String parentTconst = linie.next();
      //System.out.println(parentTconst);
      String seasonNumber = linie.next();
      //pga fejl pt�ver jeg at printe dem ud hver is�r
      //System.out.println(seasonNumber);
      String episodeNumber = linie.next();
      //System.out.println(episodeNumber);
      
      //laver et nyt opjekt af type Episode
      Episode ep = new Episode (tconst,parentTconst,seasonNumber,episodeNumber);
      
      //bruger mit klasse array til at gemme min fil episode i
      episodeArray[counterEpisode] = ep;
      //min t�ller 
      counterEpisode++;

      
     //System.out.println(tconst + " ID " + parentTconst + " parent TV serie " + seasonNumber + " Season: " + episodeNumber + "Episode: ");  
   }
     
}

