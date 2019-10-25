package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class fakeDatabase {
    /***
     * Retrieves an Article object using the provided id.
     */
    public static Food getFoodById(int foodID) {
        return food.get(foodID);
    }

    /***
     * Return an ArrayList containing all the food in the database.
     */
    public static ArrayList<Food> getAllFood() {
        return new ArrayList<Food>((List) Arrays.asList(food.values().toArray()));
    }

    private static final HashMap<Integer, Food> food = new HashMap<>();

    static {
        food.put(1, new Food(
                1,
                "Borger",
                10,
                "It's a burger but spelt with an O. A flat round cake of minced beef that is fried or grilled and typically served in a bread roll; a hamburger.\n",
                 0,
                R.drawable.food1
        ));
        food.put(2, new Food(
                2,
                "Chups",
                5,
                "Chips but spelt with a U. A thin slice of food (typically potato) made crisp by being fried, baked, or dried and eaten as a snack.",
                0,
                R.drawable.food2
        ));

        food.put(3, new Food(
                3,
                "Battered Fush",
                5,
                "Battered fish but spelt with a U. A limbless cold-blooded vertebrate animal with gills and fins living wholly in water.",
                0,
                R.drawable.food3
        ));

        food.put(4, new Food(
                4,
                "Whole Chucken",
                12,
                "Whole roasted chicken, but spelt with a U. A domestic fowl kept for its eggs or meat, especially a young one.",
                0,
                R.drawable.food4
        ));

        food.put(5, new Food(
                5,
                "pencecks",
                8,
                "Pancakes but filled with pens. A thin, flat cake of batter, fried on both sides in a pan and typically rolled up with a sweet or savoury filling.",
                0,
                R.drawable.food5
        ));

        food.put(6, new Food(
                6,
                "Blue juice",
                2,
                "Orange Juice spiked with a tonne of blue food colouring. A drink made from or flavoured with oranges.\n",
                0,
                R.drawable.food6
        ));

        food.put(7, new Food(
                7,
                "kek",
                5,
                "Vanilla kek xD. Cake which is made up of many keks which will constantly kek at you while you eat it. kek kek kek. An item of soft sweet food made from a mixture of flour, fat, eggs, sugar, and other ingredients, baked and sometimes iced or decorated.",
                0,
                R.drawable.food7
        ));

        food.put(8, new Food(
                8,
                "Fush n Chups",
                6,
                "It's battered fush n chups, A dish of fried fish fillets served with chips.\n",
                0,
                R.drawable.food8
        ));

        food.put(9, new Food(
                9,
                "Doggo",
                20,
                "Dogs that you can pay to pet, but not eat! A domesticated carnivorous mammal that typically has a long snout, an acute sense of smell, non-retractable claws, and a barking, howling, or whining voice.",
                0,
                R.drawable.food9
        ));

        food.put(10, new Food(
                10,
                "Corry",
                2,
                "It's a chucken curry, but spelt corry. A dish of meat, vegetables, etc., cooked in an Indian-style sauce of strong spices and typically served with rice.",
                0,
                R.drawable.food10
        ));

        food.put(11, new Food(
                11,
                "Instant Noodles",
                10,
                "Our exclusive Instant Noodles but good! Try them now and find out what makes them good. Instant noodles are a Japanese noodle dish, sold in a precooked and dried noodle block, with flavoring powder and/or seasoning oil.",
                0,
                R.drawable.food11
        ));

        food.put(12, new Food(
                12,
                "Soop",
                5,
                "Soop soop, but not spelt soup. It's soop. A liquid dish, typically savoury and made by boiling meat, fish, or vegetables etc. in stock or water.\n",
                0,
                R.drawable.food12
        ));

        food.put(13, new Food(
                13,
                "Ribs n Robs",
                35,
                "Actually just a rib rack. Very yum very expensive. Each of a series of slender curved bones articulated in pairs to the spine (twelve pairs in humans), protecting the thoracic cavity and its organs.\n",
                0,
                R.drawable.food13
        ));

        food.put(14, new Food(
                14,
                "Tee Bown Stayke",
                30,
                "It's a T-Bone Steak! But the menu is illiterate!  A T-bone steak is a thick piece of beef that contains a T-shaped bone.",
                0,
                R.drawable.food14
        ));

        food.put(15, new Food(
                15,
                "Surprise Dish",
                20,
                "Skidaddle skidoodle, your dish is now a surprise dish. An unexpected or astonishing event, fact, etc.",
                0,
                R.drawable.food15
        ));

    }
}
