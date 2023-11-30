import com.workintech.burgercompany.enums.BreadRollType;
import com.workintech.burgercompany.enums.ChipsType;
import com.workintech.burgercompany.enums.DrinkType;
import com.workintech.burgercompany.model.*;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "NORMAL", 3.56, BreadRollType.WRAP);

        hamburger.addAddition("Tomato", 0.27);

        hamburger.addAddition("Lettuce", 0.75);

        hamburger.addAddition("Cheese", 1.13);

        hamburger.addAddition("Pickle", 0.25);

        hamburger.addAddition("Test", 5);

        hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreadRollType.SANDWICH);

        healthyBurger.addAddition("Egg", 5.43);

        healthyBurger.addAddition("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger(new Drink(DrinkType.FANTA), new Chips(ChipsType.CURLY));

        db.addAddition("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}
