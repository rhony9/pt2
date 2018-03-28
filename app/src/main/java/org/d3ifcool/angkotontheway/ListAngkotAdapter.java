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
 * Created by Lathifah Zukhrufa A on 02/03/2018.
 */

public class ListAngkotAdapter extends ArrayAdapter {
    public ListAngkotAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_angkot, parent, false);
        }

        Angkot angkot = (Angkot) getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.gambar);
        imageView.setImageResource(angkot.getmImageAngkot());

        TextView routeTextView = (TextView) listItemView.findViewById(R.id.rute);
        routeTextView.setText(angkot.getmRoute());


        return listItemView;
    }




}
