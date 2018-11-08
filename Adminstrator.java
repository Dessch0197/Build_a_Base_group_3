import java.util.*;

public class Adminstrator
{
   //klasse variabler
   
   boolean isAdmin;
   private String actor; 
   private String seriesTitel;
   private String movie; 
   
   
   public void setIsAdmin(boolean isAdmin_p) 
   {
      this.isAdmin = isAdmin_p;
   }
   
   public boolean getIsAdmin()
   {
      return isAdmin;
   }
   
   public void setActor(String actor_p)
   {
      this.actor = actor_p;
   }
   public void setSeriesTitel(String seriesTitel_p)
   {
      this.seriesTitel = seriesTitel_p;
   }
   public void setMovie (String movie_p)
   {
      this.movie = movie_p;
   }
   
   
}