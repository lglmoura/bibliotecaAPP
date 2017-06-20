package pooa20171.iff.br.bibliotecaapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import pooa20171.iff.br.bibliotecaapp.R;
import pooa20171.iff.br.bibliotecaapp.activity.adapter.ClickRecyclerViewListener;
import pooa20171.iff.br.bibliotecaapp.activity.adapter.LivroAdapter;
import pooa20171.iff.br.bibliotecaapp.activity.model.Livro;


public class LivroActivity extends AppCompatActivity implements ClickRecyclerViewListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livro);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_livro);

        recyclerView.setAdapter(new LivroAdapter(getLivros(),this,this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);
    }

    private List<Livro> getLivros(){
        List<Livro> livros = new ArrayList<Livro>();
        int i =0;
        for(i=0;i<=20;i++){
            String iv = String.valueOf(i);
            Livro livro = new Livro("livro".concat(iv),"Autor".concat(iv),"Descricao".concat(iv));
            livros.add(livro);
        }
        return livros;

    }

    @Override
    public void onClick(Object object) {
        Intent intentLivro = new Intent(this,LivroDestaqueActivity.class);
        Livro livro = (Livro) object;
        intentLivro.putExtra("livro",livro);
        startActivity(intentLivro);
    }
}
