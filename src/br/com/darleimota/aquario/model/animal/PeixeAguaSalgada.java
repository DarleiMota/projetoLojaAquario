package br.com.darleimota.aquario.model.animal;

public class PeixeAguaSalgada extends AnimalBase {

    private double salinidade;
    private int tamanhoAquarioMinimo;

    public PeixeAguaSalgada(String nome, int idade, String especie, String descricao, double salinidade, int tamanhoAquarioMinimo,String comportamento) {
        super(nome, idade, especie, descricao, comportamento);
        this.salinidade = salinidade;
        this.tamanhoAquarioMinimo = tamanhoAquarioMinimo;
    }

    public double getSalinidade() {
        return salinidade;
    }

    public void setSalinidade(double salinidade) {
        this.salinidade = salinidade;
    }

    public int getTamanhoAquarioMinimo() {
        return tamanhoAquarioMinimo;
    }

    public void setTamanhoAquarioMinimo(int tamanhoAquarioMinimo) {
        this.tamanhoAquarioMinimo = tamanhoAquarioMinimo;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " esta fazendo bolhas na água ");

    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está nadando no fundo do aquário ");

    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo algas");
    }

    @Override
    public String toString() {
        return String.format(
                """
                ========= PEIXE ÁGUA SALGADA ========
                Nome: %s
                Idade: %d anos
                Espécie: %s
                Descrição: %s
                Salinidade: %.3f
                Tamanho Mínimo do Aquário: %dL
                Comportamento: %s
                =====================================
                """,
                getNome(), getIdade(), getEspecie(), getDescricao(),
                salinidade, tamanhoAquarioMinimo,getComportamento()
        );
    }
}


