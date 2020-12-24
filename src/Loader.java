import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    public static void main (String args[]) {
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("огурцы");
        groceryList.add("помидоры");
        groceryList.add("лук");
        groceryList.add("перец сладкий");
        groceryList.add("капуста");
        groceryList.add("салат");
        groceryList.add("кинза");
        groceryList.add("укроп");
        groceryList.add("лук зеленый");
        groceryList.add("чеснок");
        groceryList.add("перец острый");
        groceryList.add("яблоки");
        groceryList.add("груши");
        groceryList.add("бананы");
        groceryList.add("лимоны");
        groceryList.add("сыр твердый");
        groceryList.add("сыр творожный");
        groceryList.add("куриная голень");
        groceryList.add("фарш");
        groceryList.add("котлеты");
        groceryList.add("суповой набор");
        groceryList.add("форель");
        groceryList.add("хлеб");
        groceryList.add("арахисовая паста");
        groceryList.add("чай");
        groceryList.add("творог");
        groceryList.add("кефир");
        groceryList.add("сметана");
        groceryList.add("молоко");
        groceryList.add("яйца");
        groceryList.add("брокколи");
        groceryList.add("компотная смесь");
        groceryList.add("орехи");
        groceryList.add("семена");
        groceryList.add("мед");
        groceryList.add("овсянка");
        groceryList.add("рис");
        groceryList.add("мука");
        groceryList.add("макароны");
        groceryList.add("кукуруза");
        groceryList.add("консерва рыбная");
        groceryList.add("спички");
        groceryList.add("туалетная бумага");
        groceryList.add("лосьон после бритья");
        groceryList.add("пена для бритья");
        groceryList.add("шампунь");
        groceryList.add("гель для душа");
        groceryList.add("зубная паста");
        groceryList.add("зубная щетка");
        groceryList.add("стиральный порошок");
        groceryList.add("гель для посуды");
        groceryList.add("гель для сантехники");
        groceryList.add("мусорные мешки");
        groceryList.add("салфетки");
        groceryList.add("сигареты");
        groceryList.add("алкоголь");

        for ( ; ; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter product name: ");
            String inputName = scanner.nextLine().toLowerCase().trim();
            boolean checkingName = false;
            String[] shoppingList = new String[groceryList.size()];
            shoppingList = groceryList.toArray(shoppingList);

            if (inputName.equals("q")) {
                break;
            }
            for (String s : shoppingList) {
                if (inputName.equals(s)) {
                    checkingName = true;
                    groceryList.remove(s);
                }
            }
            if (checkingName) {
                System.out.println("Don't push");
                System.out.println("Your shopping list: " + groceryList);

            } else {
                System.out.println("Add the new product to your shopping list.");
            }
        }
    }
}
