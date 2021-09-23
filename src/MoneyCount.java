import java.util.Scanner;

public class MoneyCount {
    private int moneyInput, moneyToPay;
    Scanner scan = new Scanner(System.in);

    public void setMoneyInput(int moneyInput) {
        this.moneyInput = moneyInput;
    }

    public int getMoneyInput() {
        return moneyInput;
    }

    public void setMoneyToPay(int moneyToPay) {
        this.moneyToPay = moneyToPay;
    }
    public int getMoneyToPay() {
        return moneyToPay;
    }


    public void price(DrinkType drinkType){
        if (drinkType.getCoffeeType() == 1) setMoneyToPay(20);
        else if (drinkType.getCoffeeType() == 2) setMoneyToPay(30);
        else if(drinkType.getCoffeeType() == 3) setMoneyToPay(35);
        else if (drinkType.getCoffeeType() == 4) setMoneyToPay(40);
    }

    public void Payment(DrinkType drinkType){
            price(drinkType);
            System.out.println("Amount to pay " + getMoneyToPay() + "kr, thanks!");
            setMoneyInput(scan.nextInt());
            if (getMoneyInput() == getMoneyToPay()) System.out.println("Your drink is ready!");

            else if (getMoneyInput() < getMoneyToPay()) {
                while (getMoneyToPay() != getMoneyInput()){
                setMoneyToPay(getMoneyToPay()-getMoneyInput());
                System.out.println("You need to pay " + getMoneyToPay() + "kr more, thanks!");
                setMoneyInput(scan.nextInt());
                if (getMoneyInput() > getMoneyToPay()) {
                    LargerPayment();
                    break;
                }
                }
            }
            else if (getMoneyInput() > getMoneyToPay()) {
                LargerPayment();
            }

    }
    public void LargerPayment(){
            setMoneyToPay(getMoneyInput()-getMoneyToPay());
            System.out.println("Here is your change " + getMoneyToPay() + "kr, thanks!");

    }


}
