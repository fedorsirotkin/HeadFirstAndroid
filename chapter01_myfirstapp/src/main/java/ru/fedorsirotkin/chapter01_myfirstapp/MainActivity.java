// Имя пакета
package ru.fedorsirotkin.chapter01_myfirstapp;

// Классы Android, используемые в MainActivity
import android.app.Activity;
import android.os.Bundle;

// MainActivity расширяет класс Activity
public class MainActivity extends Activity {

    // Реализация метода onCreate() из класса Activity.
    // Вызывается при первом создании активности
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Указывает, какой макет должен использоваться
        setContentView(R.layout.activity_main);
    }
}
