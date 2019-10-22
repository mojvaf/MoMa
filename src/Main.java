import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Art> arts = new HashMap<>();
        Art pices = new Art("Guernica","Painting","David", 1937 , "He did this painting when he was young");
        arts.put("1", pices);
        Art pices2 = new Art("The Starry Night","oil painting","Mary", 1889 , "He did this painting when he was young");
        arts.put("2", pices2);
        Art pices3 = new Art("Untitled","Painting","John", 2018 , "He did this painting when he was young");
        arts.put("3", pices3);
        Art pices4 = new Art("Fiery Sunset","oil Painting","Sara", 1973 , "He did this painting when he was young");
        arts.put("4", pices4);
        Art pices5 = new Art("The Kiss","Painting","Leo", 1907 , "He did this painting when he was young2");
        arts.put("5", pices5);


        // 1 way the best and the most common
        for (Map.Entry<String, Art> entry: arts.entrySet()) {
            Art art = entry.getValue();
            String id = entry.getKey();
            System.out.printf("%s - %d %n",art.getName(), art.getYear());
        }
        // only for values, no access to keys
        //for (Art art: arts.values()) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please Enter your choice:");
        String choice= sc.next();
        if(arts.containsKey(choice)){
            Art selectedArt= arts.get(choice);
            System.out.println("Title:"+ selectedArt.getName());
            System.out.println("Type:"+ selectedArt.getType());
            System.out.println("Year:"+ selectedArt.getYear());
            System.out.println("Artist:"+ selectedArt.getArtist());
            System.out.println("Description:"+ selectedArt.getDescription());
        }
        else{
            System.out.println("Invalid number given");
        }
    }

}
