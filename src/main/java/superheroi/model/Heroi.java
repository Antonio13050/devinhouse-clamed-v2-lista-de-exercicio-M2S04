package superheroi.model;

public class Heroi extends Personagem{
    private String nomeVidaReal;

    public Heroi(String nomeVidaReal, String nome, String superPoder) {
        this.setNome(nome);
        this.setSuperPoder(superPoder);
        this.nomeVidaReal = nomeVidaReal;
    }
}

