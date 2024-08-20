import java.util.ArrayList;

public class Park {
    public ArrayList<Attraction> attractionList = new ArrayList<Attraction>();

    public void addAttraction(Attraction attraction){
        attractionList.add(attraction);
    }

    public void deleteAttraction(Attraction attraction){
        attractionList.remove(attraction);
    }

    public void showAttractionsInfo(){
        for(Attraction attraction : attractionList){
            attraction.showInfo();
            System.out.println();
        }
    }

}
