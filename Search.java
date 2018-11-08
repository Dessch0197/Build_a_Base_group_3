import java.util.*;
import java.io.*;
import java.util.Scanner;


public class Search 
{
   //klasse variabler
   String actor;
   String director;
   String seriesTitle;
   String movie;
   
   public String getActor()
   {
      return actor; 
   }
   
   public String getDirector()
   {
      return director;
   }
   
   public String getSeries()
   {
      return seriesTitle;
   }
   
   public String getMovie()
   {
      return movie;
   }
   
   public String[] searchForSeries(String serie)
   {
      String[] result= new String[1000000];
      boolean found = false;
     
     // Menu.seriesArray.length-1, skulle bruge det,men pga fejlsøgning bruger et tal.
     String id = " "; 
      for(int i = 1; i< Menu.seriesArray.length-1; i++)
      {
         
         if(Menu.seriesArray[i] == null){
            break;
         }
         
         String temp = Menu.seriesArray[i].primaryTitel;
         //System.out.println(i + " "+ temp);Det bruger vi så vi kan finde titelen i arrayet
         if (serie.equals(temp))
         {
            found= true;
            id = Menu.seriesArray[i].tconst;
            break;
         }

      }
      
      String parentTconst = " ";
      int count =0;
      for(int j = 1; j< Menu.episodeArray.length-1;j++)
      {
      
         if(Menu.episodeArray[j] == null){
            break;
         }
      
        parentTconst = Menu.episodeArray[j].parentTconst;
        //System.out.println(parentTconst);
        if(("\""+parentTconst).equals(id))
        {
            count++;
        }
      } 
      
      
      if(found)
      {
          System.out.println("Series is found!: " +"Name:" + serie + " Id " + id + " Number of Episodes:" + count);
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
   
   

}