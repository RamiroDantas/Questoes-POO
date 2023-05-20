package Questao02;

public class Runner {

	public static void main(final String[] args) {

        Agenda a1 = new Agenda();

        Contato c1 = new Contato("Fulana", "8890001-0001");
        Contato c2 = new Contato("Fulana", "8890002-0002");
        Contato c3 = new Contato("Beltrano", "8890003-0003");
        Contato c4 = new Contato("Beltrana", "8890004-0004");

        a1.adicionar(c1);
        if(a1.adicionar(c2)){
            System.out.println("erro - ja existe contato com mesmo nome");
        }
        a1.adicionar(c3);
        a1.adicionar(c4);

        System.out.println("esperado = 3, retornado = " + a1.getTotalContatos());
        System.out.println("esperado = 8890004-0004, retornado = " + a1.getTelefone("Beltrana"));
        System.out.println("esperado = nao existe, retornado = " + a1.getTelefone("Fulano"));

    }
}
