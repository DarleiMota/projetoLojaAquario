package br.com.darleimota.aquario.model.animal;

public abstract class AnimalBase implements Animal {
    private String nome;
    private int idade;
    private String especie;
    private String descricao;

    public AnimalBase(String nome, int idade, String especie, String descricao) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.descricao = descricao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return String.format(
                "Animal [nome=%s, idade=%d, especie=%s, descricao=%s]",
                nome, idade, especie, descricao
        );
    }
}
