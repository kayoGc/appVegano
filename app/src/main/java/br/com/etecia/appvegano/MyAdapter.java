package br.com.etecia.appvegano;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// extemde primerio com o RecyclerView.Apadter
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    // da alt + enter se tiver vermelho
    private Context mContexto;

    private List<Filmes> lstFilmes;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.modelo_filmes, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idTitutloFilmes.setText(lstFilmes.get(position).getTitulo());
        holder.idIagemFilmes.setImageResource(lstFilmes.get(position).getImagem());
    }

    @Override
    public int getItemCount() {

        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView idTitutloFilmes;
        ImageView idIagemFilmes;
        CardView idCardFilmes;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTitutloFilmes = itemView.findViewById(R.id.idTituloFilmes);
            idIagemFilmes = itemView.findViewById(R.id.idImgFilmes);
            idCardFilmes = itemView.findViewById(R.id.cardFilmes);

        }
    }

}
