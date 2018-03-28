package org.d3ifcool.angkotontheway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class InformasiAngkotActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_angkot);

        ArrayList<Angkot> data1 = new ArrayList<>();
        data1.add(new Angkot("Abdul Muis (Kebon Kelapa) - Cicaheum via Binong", R.drawable.angkot1));

        InformasiAngkotAdapter adapterAngkot = new InformasiAngkotAdapter(this, data1);

        ListView listView = (ListView) findViewById(R.id.act_listangkot);
        listView.setAdapter(adapterAngkot);
    }


}
