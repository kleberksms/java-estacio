/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacio;

import domain.entities.Faculdade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kleberksms
 */
public class EstacioFaculdade implements domain.interfaces.Faculdade{

    private final Faculdade faculdade;
    
    public EstacioFaculdade() {
        faculdade = new Faculdade();
        faculdade.setQuantidadeAlunos(10);
        faculdade.setQuantidadeCursos(15);
    }
    
    public Faculdade getInstance(){
        return faculdade;
    }

    @Override
    public List<Faculdade> Lista() {
        Faculdade f1 = new Faculdade();
        f1.setQuantidadeAlunos(2);
        f1.setQuantidadeCursos(3);
        
        Faculdade f2 = new Faculdade();
        f2.setQuantidadeAlunos(4);
        f2.setQuantidadeCursos(5);
        
        List<Faculdade> f = new ArrayList<>();
        f.add(f1);
        f.add(f2);
        f.add(faculdade);
        return f;
    }

    @Override
    public String CompletaFrase(Faculdade obj) {
        return "Temos "+ faculdade.getQuantidadeAlunos() + " Alunos e " + faculdade.getQuantidadeCursos() + " cursos";
    }
    
}
