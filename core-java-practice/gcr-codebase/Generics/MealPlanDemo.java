interface MealPlan {

    void showMeal();

}


class VegetarianMeal implements MealPlan {

    public void showMeal() {
        System.out.println("Vegetarian Meal");
    }

}

class VeganMeal implements MealPlan {

    public void showMeal() {
        System.out.println("Vegan Meal");
    }

}

class KetoMeal implements MealPlan {

    public void showMeal() {
        System.out.println("Keto Meal");
    }

}

class HighProteinMeal implements MealPlan {

    public void showMeal() {
        System.out.println("High Protein Meal");
    }

}

class Meal<T extends MealPlan> {

    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public void generateMeal() {
        meal.showMeal();
    }

}

class MealGenerator {

    public static <T extends MealPlan> void validateMeal(T meal) {

        System.out.print("Generated: ");
        meal.showMeal();

    }

}


public class MealPlanDemo {

    public static void main(String[] args) {

        Meal<VegetarianMeal> meal1 =
                new Meal<>(new VegetarianMeal());

        Meal<KetoMeal> meal2 =
                new Meal<>(new KetoMeal());

        meal1.generateMeal();
        meal2.generateMeal();

        MealGenerator.validateMeal(new VeganMeal());
        MealGenerator.validateMeal(new HighProteinMeal());

    }

}
