package pooa20171.iff.br.bibliotecaapp.activity.model;

/**
 * Created by lglmo on 19/06/2017.
 */

public class Livro {

    private String nome;
    private String Autor;
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
