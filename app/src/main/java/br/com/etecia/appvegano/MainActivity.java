package br.com.etecia.appvegano;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Filmes> listaFilmes;
    RecyclerView idRecylerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecylerView = findViewById(R.id.idlistaFilmes);

        listaFilmes = new ArrayList<>();

        // criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        // tipo de layout que a lista irá seguir
        idRecylerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2);

        // fixador de tamanho da lista - deixar lista mais rápida
        idRecylerView.setHasFixedSize(true);

        // ligar o recyclerView ao adaptador
        idRecylerView.setAdapter(adapter);


    }
}