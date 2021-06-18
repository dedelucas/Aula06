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
		
		double notas[] = new double[50];
		String nomes[] = new String[50];
		double media;
		
		
		//A. Digitar as 50 notas em um vetor e para cada nota digitada, digitar o nome do aluno em outro vetor
		for(int i=0; i<notas.length; i++) {
			
			System.out.println("Por favor digite o nome do aluno " + (i+1));
			nomes[i] = leitor.next();
			
			System.out.println("Por favor digite a nota do aluno " + (i+1))
			notas[i] = leitor.nextDouble();
		
		}
		leitor.close();

