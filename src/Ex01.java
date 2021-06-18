import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*Fa�a um programa que permita ao usu�rio digitar 30 atividades que ele realizou no dia. Ao final, 
		 * o programa deve possibilitar que o usu�rio escolha se quer exibir as atividades na ordem em que digitou 
		 * ou em ordem reversa.
		 * */
		
		String atividades[] = new String[30];		
		Scanner leitor = new Scanner(System.in);
		int ordem;
		
		//Para digitar as atividades vamos usar um for
		
		for(int i=0; i<atividades.length; i++) {
			System.out.println("Por favor, insira a " + (i+1 + " � atividades realizadas"));
			atividades[i] = leitor.nextLine();
		}
				
		System.out.println("Vc deseja exibir as atividades na ordem de digita��o ou ordem reversa?\n 1- Ordem 2-Inversa");
		ordem = leitor.nextInt();
		
		switch(ordem) {
		case 1:
			//Em Ordem
			for (int i=0;i<atividades.length; i++) {
				System.out.println(atividades[i]);
			}
		break;
		case 2:
			//Em Inversa
			for (int i=atividades.length-1; i>=0; i--) {
				System.out.println(atividades[i]);
			}
		break;
		default:
			System.out.println("Op��o Inv�lida");
		break;	
		}
		
	
		leitor.close();
		

	}

}

