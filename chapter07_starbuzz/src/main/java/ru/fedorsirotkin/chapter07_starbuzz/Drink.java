package ru.fedorsirotkin.chapter07_starbuzz;

public class Drink {

    private String name; private String description; private int imageResourceId;

    // Напитки это массив Drinks
    public static final Drink[] drinks = {
            new Drink("Латте", "Кофейный напиток родом из Италии, состоящий из молока (итал. latte) и кофе эспрессо.", R.drawable.latte),
            new Drink("Капучино", "Кофейный напиток итальянской кухни на основе эспрессо с добавлением в него подогретого вспененного молока.", R.drawable.cappuccino),
            new Drink("Флэт уайт", "Кофейный напиток родом из Австралии, придуманный в 1980-х годах. Готовится путём добавления нагретого паром молока с небольшим количеством пены (0,5 см) в двойную порцию эспресcо.", R.drawable.filter)
    };

    // Каждый напиток имеет имя, описание и ресурс изображения
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
