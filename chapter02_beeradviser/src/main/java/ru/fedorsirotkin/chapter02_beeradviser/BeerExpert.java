package ru.fedorsirotkin.chapter02_beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List <String> getBrands(String color) {
        List <String> brands = new ArrayList<>();

        switch (color) {
            case ("Светлое"): // color.equals("Светлое");
                brands.add("\"Westvleteren\" Trappist Blond, 0.33 л\n");
                brands.add("BrewDog, \"Punk\" IPA, in can, 0.5 л\n");
                brands.add("\"Achel\" Blond, 0.33 л\n");
                brands.add("Buxton, \"Axe Edge\", 0.33 л\n");
                brands.add("Corsendonk, \"Agnus\" Tripel, 0.75\n");
                break;
            case ("Темное"):
                brands.add("\"Trappistes Rochefort\" 10, 0.33 л\n");
                brands.add("Rodenbach, \"Caractere Rouge\", 0.75 л\n");
                brands.add("\"Samuel Smith's\" Imperial Stout, 355 мл\n");
                brands.add("\"Westvleteren\" 8 (VIII), 0.33 л\n");
                brands.add("Van Honsebrouck, \"Kasteel\" Donker, 0.33 л\n");
                break;
            case ("Красное"):
                brands.add("\"Lindemans\" Framboise, 250 мл\n");
                brands.add("\"Lindemans\" Kriek, 250 мл\n");
                brands.add("\"Lindemans\" Old Kriek Cuvee Rene, 375 мл\n");
                brands.add("\"Grimbergen\" Rouge, 0.33 л\n");
                brands.add("Bockor, \"Jacobins\" Kriek, 0.33 л\n");
                break;
            default:
                brands.add("Нет такого пива...");;
                break;
        }

        return brands;
    }
}
