package pooa20171.iff.br.bibliotecaapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import pooa20171.iff.br.bibliotecaapp.R;
import pooa20171.iff.br.bibliotecaapp.activity.model.Livro;

public class LivroDestaqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livro_destaque);

        Intent intent = getIntent();
        Livro livro = (Livro) intent.getSerializableExtra("livro");

        EditText nome = (EditText) findViewById(R.id.et_nome_livro_destaque);
        EditText autor = (EditText) findViewById(R.id.et_autor_livro_destaque);
        EditText descricao = (EditText) findViewById(R.id.et_descricao_livro_destaque);

        nome.setText(livro.getNome());
        autor.setText(livro.getAutor());
        descricao.setText(livro.getDescricao());
    }
}
