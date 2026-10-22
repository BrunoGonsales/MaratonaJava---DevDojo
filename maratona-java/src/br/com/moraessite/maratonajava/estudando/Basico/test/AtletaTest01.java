package br.com.moraessite.maratonajava.estudando.Basico.test;

import br.com.moraessite.maratonajava.estudando.Basico.dominio.Atleta;

public class AtletaTest01 {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Bruno", "Natação", 24);
        Atleta atleta2 = new Atleta("João Vitor", "Natação", 15);
        Atleta atleta3 = new Atleta("Heloisa", "Natação", 1);
        Atleta atleta4 = new Atleta("Claudemir", "Natação", 50);

        atleta1.imprimeAtleta();
        atleta1.imprimeCategoria();
        atleta2.imprimeAtleta();
        atleta2.imprimeCategoria();
        atleta3.imprimeAtleta();
        atleta3.imprimeCategoria();
        atleta4.imprimeAtleta();
        atleta4.imprimeCategoria();
    }
}
