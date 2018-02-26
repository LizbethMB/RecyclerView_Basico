package ittepic.edu.mx.recyclerview_basico;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LIZBETHMB on 26/02/2018.
 */

public class Adaptador_Alumnos extends RecyclerView.Adapter<Adaptador_Alumnos.ViewHolderAlumnos> {

     ArrayList<Alumnos> listaalumnos;

    public  Adaptador_Alumnos(ArrayList<Alumnos>listaalumnos){
        this.listaalumnos=listaalumnos;
    }

    @Override
    public ViewHolderAlumnos onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_alumnos,null,false);

        return new ViewHolderAlumnos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderAlumnos holder, int position) {

        holder.enombre.setText(listaalumnos.get(position).getNombre());
        holder.econtrol.setText(listaalumnos.get(position).getNumControl());
        holder.ecarrera.setText(listaalumnos.get(position).getCarrera());
        holder.foto.setImageResource(listaalumnos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaalumnos.size();
    }

    class ViewHolderAlumnos extends RecyclerView.ViewHolder{
         TextView  enombre,econtrol,ecarrera;
        ImageView foto;

        public ViewHolderAlumnos(View itemView) {
            super(itemView);
            enombre=(TextView)itemView.findViewById(R.id.idNombre);
            econtrol=(TextView)itemView.findViewById(R.id.idNumControl);
            ecarrera=(TextView)itemView.findViewById(R.id.idCarrera);
            foto=(ImageView)itemView.findViewById(R.id.idImgen);

        }
    }
}
