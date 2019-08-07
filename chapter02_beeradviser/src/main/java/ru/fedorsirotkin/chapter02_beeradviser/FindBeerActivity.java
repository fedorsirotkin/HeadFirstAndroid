package ru.fedorsirotkin.chapter02_beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // Вызывается при клике на кнопке
    public void onClickFindBeer(View view) {

        // Получить ссылку на TextView
        TextView brands = (TextView) findViewById(R.id.brands);

        // Получить ссылку на Spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        // Получить вариант, выбранный в Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        // Получить рекомендации от класса BeerExpert
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }

        // Вывести сорта пива
        brands.setText(brandsFormatted);
    }
}
