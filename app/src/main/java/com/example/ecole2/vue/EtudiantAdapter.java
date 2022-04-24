package com.example.ecole2.vue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ecole2.R;
import com.example.ecole2.entite.Etudiant;
import com.example.ecole2.entite.Formation;
import com.example.ecole2.util.Outils;

import java.util.List;

public class EtudiantAdapter extends BaseAdapter {
	private Context mContext;
	private List<Etudiant> mEtudiants;
	private LayoutInflater inflater;
	// Store the list of image planete
	public EtudiantAdapter(Context c, List<Etudiant> ids) {
		mContext = c;
		mEtudiants = ids;
		inflater = LayoutInflater.from(c);
	}
	// Return the number of items in the Adapter
	@Override
	public int getCount() {
		return mEtudiants.size();
	}
	// Return the data item at position
	@Override
	public Object getItem(int position) {
		return mEtudiants.get(position);
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

		TextView textNom;
		TextView textId;
		TextView textPrenom;
        View view;

		TextView textDebut;
        Etudiant etudiant = mEtudiants.get(position);
        //creations d'une nouvelle view de la liste
        if(convertView==null) {
            view = inflater.inflate(R.layout.view_etudiant, null);
        }
        else {
            view = convertView;           
        }
		textNom = (TextView) view.findViewById(R.id.etudiantNom);
		textNom.setText(etudiant.getNom());
		textId = (TextView) view.findViewById(R.id.etudiantId);
		textId.setText("Id: " + etudiant.getId());
		textPrenom = (TextView) view.findViewById(R.id.etudiantPrenomId);
		textPrenom.setText("Durée: " + etudiant.getPrenom());
        return view;
	}

}
