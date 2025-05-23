package br.com.darleimota.aquario.model.animal;

public interface Animal {
    String getNome();
    int getIdade();
    String getEspecie();
    String getDescricao();
    void emitirSom();
    void mover();
    void alimentar();
}
