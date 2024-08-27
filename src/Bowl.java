public class Bowl {
    private int countFood;

    public int getCountFood(){
        return countFood;
    }

    public Bowl(int countFood){
        this.countFood = countFood;
    }

    public void foodDecrease(int countReduction){
        if(countFood > countReduction){
            countFood -= countReduction;
        }
    }

    public void foodIncrease(int countIncrease){
        countFood += countIncrease;
        System.out.println("В миску досыпали " + countIncrease + " еды");
    }

    public void showCountFood(){
        System.out.println("Еды в миске " + countFood);
    }
}
