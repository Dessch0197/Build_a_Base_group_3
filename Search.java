import java.util.*;
import java.io.*;
import java.util.Scanner;


public class Search 
{
  
  
   public String[] searchForSeries(String serie)
   {
      String[] result= new String[1000000];
      boolean found = false;
     
     // FileDataHandler.seriesArray.length-1, skulle bruge det,men pga fejlsøgning bruger et tal.
     String id = " "; 
     String genre = ""; 
      for(int i = 1; i< FileDataHandler.seriesArray.length-1; i++)
      {
         
         if(FileDataHandler.seriesArray[i] == null){
            break;
         }
         
         String temp = FileDataHandler.seriesArray[i].primaryTitel;
         //System.out.println(i + " "+ temp);
         //Det bruger vi så vi kan finde titelen i arrayet
         if (serie.equals(temp))
         {
            found= true;
            id = FileDataHandler.seriesArray[i].tconst;
            genre = FileDataHandler.seriesArray[i].genre;
            break;
         }

      }
      
      String parentTconst = " ";
      int count =0;
      for(int j = 1; j< FileDataHandler.episodeArray.length-1;j++)
      {
      
         if(FileDataHandler.episodeArray[j] == null){
            break;
         }
      
        parentTconst = FileDataHandler.episodeArray[j].parentTconst;
        //System.out.println(parentTconst);
        if(("\""+parentTconst).equals(id))
        {
            count++;
        }
      } 
      
      
      if(found)
      {
          System.out.println("Series is found!: " +"Name:" + serie + " Id " + id + " Number of Episodes:" + count + " Genre:" + genre );
      }
      else
      {
         System.out.println("Series is not found!: " + serie);
      }
   
   
      return result;
   }
   
   public void searchLog (String search)
   throws FileNotFoundException
   {
       //åbner output fil
      //File f = new File("searchLog.txt");
     // PrintStream output = new PrintStream(f);
      
      PrintStream output = new PrintStream( new FileOutputStream("searchLog.txt", true)); 
      
      output.println(search); 
      
      output.close();
       //output.append(search); 
   
   }
   
    /*public String[] getSearchLog()
      throws FileNotFoundException
   {
      //SL = SearchLog
      File sl = new File("searchLog.txt");
      Scanner scan = new Scanner(sl, "UTF-8");
      String[] prevSearches;
      int count = 0;
      
      while(scan.hasNextLine())
      {
         count++;
         scan.nextLine();
      }
      prevSearches = new String[count];
      for (int i=0; i=; i++)
      {
         
      }
   }*/
}