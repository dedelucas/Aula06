import java.util.Random;

public class ExemploVetores {

	public static void main(String[] args) {
		int teste[] = new int[5];
		Random gerador = new Random();
		
		teste[0] = 10;
		teste[1] = 30;
		teste[2] = 5;
		teste[3] = 1;
		teste[4] = 2;
		
		for(int i=0; i<100; i++) {
			teste[i] = gerador.nextInt(30);
		}
		
		for(int i=0; i<100; i++) {
			System.out.println(teste[i]);
		}
		
		
		
		
		
		
		/*System.out.println(teste[0]);
		System.out.println(teste[1]);
		System.out.println(teste[2]);
		System.out.println(teste[3]);
		System.out.println(teste[4]);*/
		
	}

}
