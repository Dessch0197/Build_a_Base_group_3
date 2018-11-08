//Linebaseret processing
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Episode
{
   //Attributes
       
   private String tconst;
   public  String parentTconst;
   private String seasonNumber;
   private String episodeNumber;


   public Episode(String tconst_p, String parentTconst_p, String seasonNumber_p, String episodeNumber_p)
   {
      this.tconst = tconst_p;
      this.parentTconst = parentTconst_p;
      this.seasonNumber = seasonNumber_p;
      this.episodeNumber = episodeNumber_p; 
   }
 }