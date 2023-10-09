package superheroi.model;

public class Vilao extends Personagem{
    private Integer tempoDePrisao;

    public Vilao(Integer tempoDePrisao, String nome, String superPoder) {
        this.setNome(nome);
        this.setSuperPoder(superPoder);
        this.tempoDePrisao = tempoDePrisao;
    }
}
