public class Attraction {
    protected String name;
    protected int workingHours;
    protected int price;
    protected int ageRestriction;
    protected int minHeight;
    protected  int maxHeight;

    protected Attraction(String _name, int _workingHours, int _price, int _ageRestriction, int _minHeight, int _maxHeight){
        name = _name;
        workingHours = _workingHours;
        price = _price;
        ageRestriction = _ageRestriction;
        minHeight = _minHeight;
        maxHeight = _maxHeight;
    }

    protected void showInfo(){
        System.out.println("Атрацион " + name + "\n" +
                "часы работы: " + workingHours + "\n" +
                "цена: " + price + "\n" +
                "ограничение по возрасту: " + ageRestriction + "\n" +
                "минимальный допустимый рост: " + minHeight + "\n" +
                "максимально допустимый рост: " + maxHeight + "\n");
    }
}
