import java.util.Scanner;

public class DrinkType {
    private int coffeeType;
    Scanner scan = new Scanner(System.in);

    public void setCoffeeType(int coffeeType) {
        this.coffeeType = coffeeType;
    }

    public int getCoffeeType() {
        return coffeeType;
    }

    public void MakeCoffee(Ingredient ingredient, CoffeeMachine coffeeMachine, DrinkType drinkType, MoneyCount moneyCount) {
        System.out.println("---- Choose Your Coffee ----\n1.Black Coffee ------ 20kr\n2.Milk Coffee ------- 30kr");
        System.out.println("3.Chai Latte -------- 35kr\n4.Warm Chocolate ---- 40kr");
        setCoffeeType(scan.nextInt());
        switch (getCoffeeType()) {
            case 1:
                BlackCoffee(ingredient,coffeeMachine,drinkType, moneyCount);
                break;
            case 2:
                MilkCoffee(ingredient,coffeeMachine,drinkType, moneyCount);
                break;
            case 3:
                ChaiLatte(ingredient,coffeeMachine,drinkType, moneyCount);
                break;
            case 4:
                VarmChoklad(ingredient,coffeeMachine,drinkType, moneyCount);
                break;
        }
    }
        public void BlackCoffee(Ingredient ingredient, CoffeeMachine coffeeMachine,DrinkType drinkType, MoneyCount moneyCount) {

        if (ingredient.getCoffee_powder() >= 10 && ingredient.getWater() >= 0.2) {
                moneyCount.Payment(drinkType);
                System.out.println("Making Black Coffee...");
                System.out.println("Taking 10g of Coffee Powder.\nTaking 0.2 liter of water.");
                ingredient.setCoffee_powder(ingredient.getCoffee_powder() - 10);
                ingredient.setWater(ingredient.getWater() - 0.2);

                ingredient.setCoffee_count(ingredient.getCoffee_count() + 1);
            } else {
                System.out.println("\nPlease Fill the Ingredient!");
                coffeeMachine.start(ingredient,coffeeMachine,drinkType,moneyCount);
            }
            coffeeMachine.start(ingredient,coffeeMachine,drinkType, moneyCount);
        }
        public void MilkCoffee(Ingredient ingredient, CoffeeMachine coffeeMachine,DrinkType drinkType, MoneyCount moneyCount){
            if (ingredient.getCoffee_powder() >= 10 && ingredient.getWater() >= 0.2 && ingredient.getMilk() >= 0.1) {
                moneyCount.Payment(drinkType);
                System.out.println("Making Milk Coffee...");
                System.out.println("Taking 10g of Coffee Powder.\nTaking 0.2 liter of water.\nTaking 0.1 liter of water.");
                ingredient.setCoffee_powder(ingredient.getCoffee_powder() - 10);
                ingredient.setWater(ingredient.getWater() - 0.2);
                ingredient.setMilk(ingredient.getMilk() - 0.1);

                ingredient.setCoffee_count(ingredient.getCoffee_count() + 1);
            } else {
                System.out.println("\nPlease Fill the Ingredient!");
                coffeeMachine.start(ingredient,coffeeMachine,drinkType, moneyCount);
            }
        }
        public void ChaiLatte (Ingredient ingredient, CoffeeMachine coffeeMachine,DrinkType drinkType, MoneyCount moneyCount) {
            if (ingredient.getChai_powder() >= 20 && ingredient.getMilk() >= 0.2) {
                moneyCount.Payment(drinkType);
                System.out.println("Making Chai Latte...");
                System.out.println("Taking 10g of Chai Powder.\nTaking 0.2 liter of Milk.");
                ingredient.setChai_powder(ingredient.getChai_powder() - 20);
                ingredient.setMilk(ingredient.getMilk() - 0.2);

                ingredient.setCoffee_count(ingredient.getCoffee_count() + 1);
            } else {
                System.out.println("\nPlease Fill the Ingredient!");
                coffeeMachine.start(ingredient,coffeeMachine,drinkType, moneyCount);
            }
        }

        public void VarmChoklad (Ingredient ingredient, CoffeeMachine coffeeMachine,DrinkType drinkType, MoneyCount moneyCount) {

            if (ingredient.getChocolate_powder() >= 20 && ingredient.getMilk() >= 0.2) {
                moneyCount.Payment(drinkType);
                System.out.println("Making Warm Chocolate...");
                System.out.println("Taking 10g of Chocolate Powder.\nTaking 0.2 liter of Milk.");
                ingredient.setChai_powder(ingredient.getChai_powder() - 20);
                ingredient.setMilk(ingredient.getMilk() - 0.2);

                ingredient.setCoffee_count(ingredient.getCoffee_count() + 1);
            } else {
                System.out.println("\nPlease Fill the Ingredient!");
                coffeeMachine.start(ingredient,coffeeMachine,drinkType, moneyCount);
            }
        }
}
