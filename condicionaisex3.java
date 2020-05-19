package condicionais3;
	import java.util.Scanner;
		public class condicionaisex3 {
				public static void main(String[]Args) {
	
Scanner leitor = new Scanner(System.in);

	
	float salario, percentual = 0, salariofinal;
	int aumento1 = 15;
	int aumento2 = 7;
	
	System.out.printf("Digite seu salario: ");
	salario = leitor.nextFloat();
	
	if(salario >= 0 && salario <=1000) {
	percentual= salario*aumento1/100;
	salariofinal = salario + percentual;
	
	System.out.printf("Seu salario era de: R$" +salario+ " e passou a ser: R$"
		+ salariofinal+ " sendo um aumento de: R$" + percentual+" [15 por cento].");}
	
	
	else if(salario >= 1001 && salario <= 2500) {
	percentual = salario*aumento2/100;
	salariofinal = salario + percentual;
	
	System.out.printf("Seu salario era de: R$" +salario+ " e passou a ser: R$"
		+ salariofinal+ " sendo um aumento de: R$" + percentual+" [7 por cento].");}
	
	
	else{
	System.out.println("Salarios acima de R$2500 nao receberao aumento.");
	}
		
	}
}

