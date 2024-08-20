import java.util.ArrayList;

public class Park {
    public ArrayList<Attraction> attractionList = new ArrayList<Attraction>();
    public String parkName;
    public String email;
    public String phone;

    public void addAttraction(Attraction attraction){
        attractionList.add(attraction);
        System.out.println("Аттракцион " + attraction.name + " добавлен в парк " + parkName);
    }

    public void deleteAttraction(Attraction attraction){
        attractionList.remove(attraction);
        System.out.println("Атрракцион " + attraction.name + " удален из парка " + parkName);
    }

    public void showAttractionsInfo(){
        System.out.println("Парк: " + parkName + ", Количество аттракционов: " +attractionList.size());
        for(Attraction attraction : attractionList){
            System.out.println("Аттракцион номер " + (attractionList.indexOf(attraction)+1));
            attraction.showInfo();
        }
    }

    public Park(String _parkName, String _email, String _phone){
        parkName = _parkName;
        email = _email;
        phone = _phone;
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
            System.out.println("Название: " + name + "\n" +
                    "часы работы: " + workingHours + "\n" +
                    "цена: " + price + "\n" +
                    "ограничение по возрасту: " + ageRestriction + "\n" +
                    "минимальный допустимый рост: " + minHeight + "\n" +
                    "максимально допустимый рост: " + maxHeight + "\n");
        }
    }
}
