package ittepic.edu.mx.recyclerview_basico;

import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LIZBETHMB on 20/02/2018.
 */

public class Datos extends RecyclerView.Adapter<Datos.ViewHolderDatos> {

    ArrayList<String> listaDatos;

    //generacion del contructor

    public Datos(ArrayList<String> listaDatos){
        this.listaDatos=listaDatos;
    }

    @Override //enlaz ael adaptador con el itemlist
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                  .inflate(R.layout.itemlist,null,false);

        return new ViewHolderDatos(view);
    }

    @Override //establece la conexion entre el adaptador y la clasen viewholderDatos
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
      holder.asignarDatos(listaDatos.get(position));
    }

    @Override //retorna el tamaño de la lista
    public int getItemCount() {

        return listaDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder{

        TextView datos;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            datos=(TextView) itemView.findViewById(R.id.idDatos);

        }

        public void asignarDatos(String dato) {

            datos.setText(dato);
        }
    }


}
