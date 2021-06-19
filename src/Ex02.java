import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*O professor Wuni Jim Yensonal precisa de um programa para ajudar com um problema simples: 
		 * Para uma turma com 50 alunos precisa calcular a média da sala e descobrir quais são os alunos que precisarão 
		 * de um atendimento personalizado. O fluxo do programa deve ser o seguinte:
		A. Digitar as 50 notas em um vetor e, para cada nota digitada, digitar o nome do aluno correspondente em outro vetor
		B. Calcular a média das notas digitadas
		C. Para cada uma das notas que foi digitada e ficou abaixo da média, exibir uma mensagem que diga “Chamar o aluno para conversar”
		 * */
		
		Scanner leitor = new Scanner(System.in);
		
		double notas[] = new double[3];
		String nomes[] = new String[3];
		double media=0;
		
		
		//A. Digitar as 50 notas em um vetor e para cada nota digitada, digitar o nome do aluno em outro vetor
		
		for(int i=0; i<notas.length; i++) {
			
			System.out.println("Por favor digite o nome do aluno " + (i+1));
			nomes[i] = leitor.next();
			
			System.out.println("Por favor digite a nota do aluno " + (i+1));
			notas[i] = leitor.nextDouble();	
		}
		
		//B. Calcular a media das notas digitas
		
		for(int i=0; i<notas.length; i++) {
			media = media + notas[i];
		}
		
		media = media/notas.length;
		System.out.println("A media da turma é: " + media);
		
		//C. Para Cada uma das notas que foi digitada e ficou abaixo da media, exibir um msg que diga " Chamar o aluno para conversar!"
		
		for(int i=0; i<notas.length; i++) {
			if(notas[i] < media) {
				System.out.println("O aluno  " + nomes[i] + " tirou nota " + notas[i] + " , e esta abaixo da media. Chamar para conversar ");
			}
		}
		
		leitor.close();
	}
}
