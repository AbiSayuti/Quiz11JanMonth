package com.abisayuti.quiz11janmonth;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etinput;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etinput = (EditText) findViewById(R.id.etinput);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        txtHasil = (TextView) findViewById(R.id.txthasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //mengambil data ari widget text dan memasukkan kedalam nilai string
                String bulan = etinput.getText().toString();
                if (bulan.isEmpty()){
                    etinput.setError("Jangan kosong");

                }else {
                    if (bulan.equalsIgnoreCase("Januari")) {
                        txtHasil.setText("Bulan ke-1");
                    } else if (bulan.equalsIgnoreCase("Februari")) {
                        txtHasil.setText("Bulan ke-2");
                    } else if (bulan.equalsIgnoreCase("Maret")) {
                        txtHasil.setText("Bulan ke-3");
                    } else if (bulan.equalsIgnoreCase("April")) {
                        txtHasil.setText("Bulan ke-4");
                    } else if (bulan.equalsIgnoreCase("Mei")) {
                        txtHasil.setText("Bulan ke-5");
                    } else if (bulan.equalsIgnoreCase("Juni")) {
                        txtHasil.setText("Bulan ke-6");
                    } else if (bulan.equalsIgnoreCase("Juli")) {
                        txtHasil.setText("Bulan ke-7");
                    } else if (bulan.equalsIgnoreCase("Agustus")) {
                        txtHasil.setText("Bulan ke-8");
                    } else if (bulan.equalsIgnoreCase("September")) {
                        txtHasil.setText("Bulan ke-9");
                    } else if (bulan.equalsIgnoreCase("Oktober")) {
                        txtHasil.setText("Bulan ke-10");
                    } else if (bulan.equalsIgnoreCase("November")) {
                        txtHasil.setText("Bulan ke-11");
                    } else if (bulan.equalsIgnoreCase("Desember")) {
                        txtHasil.setText("Bulan ke-12");
                    }else {
                        txtHasil.setText("Silahkan masukkan nama bulan");
                    }

                }





            }

            });



    }
}
