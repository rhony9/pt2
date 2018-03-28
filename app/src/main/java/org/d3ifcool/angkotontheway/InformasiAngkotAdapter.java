package org.d3ifcool.angkotontheway;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lathifah Zukhrufa A on 12/03/2018.
 */

public class InformasiAngkotAdapter extends ArrayAdapter {
    public InformasiAngkotAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_informasi_angkot, parent, false);
        }

        Angkot angkot = (Angkot) getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.gambarangkot);
        imageView.setImageResource(angkot.getmImageAngkot());

        TextView routeTextView = (TextView) listItemView.findViewById(R.id.jurusan);
        routeTextView.setText(angkot.getmRoute());

        TextView startTextView = (TextView) listItemView.findViewById(R.id.ruteawal);
        startTextView.setText(angkot.getmStart());

        TextView endTextView = (TextView) listItemView.findViewById(R.id.rutekembali);
        endTextView.setText(angkot.getmEnd());


        return listItemView;
    }
}
