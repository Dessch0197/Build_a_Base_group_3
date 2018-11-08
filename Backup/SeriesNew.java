//Linebaseret processing
import java.io.*;
import java.util.*;

public class SeriesNew
{
   //Attributes
   
   public String tconst; 
   private String titelType; 
   public String primaryTitel; 
   private String orginalTitel;
   private boolean isAdult;
   private String startYear;
   private String endYear;
   private String runtimeMinutes;
   private String genre; 
   
   public SeriesNew(String tconst_p, String titelType_p, String primaryTitel_p, String orginalTitel_p, String startYear_p, String endYear_p, String runtimeMinutes_p, String genre_p)      
   {
      this.tconst = tconst_p;
      this.titelType = titelType_p;
      this.primaryTitel = primaryTitel_p;
      this.orginalTitel = orginalTitel;
      isAdult = true;
      this.startYear = startYear_p;
      this.endYear = endYear_p;
      this.runtimeMinutes = runtimeMinutes_p;
      this.genre = genre_p;
   }
}