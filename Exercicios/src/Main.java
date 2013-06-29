import java.util.Scanner;

public class Main {

	public static int exercicio1() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano de nascimento: ");
		int anoDeNascimento = scanner.nextInt();

		System.out.println("Digite o ano ano atual: ");
		int anoAtual = scanner.nextInt();

		int idade = anoAtual - anoDeNascimento;
		System.out.println("Este ano você faz: " + idade + " anos.");

		return idade;

	}

	public static void exercicio2() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor total da conta: ");
		double total = scanner.nextDouble();

		double gorjeta = total * 0.1;
		System.out.println("A gorjeta do garçom: " + gorjeta + "R$.");

	}

	public static void exercicio3() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número de homens: ");
		int homens = scanner.nextInt();

		System.out.println("Digite o número de mulheres: ");
		int mulheres = scanner.nextInt();

		int total = mulheres + homens;
		double totalAlunos = (double) total;

		System.out.println("A pocentagem de homens é: "
				+ ((100 * homens) / totalAlunos) + "%.");
		System.out.println("A pocentagem de mulheres é: "
				+ ((100 * mulheres) / totalAlunos) + "%.");

	}

	public static void exercicio4() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();

		if (idade >= 18) {

			System.out.println("Você é maior de idade. ");

		} else {

			System.out.println("Você é menor de idade. ");

		}

	}

	public static void exercicio5() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor do slario bruto: ");
		double bruto = scanner.nextDouble();

		System.out.println("Digite o valor dos descontos: ");
		double descontos = scanner.nextDouble();

		double liquido = bruto - descontos;

		System.out.println("Digite o valor doemprestimo: ");
		double emprestimo = scanner.nextDouble();

		if (emprestimo > (0.3 * liquido)) {

			System.out
					.println("Você não tem saldo para fazer esse empréstimo. ");

		} else {

			System.out.println("Empréstimo liberado. ");

		}
	}

	public static void exercicio6() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a 1ª nota: ");
		double nota1 = scanner.nextDouble();

		System.out.println("Digite a 2ª nota: ");
		double nota2 = scanner.nextDouble();

		System.out.println("Digite a 3ª nota: ");
		double nota3 = scanner.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {

			System.out.println("Você passou. ");

		} else {

			if (media >= 5) {

				System.out.println("Você está em recuperação. ");

				} else {

					System.out.println("você está reprovado. ");

				}

			
		}
	}
	
	public static void exercicio7() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a 1ª nota: ");
		double nota1 = scanner.nextDouble();

		System.out.println("Digite a 2ª nota: ");
		double nota2 = scanner.nextDouble();

		System.out.println("Digite a 3ª nota: ");
		double nota3 = scanner.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {

			System.out.println("Você passou. ");

		} else {

			if (media >= 5) {

				System.out.println("Você está em recuperação. ");

				System.out.println("Digite a nota da recuperação: ");
				double rec = scanner.nextDouble();

				if (rec >= 5) {

					System.out.println("Você passou. ");

				} else {

					System.out.println("você está reprovado. ");

				}

			}
		}
	}
	

	public static void exercicio8() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o mês: ");
		String mes = scanner.nextLine();
		
		if(mes.equalsIgnoreCase("janeiro")){
			
			System.out.println(mes + " é o 1º mês doano ");
			
		}else if(mes.equalsIgnoreCase("fevereiro")){
			
			System.out.println(mes + " é o 2º mês doano ");
			
		}else if(mes.equalsIgnoreCase("março")){
			
			System.out.println(mes + " é o 3º mês doano ");
			
		}else if(mes.equalsIgnoreCase("abril")){
			
			System.out.println(mes + " é o 4º mês doano ");
			
		}else if(mes.equalsIgnoreCase("maio")){
			
			System.out.println(mes + " é o 5º mês doano ");
			
		}else if(mes.equalsIgnoreCase("junho")){
			
			System.out.println(mes + " é o 6º mês doano ");
			
		}else if(mes.equalsIgnoreCase("julho")){
			
			System.out.println(mes + " é o 7º mês doano ");
			
		}else if(mes.equalsIgnoreCase("agosto")){
			
			System.out.println(mes + " é o 8º mês doano ");
			
		}else if(mes.equalsIgnoreCase("setembro")){
			
			System.out.println(mes + " é o 9º mês doano ");
			
		}else if(mes.equalsIgnoreCase("outubro")){
			
			System.out.println(mes + " é o 10º mês doano ");
			
		}else if(mes.equalsIgnoreCase("novembro")){
			
			System.out.println(mes + " é o 11º mês doano ");
			
		}else if(mes.equalsIgnoreCase("dezembro")){
			
			System.out.println(mes + " é o 12º mês doano ");
			
		}else{
			System.out.println("O mês digitado não exite.");
		}


		

	}
	
	public static void exercicio9() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numero referente ao  mês: ");
		int mes = scanner.nextInt();

		if(mes >= 1 && mes <= 12){
			
			System.out.println("Digite o dia do  mês: ");
			int dia = scanner.nextInt();
			
			switch (mes) {
			case 1:
				if(dia >= 1 && mes <= 31){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 2:
				if(dia >= 1 && mes <= 28){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 3:
				if(dia >= 1 && mes <= 31){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 4:
				if(dia >= 1 && mes <= 30){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 5:
				if(dia >= 1 && mes <= 31){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 6:
				if(dia >= 1 && mes <= 30){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 7:
				if(dia >= 1 && mes <= 31){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 8:
				if(dia >= 1 && mes <= 30){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 9:
				if(dia >= 1 && mes <= 31){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 10:
				if(dia >= 1 && mes <= 30){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 11:
				if(dia >= 1 && mes <= 31){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
			case 12:
				if(dia >= 1 && mes <= 30){
					
					System.out.println("A data digita é valida. ");
					
				}else{
					
					System.out.println("A data digita é invalida. ");
					
				}
				
				break;
				
				
				
				

			default:
				break;
			}
			
		}else{
			
			System.out.println("O mes digitado é invalido. ");
			
		}

	}
	
	public static void exercicio10() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		int numero1 = scanner.nextInt();
		System.out.println("Digite o 2º número: ");
		int numero2 = scanner.nextInt();

		if (numero1 <= numero2) {

			System.out.println(numero1 + " " + numero2);

		} else {

			System.out.println(numero2 + " " + numero1);

		}

	}
	
	public static void exercicio11() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a idade da 1º pessoa: ");
		int numero1 = scanner.nextInt();
		System.out.println("Digite a idade da 2º pessoa: ");
		int numero2 = scanner.nextInt();

		if (numero1 < numero2) {

			System.out.println("A 2ª pessoa é a mais velha.");

		} else if(numero1 == numero2) {

			System.out.println("As 2 pessoas tem a mesma idade.");

		}else{
			
			System.out.println("As 1ª pessoas tem a mesma idade.");
			
		}

	}
	
	public static void exercicio12() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a idade da 1º pessoa: ");
		int numero1 = scanner.nextInt();
		System.out.println("Digite a idade da 2º pessoa: ");
		int numero2 = scanner.nextInt();

		if (numero1 < numero2) {

			System.out.println("A 2ª pessoa é a mais velha.");

		} else if(numero1 == numero2) {

			System.out.println("As 2 pessoas tem a mesma idade.");

		}else{
			
			System.out.println("As 1ª pessoas tem a mesma idade.");
			
		}
		

	}
	
	public static void main(String[] args) {

		exercicio10();

	}

}
