package atividade;

public class Livro {

    private String nome;
    private String autor;
    private int preco;
    private int numPg;



    
    public Livro(String nome, String autor, int preco, int numPg) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.numPg = numPg;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public int getNumPg() {
        return numPg;
    }
    public void setNumPg(int numPg) {
        this.numPg = numPg;
    }
    
    

}
