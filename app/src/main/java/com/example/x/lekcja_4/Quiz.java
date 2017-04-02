package com.example.x.lekcja_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        final Button odpowiedz = (Button) findViewById(R.id.odpowiedzi);

        odpowiedz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int liczba_punktow = 0;

                RadioGroup kozuchowskaRadioGroup = (RadioGroup) findViewById(R.id.odpowiedz_m_koz);
                RadioGroup sochaRadioGroup = (RadioGroup) findViewById(R.id.odpowiedz_m_soch);
                RadioGroup sokolowskaRadioGroup = (RadioGroup) findViewById(R.id.odpowiedz_a_sok);
                RadioGroup popowskaRadioGroup = (RadioGroup) findViewById(R.id.odpowiedz_k_pop);
                RadioGroup zielinskaRadioGroup = (RadioGroup) findViewById(R.id.odpowiedz_k_zie);

                RadioButton kozuchowska = (RadioButton) findViewById(R.id.radioButtonM1);
                RadioButton socha = (RadioButton) findViewById(R.id.radioButtonS1);
                RadioButton sokolowska = (RadioButton) findViewById(R.id.radioButtonA2);
                RadioButton popowska = (RadioButton) findViewById(R.id.radioButtonK1);
                RadioButton zielinska = (RadioButton) findViewById(R.id.radioButtonZ1);

                int sprawdz_kozuchowska = kozuchowskaRadioGroup.getCheckedRadioButtonId();
                RadioButton sprawdz_kozuchowskaButton = (RadioButton) findViewById(sprawdz_kozuchowska);

                int sprawdz_socha = sochaRadioGroup.getCheckedRadioButtonId();
                RadioButton sprawdz_sochaButton = (RadioButton) findViewById(sprawdz_socha);

                int sprawdz_sokolowska = sokolowskaRadioGroup.getCheckedRadioButtonId();
                RadioButton sprawdz_sokolowskaButton = (RadioButton) findViewById(sprawdz_sokolowska);

                int sprawdz_popowska = popowskaRadioGroup.getCheckedRadioButtonId();
                RadioButton sprawdz_popowskaButton = (RadioButton) findViewById(sprawdz_popowska);

                int sprawdz_zielinska = zielinskaRadioGroup.getCheckedRadioButtonId();
                RadioButton sprawdz_zielinskaButton = (RadioButton) findViewById(sprawdz_zielinska);

                if(sprawdz_kozuchowskaButton!= null)
                    if(sprawdz_kozuchowskaButton.equals(kozuchowska))
                        liczba_punktow++;

                if(sprawdz_sochaButton!= null)
                    if(sprawdz_sochaButton.equals(socha))
                        liczba_punktow++;

                if(sprawdz_sokolowskaButton!= null)
                    if(sprawdz_sokolowskaButton.equals(sokolowska))
                        liczba_punktow++;

                if(sprawdz_popowskaButton!= null)
                    if(sprawdz_popowskaButton.equals(popowska))
                        liczba_punktow++;

                if(sprawdz_zielinskaButton!= null)
                    if(sprawdz_zielinskaButton.equals(zielinska))
                        liczba_punktow++;

                Toast.makeText(getApplicationContext(),"Zdobyta ilość punktów: "+liczba_punktow+" /9", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
