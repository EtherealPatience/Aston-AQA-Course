import java.util.ArrayList;

public class Park {
    private ArrayList<Attraction> attractionList = new ArrayList<Attraction>();
    private String parkName;
    private String email;
    private String phone;

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

    public void showParkInfo(){
        System.out.println("Парк " + parkName + ", контактный телефон: " + phone + ", email " + email);
    }

    public Park(String parkName, String email, String phone){
        this.parkName = parkName;
        this.email = email;
        this.phone = phone;
    }

    public static class Attraction {
        private String name;
        private int workingHours;
        private int price;
        private int ageRestriction;
        private int minHeight;
        private  int maxHeight;

        public Attraction(String name, int workingHours, int price, int ageRestriction, int minHeight, int maxHeight){
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
            this.ageRestriction = ageRestriction;
            this.minHeight = minHeight;
            this.maxHeight = maxHeight;
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
