package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int coffeeWater_ml = 200;
        int coffeeMilk_ml = 50;
        int coffeeBeans_g = 15;

        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print("> ");
        int storageWater_ml = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print("> ");
        int storageMilk_ml = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the machine has:");
        System.out.print("> ");
        int storageBeans_g = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print("> ");
        int cups = scanner.nextInt();

        int waterOrder = cups * coffeeWater_ml;
        int milkOrder = cups * coffeeMilk_ml;
        int beansOrder = cups * coffeeBeans_g;

        int leftoverWaterServings = (storageWater_ml - waterOrder) / coffeeWater_ml;
        int leftoverMilkServings = (storageMilk_ml - milkOrder) / coffeeMilk_ml;
        int leftoverBeanServings = (storageBeans_g - beansOrder) / coffeeBeans_g;
        int leftoverCups = 0;
        int totalCupsStorage = 0;

        if (leftoverWaterServings < leftoverMilkServings && leftoverWaterServings < leftoverBeanServings) {
            leftoverCups = leftoverWaterServings;
            totalCupsStorage = storageWater_ml / coffeeWater_ml;
        }
        else if (leftoverMilkServings < leftoverWaterServings && leftoverMilkServings < leftoverBeanServings) {
            leftoverCups = leftoverMilkServings;
            totalCupsStorage = storageMilk_ml / coffeeMilk_ml;
        }
        else if (leftoverBeanServings < leftoverWaterServings && leftoverBeanServings < leftoverMilkServings) {
            leftoverCups = leftoverBeanServings;
            totalCupsStorage = storageBeans_g / coffeeBeans_g;
        }

        if (storageWater_ml - waterOrder >= 0 && storageMilk_ml - milkOrder >= 0 && storageBeans_g - beansOrder >= 0 && leftoverCups > 0) {
            System.out.println("Yes, I can make that amount of coffee (and even " + leftoverCups + " more than that)");
        }
        else if (storageWater_ml - waterOrder >= 0 && storageMilk_ml - milkOrder >= 0 && storageBeans_g - beansOrder >= 0) {
            System.out.println("Yes, I can make that amount  of coffee");
        }
        else {
            System.out.println("No, I can only make " + totalCupsStorage + " cup(s) of coffee");
        }



    }
}
