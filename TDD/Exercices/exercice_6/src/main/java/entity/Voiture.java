package entity;

import exception.ConditionValueException;

public class Voiture {
    private int RentDueIn;
    private int Condition;

    private Boolean luxury;
    private Boolean ancienne;

    public Voiture(int rentDueIn, int condition, Boolean luxury, Boolean ancienne) {
        RentDueIn = rentDueIn;
        Condition = condition;
        this.luxury = luxury;
        this.ancienne = ancienne;
    }

    public Voiture(int rentDueIn, int condition) {
        RentDueIn = rentDueIn;
        Condition = condition;
    }

    public void dailyRoutine() throws Exception {
        try {
            if (  getCondition()>0 &&  getCondition()<100
            ){
                if (ancienne == true){
                    setCondition(getCondition()-2);
                } else if(luxury == true){
                    setCondition(getCondition()+1);
                } else if(getRentDueIn() == 0){
                    setCondition(getCondition() -2);
                }
            }
        } catch (ConditionValueException e)  {
            throw new RuntimeException("valeur non comprise entre 0 et 100", e);
        }

//
    }

    public Voiture() {
    }

    public int getRentDueIn() {
        return RentDueIn;
    }

    public void setRentDueIn(int rentDueIn) {
        RentDueIn = rentDueIn;
    }

    public int getCondition() {
        return Condition;
    }

    public void setCondition(int condition) {
        Condition = condition;
    }
}
