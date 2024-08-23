public class Bowl {
    public int countFood;

    public Bowl(int _countFood){
        countFood = _countFood;
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
