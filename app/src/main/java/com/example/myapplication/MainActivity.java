package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{
    String[] conutriesName = {"Bangladesh", "Pakistan", "Nepal", "America", "Argentina", "Brazil", "Italy", "Spain"};

    String[] capital = {"Dhaka", "Islamabad", "Kathmandu", "Washington, D.C.","Buenos Aires","Brasília","Rome", "Madrid"};
    int[] countriesFlag = {R.drawable.bangladesh, R.drawable.pakistan, R.drawable.nepal, R.drawable.usa, R.drawable.argentina,R.drawable.brazil,R.drawable.italy,R.drawable.spain};
    String [] population = {"173562364","251269164","29651054","234514","6513258","918542","817573","14253451"};
    String[] area = {"5132543","7156353","9715364","9164362","91653752","9162574","81553763","8916537"};

    String[] links = {"https://www.countryreports.org/country/Bangladesh.htm","https://www.countryreports.org/country/pakistan.htm","https://www.countryreports.org/country/nepal.htm","https://www.countryreports.org/country/UnitedStatesofAmerica.htm","https://www.countryreports.org/country/argentina.htm","https://www.countryreports.org/country/brazil.htm","https://www.countryreports.org/country/italy.htm","https://www.countryreports.org/country/spain.htm"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.customelistview);
        CostomBaseadapter custombase = new CostomBaseadapter(MainActivity.this,conutriesName,countriesFlag,capital);
        listView.setAdapter(custombase);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Web_View.class);
                intent.putExtra("name",conutriesName[i]);
                intent.putExtra("capital",capital[i]);
                intent.putExtra("flag",countriesFlag[i]);
                intent.putExtra("population",population[i]);
                intent.putExtra("area",area[i]);
                intent.putExtra("links",links[i]);
                startActivity(intent);
            }
        });
    }

}