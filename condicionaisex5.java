package condicionais3;
	import java.util.Scanner;
		public class condicionaisex5 {
				public static void main(String[]Args) {
					
	
	Scanner leitor = new Scanner(System.in);
	String matricula;
	double nota1,nota2,nota3,nota4, soma, media;
					
	System.out.printf("Digite sua Matricula: ");
	matricula = leitor.next();
	
	System.out.printf("Digite a primeira nota: ");
	nota1 = leitor.nextInt();
	
	System.out.printf("Digite a segunda nota: ");
	nota2 = leitor.nextInt();
	
	System.out.printf("Digite a terceira nota: ");
	nota3 = leitor.nextInt();
	
	System.out.printf("Digite a quarta nota: ");
	nota4 = leitor.nextInt();
	
	soma = nota1 + nota2 + nota3 + nota4;		
	media = soma/4;
	
	if(media >=7 ) {
		System.out.printf("\nSua matricula: " +matricula+ "\nMedia: "+ media +
				 "\nAluno: [APROVADO]");}
	
	else if(media >=3.5 && media <7 ) {
		System.out.printf("\nSua matricula: " +matricula+ "\nMedia: "+ media +
				 "\nAluno: [RECUPERACAO]");}
	
	else if(media <3.5 ) {
		System.out.printf("\nSua matricula: " +matricula+ "\nMedia: "+ media +
				 "\nAluno: [REPROVADO]");}
	
	
	
	}
}
