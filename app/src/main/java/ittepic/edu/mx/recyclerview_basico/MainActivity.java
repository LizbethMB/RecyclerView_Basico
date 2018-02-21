package ittepic.edu.mx.recyclerview_basico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listaDatos;
    RecyclerView recycler1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler1 = (RecyclerView) findViewById(R.id.idRecycler);
        recycler1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        listaDatos = new ArrayList<String>();

        for (int i = 0; i <= 50; i++) {

            listaDatos.add(" Dato  numero "+i+" ");
        }
        Datos adapter=new Datos(listaDatos);
        recycler1.setAdapter(adapter);
    }
}
