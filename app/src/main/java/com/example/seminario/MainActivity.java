package com.example.seminario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBoxHotel = findViewById(R.id.box_hotel);
        CheckBox checkBoxPousada = findViewById(R.id.box_pousada);
        CheckBox checkBoxChale = findViewById(R.id.box_chale);
        CheckBox checkBoxSitio = findViewById(R.id.box_sitio);
        CheckBox checkBoxHostel = findViewById(R.id.box_hostel);


        Slider sliderQuartos = findViewById(R.id.slide_quartos);
        TextView maxQuartos = findViewById(R.id.txt_maxQuartos);

        maxQuartos.setText("Max: " + sliderQuartos.getValue());

        sliderQuartos.addOnChangeListener(new Slider.OnChangeListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onValueChange(Slider slider, float value, boolean fromUser) {
                maxQuartos.setText("Max: " + sliderQuartos.getValue());
            }
        });






        checkBoxHotel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBoxHotel.isChecked()) {
                    Toast.makeText(MainActivity.this, "Você está buscando por hoteis", Toast.LENGTH_SHORT).show();

                }
            }

        });

        checkBoxPousada.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (checkBoxPousada.isChecked()) {
                    Toast.makeText(MainActivity.this, "Você está buscando por pousadas", Toast.LENGTH_SHORT).show();

                }
            }

        });


    }
}