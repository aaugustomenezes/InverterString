import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		String nomeInvertido = "";
		int tam = nome.length();
		for(int i =  tam - 1; i >=0; i--) {
			nomeInvertido = nomeInvertido + nome.charAt(i);			
		}
		System.out.println(nomeInvertido);
		
		sc.close();
	}

}
