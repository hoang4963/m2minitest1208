package material;

import java.time.LocalDate;

import date.CalculateDate;

public class CrispyFlour extends Material implements Discount {
    private static final double LAST_REAL_PERCENT = 0.6;
    private static final double REAL_PERCENT = 0.95;
    private static final int EXPIRYYEARS_OF_CRISPYFLOUR = 1;
    int quantity;
    CrispyFlour(){

    }
    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public double getAmount(){
        return quantity*cost;
    }
    @Override
    LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(EXPIRYYEARS_OF_CRISPYFLOUR);
    }

    @Override
    public double getRealMoney() {
        if (getRealValue())
            return LAST_REAL_PERCENT *getAmount();
        else return REAL_PERCENT *getAmount();
    }
    public boolean getRealValue(){
        LocalDate now = LocalDate.now();
        return CalculateDate.calculateDays(getExpiryDate().getDayOfMonth(),getExpiryDate().getMonthValue(),getExpiryDate().getYear()) - CalculateDate.calculateDays(now.getDayOfMonth(),now.getMonthValue(),now.getYear()) <= 120;
    }
}
