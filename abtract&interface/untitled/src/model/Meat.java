package model;

import java.time.LocalDate;

import views.CalculateDate;

public class Meat extends Material implements Discount{
    private static final double LAST_REAL_PERCENT = 0.7;
    private static final double REAL_PERCENT = 0.9;
    private static final int EXPIRYDAY_OF_MEAT = 7;
    double weight;
    public Meat(){

    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    LocalDate getExpiryDate(){
        return manufacturingDate.plusDays(EXPIRYDAY_OF_MEAT);
    }
    @Override
    public double getAmount(){
        return weight*cost;
    }

    @Override
    public double getRealMoney() {
        if (getRealValue())
            return LAST_REAL_PERCENT *getAmount();
        else return REAL_PERCENT *getAmount();
    }
    public boolean getRealValue(){
        LocalDate now = LocalDate.now();
        return CalculateDate.calculateDays(getExpiryDate().getDayOfMonth(),getExpiryDate().getMonthValue(),getExpiryDate().getYear()) - CalculateDate.calculateDays(now.getDayOfMonth(),now.getMonthValue(),now.getYear()) <= 5;
    }
}
