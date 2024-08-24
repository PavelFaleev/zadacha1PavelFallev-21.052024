import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<hotDrinkWithTemperature> drinks;

    public HotDrinksVendingMachine() {
        this.drinks = new ArrayList<>();
    }

    public void addDrink(hotDrinkWithTemperature drink) {
        drinks.add(drink);
    }

    @Override
    public hotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        for (hotDrinkWithTemperature drink : drinks) {
            if (drink.getName().equals(name) &&
                drink.getVolume() == volume &&
                drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
}