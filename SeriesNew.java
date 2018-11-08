//Linebaseret processing
import java.io.*;
import java.util.*;

public class SeriesNew
{
   //Attributes
   
   public String tconst; 
   public String primaryTitel;  
   public String genre;
   
   public SeriesNew()
   {
      this.tconst = "";
      this.primaryTitel = "";
      this.genre = "";
   }
   
   public SeriesNew(String tconst_p, String primaryTitel_p,String genre_p)      
   {
      this.tconst = tconst_p;
      this.primaryTitel = primaryTitel_p;
      this.genre = genre_p;
   }
   
   public String getTconst()
   {
      return tconst;
   }
   
   public String getPrimaryTitel()
   {
      return primaryTitel;
   }
}