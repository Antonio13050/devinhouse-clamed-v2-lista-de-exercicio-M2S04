package superheroi.repository;

import superheroi.model.Personagem;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepository {

    private List<Personagem> personagens = new ArrayList<>();

    public void inserir(Personagem personagem) {
        personagens.add(personagem);
    }

    public List<Personagem> listar() {
        return personagens;
    }

}
