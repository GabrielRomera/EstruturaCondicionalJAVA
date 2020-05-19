package condicionais3;
	import java.util.Scanner;
		public class condicionaisex4 {
				public static void main(String[]Args) {
					
	
	Scanner leitor = new Scanner(System.in);
	int lado1,lado2,lado3;
					
	System.out.printf("Digite o valor de um lado: ");
	lado1 = leitor.nextInt();
	
	System.out.printf("Digite o valor de um lado: ");
	lado2 = leitor.nextInt();
	
	System.out.printf("Digite o valor de um lado: ");
	lado3 = leitor.nextInt();
	
	
					
if(lado1 == lado2 && lado2 == lado3 )
	System.out.printf("Seu triangulo e Equilatero [3 lados iguais].");
					
else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
	System.out.println("Seu triangulo e Isosceles [2 lados iguais].");

else if (lado1 != lado2 && lado2 != lado3)
	System.out.println("Seu triangulo e Escaleno [3 lados diferentes].");
					
	}
}
