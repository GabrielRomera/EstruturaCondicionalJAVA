package condicionais3;
	import java.util.Scanner;
		public class condicionaisex2 {
				public static void main(String[]Args) {
					
	
	Scanner leitor = new Scanner(System.in);
						
					
	System.out.printf("Digite sua idade: ");
	int num = leitor.nextInt();
	
	
	if(num >= 5 && num <=10)
		System.out.println("Voce esta na categoria infantil.");
	
	else if(num >= 11 && num <=17)
		System.out.println("Voce esta na categoria juvenil.");
	
	else if (num >=18)
		System.out.println("Voce esta na categoria adulta.");
	
	else
		System.out.println("Voce nao podera participar.");
	
	}
}

