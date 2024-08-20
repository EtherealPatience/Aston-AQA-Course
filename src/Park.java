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

    public static class Attraction {
        public String name;
        public int workingHours;
        public int price;
        public int ageRestriction;
        public int minHeight;
        public  int maxHeight;

        public Attraction(String _name, int _workingHours, int _price, int _ageRestriction, int _minHeight, int _maxHeight){
            name = _name;
            workingHours = _workingHours;
            price = _price;
            ageRestriction = _ageRestriction;
            minHeight = _minHeight;
            maxHeight = _maxHeight;
        }

        public void showInfo(){
            System.out.println("Атрацион " + name + "\n" +
                    "часы работы: " + workingHours + "\n" +
                    "цена: " + price + "\n" +
                    "ограничение по возрасту: " + ageRestriction + "\n" +
                    "минимальный допустимый рост: " + minHeight + "\n" +
                    "максимально допустимый рост: " + maxHeight + "\n");
        }
    }
}
