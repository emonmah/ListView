package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class User extends AppCompatActivity {
    ImageView imgPro;
    TextView txtName, txtCapital,txtPopulation,txtArea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user);
        Intent i = this.getIntent();

        imgPro = findViewById(R.id.img_pro);
        txtName = findViewById(R.id.txt_country_name);
        txtCapital = findViewById(R.id.txt_capital_name);
        txtPopulation = findViewById(R.id.txt_population);
        txtArea = findViewById(R.id.txt_area);

        if(i != null){
            String name = i.getStringExtra("name");
            String capital = i.getStringExtra("capital");
            int image = i.getIntExtra("flag",R.drawable.brazil);
            String population = i.getStringExtra("population");
            String area = i.getStringExtra("area");


            txtName.setText(name);
            txtCapital.setText(capital);
            txtPopulation.setText(population);
            txtArea.setText(area);
            imgPro.setImageResource(image);

        }


    }
}