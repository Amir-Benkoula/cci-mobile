package com.example.ecole2.vue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ecole2.R;
import com.example.ecole2.entite.Formation;

import java.util.List;

public class FormationsAdapter extends BaseAdapter {
    private Context mContext;
    private List<Formation> mFormations;
    private LayoutInflater inflater;
    // Store the list of image planete
    public FormationsAdapter(Context c, List<Formation> ids) {
        mContext = c;
        mFormations = ids;
        inflater = LayoutInflater.from(c);
    }
    // Return the number of items in the Adapter
    @Override
    public int getCount() {
        return mFormations.size();
    }
    // Return the data item at position
    @Override
    public Object getItem(int position) {
        return mFormations.get(position);
    }
    // Will get called to provide the ID that
    // is passed to OnItemClickListener.onItemClick()
    @Override
    public long getItemId(int position) {
        return position;
    }
    // Return an ImageView for each item referenced by the Adapter
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textIntitule;
        TextView textDateDebut;
        TextView textDuree;
        View view;

        Formation formation = mFormations.get(position);
        //creations d'une nouvelle view de la liste
        if(convertView==null) {
            view = inflater.inflate(R.layout.view_formation, null);
        }
        else {
            view = convertView;
        }

        textIntitule = (TextView) view.findViewById(R.id.formationIntitule);
        textIntitule.setText(formation.getIntitule());
        textDateDebut = (TextView) view.findViewById(R.id.formationDateDebut);
        textDateDebut.setText("Début: " + formation.getDateDebut());
        textDuree = (TextView) view.findViewById(R.id.formationDuree);
        textDuree.setText("Durée: " + formation.getDureeMois() + " mois");
        return view;
    }

}
