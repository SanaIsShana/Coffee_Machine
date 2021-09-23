import java.text.DecimalFormat;

public class Ingredient {
    private double water, milk, coffee_powder, chai_powder, chocolate_powder;
    private int coffee_count;

    DecimalFormat df = new DecimalFormat("#.##");
    public void setCoffee_count(int coffee_count) {
        this.coffee_count = coffee_count;
    }
    public int getCoffee_count() {
        return coffee_count;
    }
    public void setCoffee_powder(double coffee_powder) {
        this.coffee_powder = coffee_powder;
    }
    public double getCoffee_powder() {
        return coffee_powder;
    }
    public void setWater(double water) {
        this.water = water;
    }
    public double getWater() {
        return water;
    }
    public void setMilk(double milk) {
        this.milk = milk;
    }
    public double getMilk() {
        return milk;
    }
    public void setChai_powder(double chai_powder) {
        this.chai_powder = chai_powder;
    }
    public double getChai_powder() {
        return chai_powder;
    }
    public void setChocolate_powder(double chocolate_powder) {
        this.chocolate_powder = chocolate_powder;
    }
    public double getChocolate_powder() {
        return chocolate_powder;
    }

    public void GetIngredient(){
        System.out.println("----------Current Status----------\n");
        System.out.println("Available Coffee Powder(Gram) " + df.format(getCoffee_powder()));
        System.out.println("Available Milk(Liter) " + df.format(getMilk()));
        System.out.println("Available Water(Liter) " + df.format(getWater()));
        System.out.println("Available Chai Powder(Gram) " + df.format(getChai_powder()));
        System.out.println("Available Chocolate Powder(Gram) " + df.format(getChocolate_powder()));
    }

    public void SetIngrdient(){
        setCoffee_powder(500);
        setMilk(1);
        setWater(2);
        setChai_powder(200);
        setChocolate_powder(300);
    }
}
