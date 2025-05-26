package br.com.darleimota.aquario.model.animal;

public class PeixeAguaDoce extends AnimalBase {

    private double pHIdeal;
    private int temperaturaIdeal;

    public PeixeAguaDoce(String nome, int idade, String especie, String descricao, double pHIdeal, int temperaturaIdeal,String comportamento) {
        super(nome, idade, especie, descricao, comportamento);
        this.pHIdeal = pHIdeal;
        this.temperaturaIdeal = temperaturaIdeal;
    }

    public double getpHIdeal() {
        return pHIdeal;
    }

    public void setpHIdeal(double pHIdeal) {
        this.pHIdeal = pHIdeal;
    }

    public int getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    public void setTemperaturaIdeal(int temperaturaIdeal) {
        this.temperaturaIdeal = temperaturaIdeal;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " esta fazendo um som de peixe de agua doce... glub glub glub");

    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está nadando calmamente pelo aquário de água doce");

    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo ração para peixes tropicais");
    }

    @Override
    public String toString() {
        return String.format(
                """
                ========== PEIXE ÁGUA DOCE ==========
                Nome: %s
                Idade: %d anos
                Espécie: %s
                Descrição: %s
                pH Ideal: %.1f
                Temperatura Ideal: %d°C
                Comportamento: %s
                =====================================
                """,
                getNome(), getIdade(), getEspecie(), getDescricao(),
                pHIdeal, temperaturaIdeal,getComportamento()
        );
    }
}

