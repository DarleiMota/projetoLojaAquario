package br.com.darleimota.aquario.model.animal;

public class ReptilTerrario extends AnimalBase {

    private int umidadeIdeal;
    private boolean necessitaLuzUV;

    public ReptilTerrario(String nome, int idade, String especie, String descricao, int umidadeIdeal, boolean necessitaLuzUV) {
        super(nome, idade, especie, descricao);
        this.umidadeIdeal = umidadeIdeal;
        this.necessitaLuzUV = necessitaLuzUV;
    }

    public int getUmidadeIdeal() {
        return umidadeIdeal;
    }

    public void setUmidadeIdeal(int umidadeIdeal) {
        this.umidadeIdeal = umidadeIdeal;
    }

    public boolean isNecessitaLuzUV() {
        return necessitaLuzUV;
    }

    public void setNecessitaLuzUV(boolean necessitaLuzUV) {
        this.necessitaLuzUV = necessitaLuzUV;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está emitindo um som shiiii shiii shiii  ");

    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está parado tomando banho de sol ");

    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está abocanhando um inseto");
    }

    public String toString() {
        return String.format(
                """
                =========== RÉPTIL TERRÁRIO ==========
                Nome: %s
                Idade: %d anos
                Espécie: %s
                Descrição: %s
                Umidade Ideal: %d%%
                Necessita Luz UV? %s
                Comportamento: %s
                =====================================
                """,
                getNome(), getIdade(), getEspecie(), getDescricao(),
                umidadeIdeal, necessitaLuzUV ? "Sim" : "Não",
                "Gosta de se aquecer sob luzes e escalar rochas."
        );
    }
}
