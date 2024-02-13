package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class AritmaticCalculator extends AppCompatActivity {

    private EditText var1;
    private EditText var2;
    private Spinner aritmatika;
    private Button button;
    private TextView txtHasil1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aritmatic_calculator);

        var1 = findViewById(R.id.var1);
        var2 = findViewById(R.id.var2);
        aritmatika = findViewById(R.id.aritmatika);
        button = findViewById(R.id.button);
        txtHasil1 = findViewById(R.id.txtHasil1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!var1.toString().isEmpty() && !var2.toString().isEmpty()) {
                    double angka1 = Double.parseDouble(var1.getText().toString());
                    double angka2 = Double.parseDouble(var2.getText().toString());

                    double hasil;
                    String text = aritmatika.getSelectedItem().toString();
                    switch (text) {
                        case "Penjumlahan(+)":
                            hasil = angka1 + angka2;
                            txtHasil1.setText("Result : " + hasil);
                            break;
                        case "Pengurangan(-)":
                            hasil = angka1 - angka2;
                            txtHasil1.setText("Result : " + hasil);
                            break;
                        case "Perkalian(*)":
                            hasil = angka1 * angka2;
                            txtHasil1.setText("Result : " + hasil);
                            break;
                        case "Pembagian(/)":
                            hasil = angka1 / angka2;
                            txtHasil1.setText("Result : " + hasil);
                            break;

                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Masukkan kedua variabel terlebih dahulu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}