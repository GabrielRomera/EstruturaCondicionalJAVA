package condicionais3;
	import java.util.Scanner;
		public class condicionaisex1 {
				public static void main(String[]Args) {
	
Scanner leitor = new Scanner(System.in);
	int num;
	
	System.out.printf("Digite um numero: ");
	num = leitor.nextInt();
	
	
	if(num >= 20 && num <= 90 )
        System.out.printf("Seu numero " +num+ " esta entre 20 e 90.");
	
    else
        System.out.println("Seu numero " +num+ " nao esta entre 20 e 90.");
	
	
	}
}
