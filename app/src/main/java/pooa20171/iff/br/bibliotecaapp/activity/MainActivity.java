package pooa20171.iff.br.bibliotecaapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import pooa20171.iff.br.bibliotecaapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irParaLivro(View v){
        Intent livro = new Intent(this,Livro.class);
        startActivity(livro);
    }
}
