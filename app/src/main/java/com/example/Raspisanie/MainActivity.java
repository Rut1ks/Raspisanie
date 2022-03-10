package com.example.Raspisanie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.Raspisanie.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Item> items = new ArrayList<Item>();
    Boolean Chislitel = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recycleview);

        GetData();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items ));

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Chislitel == true)
                    Chislitel = false;
                else if(Chislitel == false)
                    Chislitel = true;

                items.clear();

                GetData();

                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items ));
            }
        });
    }

    private void GetData()
    {
        if(Chislitel == true) {
            items.add(new Item("Понедельник", "", R.drawable.color1,
                    "2: Разработка мобильных приложений", R.drawable.color2,
                    "3: Разработка программных модулей", R.drawable.color1,
                    "4: Технология разработки и защиты баз данных", R.drawable.color2,
                    "5 :Инструментальные средства разработки ПО", R.drawable.color1
            ));
            items.add(new Item("Вторник", "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1
            ));
            items.add(new Item("Среда", "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1
            ));
            items.add(new Item("Четверг", "", R.drawable.color1,
                    "2: Иностранный язык в проф. деятельности", R.drawable.color1,
                    "3: Разработка мобильных приложений", R.drawable.color1,
                    "4: Технология разработки программного обеспечения", R.drawable.color1,
                    "5: Системное программирование", R.drawable.color1

            ));
            items.add(new Item("Пятница", "1: Физическая культура", R.drawable.color1,
                    "2: Разработка программных модулей", R.drawable.color1,
                    "3: Технология разработки программного обеспечения", R.drawable.color2,
                    "4: Технология разработки и защиты баз данных", R.drawable.color1,
                    "", R.drawable.color1
            ));
        }
        else {
            items.add(new Item("Понедельник", "", R.drawable.color1,
                    "2: Разработка программных модулей", R.drawable.color3,
                    "3: Разработка программных модулей", R.drawable.color1,
                    "4: Системное программирование", R.drawable.color3,
                    "5 :Инструментальные средства разработки ПО", R.drawable.color1
            ));
            items.add(new Item("Вторник", "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1
            ));
            items.add(new Item("Среда", "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1,
                    "ПРАКТИКА", R.drawable.color1
            ));
            items.add(new Item("Четверг", "", R.drawable.color1,
                    "2: Иностранный язык в проф. деятельности", R.drawable.color1,
                    "3: Разработка мобильных приложений", R.drawable.color1,
                    "4: Технология разработки программного обеспечения", R.drawable.color1,
                    "5: Системное программирование", R.drawable.color1
            ));
            items.add(new Item("Пятница", "1: Физическая культура", R.drawable.color1,
                    "2: Разработка программных модулей", R.drawable.color1,
                    "3: Инструментальные средства разработки ПО", R.drawable.color3,
                    "4: Технология разработки и защиты баз данных", R.drawable.color1,
                    "", R.drawable.color1
            ));

        }

    }
}