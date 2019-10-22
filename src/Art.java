import java.time.Year;
import java.util.Set;

public class Art{
   private String name;
    private String type;
    private String Artist;
    private int year;
    private String description;

    public Art (String name, String type, String Artist, int year, String description){
        this.name = name;
        this.type = type;
        this.Artist = Artist;
        this.year = year;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name; }


    public String getType(){ return type;}
    public void setType(String type) { this.type = type; }


    public String getArtist() { return  Artist; }
    public void setArtist(String artist) { this.Artist = artist;}


    public int getYear() { return year; }
    public void setYear(String Year) { this.year = year;}

    public String getDescription() { return description;}
    public void setDescription(String description) { this.description = description;}
}
