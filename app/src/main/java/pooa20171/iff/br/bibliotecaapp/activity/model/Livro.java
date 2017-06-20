package pooa20171.iff.br.bibliotecaapp.activity.model;

import java.io.Serializable;

/**
 * Created by lglmo on 19/06/2017.
 */

public class Livro implements Serializable {

    private String nome;
    private String Autor;

    public Livro(String nome, String autor, String descricao) {
        this.nome = nome;
        Autor = autor;
        this.descricao = descricao;
    }

    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
