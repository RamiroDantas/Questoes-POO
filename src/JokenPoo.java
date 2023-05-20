import java.util.Random;
import java.util.Scanner;

public class JokenPoo {
	
	static final int PEDRA = 0;
	static final int PAPEL = 1;
	static final int TESOURA = 2;
 
	static public void main(String[] args){
		System.out.println("Vamos jogar Pedra, Papel, Tesoura!\n");
		System.out.println(" 0 = PEDRA\n 1 = PAPEL\n 2 = Tesoura!\n");
		System.out.println("Insira abaixo:\n ");
        
		int jogadaUsuario = recebeJogadaUsuario();

        if(jogadaUsuario == -1) {
            return;
        }

		int jogadaCpu = geraJogadaCpu();
		int resultado = executaJogada(jogadaUsuario, jogadaCpu);
		exibeResultado(jogadaUsuario, jogadaCpu, resultado);
	}
	
	static public int recebeJogadaUsuario(){
        Scanner Ler = new Scanner(System.in);
        int nmr = Ler.nextInt();

        if(nmr <= 2 && nmr >= 0) {
            return nmr;
        } else {
            System.out.println("Número inválido");
            return -1;
        }

	}
	
	static public int geraJogadaCpu(){
		Random rnd = new Random();
		long semente = System.currentTimeMillis();
		rnd.setSeed(semente);
		return rnd.nextInt(3); // retorna aleatorio entre 0 e 2
	}
	
	static public int executaJogada(int jogadaUsuario, int jogadaCpu){

        
		if(jogadaUsuario == 0 && jogadaCpu == 2) {
            return 1;
        } else if(jogadaUsuario == 1 && jogadaCpu == 0) {
            return 1;
        } else if(jogadaUsuario == 2 && jogadaCpu == 1){
            return 1;
        } else if(jogadaCpu == 0 && jogadaUsuario == 2){
            return 2;
        } else if(jogadaCpu == 1 && jogadaUsuario == 0){
            return 2;
        } else if(jogadaCpu == 2 && jogadaUsuario == 1){
            return 2;
        } else {
            return 0;
        }

	}
	
	static public void exibeResultado(int jogadaUsuario, int jogadaCpu, int resultado){
		System.out.println("Sua jogada: " + jogadaUsuario + "\n");
		System.out.println("Jogada da CPU: " + jogadaCpu + "\n");

        if(resultado == 0) {
            System.out.println("O jogo empatou!\n");
        } else if(resultado == 1) {
            System.out.println("Você ganhou!\n");
        } else if(resultado == 2) {
            System.out.println("Você perdeu!\n");
        }


	}
	
}