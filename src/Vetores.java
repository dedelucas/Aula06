import java.util.Scanner;

public class Vetores{

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		/*int qtde;
		System.out.println("Digite a quantidade de alunos:");
		qtde = leitor.nextInt();*/
		
		double alunos[] = new double[30];
		double total=0;

		
		for(int i=0; i<alunos.length; i++) {
			System.out.println("Digite o consumo do " + (i+1) + "º aluno");
			alunos[i] = leitor.nextDouble();
			total = total + alunos[i];
		}
		
		//total = aluno1 + aluno2 + aluno3 + aluno4 + aluno5 + aluno6 + aluno7 + aluno8 + aluno9 + aluno10;
		
		for(int i=0; i<10; i++) {
			System.out.println("O aluno " + (i+1) + "consumiu R$" + alunos[i]);
		}
		
		System.out.println("O total de consumo foi de R$ " + total);
		
		leitor.close();
		

	}

}
