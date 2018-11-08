public class Movie
{
   //Attributes
   private int id;
   private String name;
   private double lengthMinutes;
   private String released;
   private String director;
   private double ratingID;
   
   //Dummie
   public Movie()
   {
      this.id = 0;
      this.name = "";
      this.lengthMinutes = 0.0;
      this.released = "";
      this.director = "";
      this.ratingID = 0.0; 
   }
   
   //Constructor
   public Movie(int id, String name, double lengthMinutes, String released, String director, double ratingID)
   {
      this.id = id;
      this.name = name;
      this.lengthMinutes = lengthMinutes;
      this.released = released;
      this.director = director;
      this.ratingID = ratingID; 
   }   
   
   //Setter
   public void setID(int id)
   {
      this.id = id;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setLengthMinutes(double lengthMinutes)
   {
      this.lengthMinutes = lengthMinutes;
   }
   
   public void setReleased(String released)
   {
      this.released = released;
   }
   
   public void setDirector(String director)
   {
      this.director = director;
   }
   
   public void setRatindID(double ratingID)
   {
      this.ratingID = ratingID;
   }
   //Getter
   
}