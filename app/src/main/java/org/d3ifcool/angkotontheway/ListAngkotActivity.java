package org.d3ifcool.angkotontheway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAngkotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_angkot);

        final ArrayList<Angkot> data = new ArrayList<>();
        data.add(new Angkot("Abdul Muis (Kebon Kelapa) - Cicaheum via Binong", R.drawable.angkot1));
        data.add(new Angkot("Abdul Muis (Kebon Kelapa) - Cicaheum via Aceh", R.drawable.angkot2));
        data.add(new Angkot("Abdul Muis (Kebon Kelapa) - Dago", R.drawable.angkot3));
        data.add(new Angkot("Abdul Muis (Kebon Kelapa) - Ledeng", R.drawable.angkot4));
        data.add(new Angkot("Abdul Muis (Kebon Kelapa) - Elang", R.drawable.angkot5));
        data.add(new Angkot("Cicaheum - Ledeng", R.drawable.angkot6));
        data.add(new Angkot("Cicaheum - Ciroyomg", R.drawable.angkot7));
        data.add(new Angkot("Cicaheum - Ciwastra - Derwati", R.drawable.angkot8));
        data.add(new Angkot("Cicaheum - Leuwipanjang", R.drawable.angkot9));
        data.add(new Angkot("Stasiun Hall - Dago", R.drawable.angkot10));
        data.add(new Angkot("Stasiun Hall - Sadang Serang", R.drawable.angkot11));
        data.add(new Angkot("Stasiun Hall - Ciumbeuleuit via Eyckman (belok)", R.drawable.angkot12));
        data.add(new Angkot("Stasiun Hall - Gede Bage", R.drawable.angkot13));
        data.add(new Angkot("Stasiun Hall - Sarijadi", R.drawable.angkot14));
        data.add(new Angkot("Stasiun Hall - Gunung Batu (Lintas Husein)", R.drawable.angkot15));
        data.add(new Angkot("Margahayu Raya - Ledeng", R.drawable.angkot16));
        data.add(new Angkot("Dago - Riung Bandung", R.drawable.angkot17));
        data.add(new Angkot("Dago - Pasar Induk Caringin", R.drawable.angkot18));
        data.add(new Angkot("Panghegar Permai - Dipatiukur", R.drawable.angkot19));
        data.add(new Angkot("Ciroyom - Sarijadi via Sukajadi", R.drawable.angkot20));
        data.add(new Angkot("Ciroyom - Cikudapateuh", R.drawable.angkot21));
        data.add(new Angkot("Sederhana - Buah Batu - Cipagalo (Kebon Kelapa - Buah Batu)", R.drawable.angkot22));
        data.add(new Angkot("Sederhana - Cimindi (Lintas Husein)", R.drawable.angkot22));
        data.add(new Angkot("Ciwastra - Ujung Berung", R.drawable.angkot24));
        data.add(new Angkot("Cisitu - Tegalega", R.drawable.angkot25));
        data.add(new Angkot("Cijerah - Ciwastra - Derwati", R.drawable.angkot26));
        data.add(new Angkot("Abdul Muis (Kebon Kelapa) - Mengger", R.drawable.angkot27));
        data.add(new Angkot("Elang - Cicadas (Elang - Kebon Kelapa)", R.drawable.angkot28));
        data.add(new Angkot("Antapani - Ciroyom", R.drawable.angkot29));
        data.add(new Angkot("Cicadas - Cibiru", R.drawable.angkot30));
        data.add(new Angkot("Bumi Panyileukan - Sekemirung (Gede Bage - Simpang Dago)", R.drawable.angkot31));
        data.add(new Angkot("Sadang Serang - Caringin", R.drawable.angkot32));
        data.add(new Angkot("Cibaduyut - Karang Setra (Cibaduyut - Kebon Kelapa)", R.drawable.angkot33));


        ListAngkotAdapter adapterAngkot = new ListAngkotAdapter(this, data);

        ListView listView = (ListView) findViewById(R.id.act_listangkot);
        listView.setAdapter(adapterAngkot);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Angkot customAngkot = (Angkot) adapterView.getItemAtPosition(i);

                String xRoute = customAngkot.getmRoute();
                int xImage = customAngkot.getmImageAngkot();
                String xStart = customAngkot.getmStart();
                String xEnd = customAngkot.getmEnd();

                //Toast.makeText(ListAngkotActivity.this, xStart, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(ListAngkotActivity.this, CustomerMapActivity.class);
                intent.putExtra("extraRoute", xRoute);
                intent.putExtra("extraImage", xImage);
                intent.putExtra("extraStart", xStart);
                intent.putExtra("extraEnd", xEnd);
                startActivity(intent);

            }

        });
    }
}
