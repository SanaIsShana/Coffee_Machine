
import java.util.Scanner;

public class CoffeeMachine {
    Scanner scan = new Scanner(System.in);
    private int machineOption;

    public void setMachineOption(int machineOption) {
        this.machineOption = machineOption;
    }
    public int getMachineOption() {
        return machineOption;
    }

    public void start(Ingredient ingredient, CoffeeMachine coffeeMachine, DrinkType drinkType, MoneyCount moneyCount){
            System.out.println("\n----------Coffee Machine----------");
            ingredient.GetIngredient();
            System.out.println("\n1.Status of Ingredient\n2.Fill Ingredient\n3.Clean Machine\n4.Make Coffee");
            System.out.println("5.How Many Coffee Have We Made?\n6.Exit");
            setMachineOption(scan.nextInt());
            switch (getMachineOption()){
                case 1:
                    ingredient.GetIngredient();
                    start(ingredient,coffeeMachine,drinkType, moneyCount);
                    break;
                case 2:
                    ingredient.SetIngrdient();
                    start(ingredient,coffeeMachine,drinkType, moneyCount);
                    break;
                case 3:
                    CleanMachine(ingredient);
                    break;
                case 4:
                    drinkType.MakeCoffee(ingredient,coffeeMachine,drinkType,moneyCount);
                    break;
                case 5:
                    System.out.println("\nWe have made " + ingredient.getCoffee_count() + " cups of Coffee");
                    break;
                case 6:
                    System.exit(0);
                    break;
        }
    }
    private void CleanMachine(Ingredient ingredient){
        ingredient.setCoffee_powder(0);
        ingredient.setWater(0);
        ingredient.setMilk(0);
        ingredient.setChai_powder(0);
        ingredient.setChocolate_powder(0);
        System.out.println("\nCleaning the Machine...");

    }

}
