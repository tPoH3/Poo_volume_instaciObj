/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.poo;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args) {
            
        Pedro identidade = new Pedro();
        
        identidade.setIdade (19);
        identidade.setAltura  (1.83);
        identidade.setFirstName ("Pedro");
        identidade.setLastName  ("Lesbrao");
        identidade.setPeso (77);
        identidade.setNaturalidade ("Brasileiro");
        
        System.out.print(identidade.getIdade()+"\n");
        System.out.print(identidade.getAltura()+"\n");
        System.out.print(identidade.getFirstName()+"\n");
        System.out.print(identidade.getLastName()+"\n");
        System.out.print(identidade.getPeso()+"\n");
        System.out.print(identidade.getNaturalidade()+"\n");
        
        Volume caixa = new Volume();
        
        caixa.setAltura(10);
        caixa.setComprimento(90);
        caixa.setLargura(40);
        
        System.out.print(caixa.getVolume());
    }
}
