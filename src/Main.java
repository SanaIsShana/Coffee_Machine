import java.util.Scanner;

public class Main {
    public static String startOption;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CoffeeMachine myCoffeeMachine = new CoffeeMachine();
        DrinkType drinkType = new DrinkType();
        Ingredient ingredient = new Ingredient();
        MoneyCount moneyCount = new MoneyCount();

        System.out.println("Want to Start The Machine? Y or N.");
        startOption = scan.nextLine();
        while (startOption != "n" || startOption != "N"){
            myCoffeeMachine.start(ingredient,myCoffeeMachine,drinkType, moneyCount);
        }
    }
}
