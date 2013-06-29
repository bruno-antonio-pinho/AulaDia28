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

		System.out.println("Digite o valor do empréstimo: ");
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

		if (mes.equalsIgnoreCase("janeiro")) {

			System.out.println(mes + " é o 1º mês do ano ");

		} else if (mes.equalsIgnoreCase("fevereiro")) {

			System.out.println(mes + " é o 2º mês do ano ");

		} else if (mes.equalsIgnoreCase("março")) {

			System.out.println(mes + " é o 3º mês do ano ");

		} else if (mes.equalsIgnoreCase("abril")) {

			System.out.println(mes + " é o 4º mês do ano ");

		} else if (mes.equalsIgnoreCase("maio")) {

			System.out.println(mes + " é o 5º mês do ano ");

		} else if (mes.equalsIgnoreCase("junho")) {

			System.out.println(mes + " é o 6º mês do ano ");

		} else if (mes.equalsIgnoreCase("julho")) {

			System.out.println(mes + " é o 7º mês do ano ");

		} else if (mes.equalsIgnoreCase("agosto")) {

			System.out.println(mes + " é o 8º mês do ano ");

		} else if (mes.equalsIgnoreCase("setembro")) {

			System.out.println(mes + " é o 9º mês do ano ");

		} else if (mes.equalsIgnoreCase("outubro")) {

			System.out.println(mes + " é o 10º mês do ano ");

		} else if (mes.equalsIgnoreCase("novembro")) {

			System.out.println(mes + " é o 11º mês do ano ");

		} else if (mes.equalsIgnoreCase("dezembro")) {

			System.out.println(mes + " é o 12º mês do ano ");

		} else {
			System.out.println("O mês digitado não existe.");
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
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em janeiro.");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 2:
				if(dia >= 1 && dia <= 28){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em fevereiro.");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 3:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em março.");
					

				}else{

					System.out.println("A data digita é invalida. ");
					

				}

				break;

			case 4:
				if(dia >= 1 && dia <= 30){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em abril.");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 5:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em maio.");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 6:
				if(dia >= 1 && dia <= 30){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em junho.");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 7:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em julho.");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 8:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em agosto.");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 9:
				if(dia >= 1 && dia <= 30){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em setembro.");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 10:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em outubro.");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 11:
				if(dia >= 1 && dia <= 30){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em novembro.");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 12:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");
					System.out.println("Você faz aniversario em dezembro.");

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

		System.out.println("Digite a idade da 1ª pessoa: ");
		int numero1 = scanner.nextInt();
		System.out.println("Digite a idade da 2ª pessoa: ");
		int numero2 = scanner.nextInt();

		if (numero1 < numero2) {

			System.out.println("A 2ª pessoa é a mais velha.");

		} else if (numero1 == numero2) {

			System.out.println("As 2 pessoas tem a mesma idade.");

		} else {

			System.out.println("A 1ª pessoas é a mais velha.");

		}

	}

	public static void exercicio12() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome da 1ª pessoa: ");
		String nome1 = scanner.nextLine();
		System.out.println("Digite o dia do aniversario da 1ª pessoa: ");
		int dia1 = scanner.nextInt();
		System.out.println("Digite o número referente ao mês do aniversario da 1ª pessoa: ");
		int mes1 = scanner.nextInt();
		System.out.println("Digite o nome da 2ª pessoa: ");
		scanner.nextLine();
		String nome2 = scanner.nextLine();
		System.out.println("Digite o dia do aniversario da 2ª pessoa: ");
		int dia2 = scanner.nextInt();
		System.out.println("Digite o número referente ao mês do aniversario da 2ª pessoa: ");
		int mes2 = scanner.nextInt();

		if (mes1 < mes2) {

			System.out.println(nome1);

		} else if (mes1 > mes2) {

			System.out.println(nome2);

		} else {

			if (dia1 < dia2) {

				System.out.println(nome1);

			} else if (dia1 > dia2) {

				System.out.println(nome2);

			} else {

				System.out.println("Ambos " + nome1 + " e " + nome2 + " fazem aniversario juntos.");

			}

		}

	}

	public static void exercicio13() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();
		System.out.println("Digite o numero referente ao  mês: ");
		int mes = scanner.nextInt();
		System.out.println("Digite o dia do  mês: ");
		int dia = scanner.nextInt();
		if(mes >= 1 && mes <= 12){

			switch (mes) {
			case 1:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 2:
				if(((ano - 2012) % 4) == 0){

					if(dia >= 1 && dia <= 29){

						System.out.println("A data digita é valida. ");

					}else{

						System.out.println("A data digita é invalida. ");

					}

				}else{

					if(dia >= 1 && dia <= 28){

						System.out.println("A data digita é valida. ");

					}else{

						System.out.println("A data digita é invalida. ");

					}

				}


				break;

			case 3:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 4:
				if(dia >= 1 && dia <= 30){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 5:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 6:
				if(dia >= 1 && dia <= 30){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 7:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 8:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 9:
				if(dia >= 1 && dia <= 30){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 10:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 11:
				if(dia >= 1 && dia <= 30){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			case 12:
				if(dia >= 1 && dia <= 31){

					System.out.println("A data digita é valida. ");

				}else{

					System.out.println("A data digita é invalida. ");

				}

				break;

			default:
				break;
			}

		}else{

			System.out.println("A data digita é invalida. ");

		}

	}

	public static void exercicio14() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite as horas: ");
		int horas = scanner.nextInt();
		System.out.println("Digite os minutos: ");
		int minutos = scanner.nextInt();
		System.out.println("Digite os segundos: ");
		int segundos = scanner.nextInt();

		if ((horas <= 23) && (horas >= 0)) {

			if((minutos >= 0) && (minutos <= 59)){

				if((segundos >= 0) && (segundos <= 59)){

					System.out.println("Este é um horário válido.");


				}else{

					System.out.println("Este não é um horário válido.");

				}

			}else{

				System.out.println("Este não é um horário válido.");

			}

		} else {

			System.out.println("Este não é um horário válido.");

		}

	}



	public static void exercicio15() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1º horário: ");
		System.out.println("Digite as horas: ");
		int horas1 = scanner.nextInt();
		System.out.println("Digite os minutos: ");
		int minutos1 = scanner.nextInt();
		System.out.println("Digite os segundos: ");
		int segundos1 = scanner.nextInt();

		System.out.println("2º horário: ");
		System.out.println("Digite as horas: ");
		int horas2 = scanner.nextInt();
		System.out.println("Digite os minutos: ");
		int minutos2 = scanner.nextInt();
		System.out.println("Digite os segundos: ");
		int segundos2 = scanner.nextInt();

		double horario1seg = (horas1 * 3600) + (minutos1 * 60) + segundos1;
		double horario2seg = (horas2 * 3600) + (minutos2 * 60) + segundos2;

		double diferenca = horario1seg - horario2seg;

		if(diferenca < 0){

			diferenca *= -1;

		}

		System.out.println("A diferença entre os horário é de "+diferenca+" segundos");

	}

	public static void exercicio16() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		int menor = scanner.nextInt();
		System.out.println("Digite o 2º número: ");
		int medio = scanner.nextInt();
		System.out.println("Digite o 3º número: ");
		int maior = scanner.nextInt();

		int aux;		

		if (menor >= maior ) {

			aux = maior;
			maior = menor;
			menor = aux;
		}

		if (menor >= medio){

			aux = menor;
			menor = medio;
			medio = aux;
		}


		if (medio >= maior){


			aux = medio;
			medio = maior;
			maior = aux;
		}

		System.out.println(menor + " " + medio + " " + maior);

	}

	public static void exercicio17() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o dia do aniversario da 1ª pessoa: ");
		int dia1 = scanner.nextInt();
		System.out.println("Digite o número referente ao mês do aniversario da 1ª pessoa: ");
		int mes1 = scanner.nextInt();

		System.out.println("Digite o dia do aniversario da 2ª pessoa: ");
		int dia2 = scanner.nextInt();
		System.out.println("Digite o número referente ao mês do aniversario da 2ª pessoa: ");
		int mes2 = scanner.nextInt();

		if(mes1 == mes2){

			if(dia1 == dia2){

				System.out.println("As datas são iguais. ");

			} else {

				System.out.println("As datas não são iguais. ");

			}

		} else {

			System.out.println("As datas não são iguais. ");

		}

	}

	public static void exercicio18() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		int menor = scanner.nextInt();
		System.out.println("Digite o 2º número: ");
		int medio = scanner.nextInt();
		System.out.println("Digite o 3º número: ");
		int maior = scanner.nextInt();

		int aux;		

		if (menor >= maior ) {

			aux = maior;
			maior = menor;
			menor = aux;
		}

		if (menor >= medio){

			aux = menor;
			menor = medio;
			medio = aux;
		}


		if (medio >= maior){


			aux = medio;
			medio = maior;
			maior = aux;
		}

		if((menor == medio) || (menor == maior) || (medio == maior)){

			System.out.println("A números repetidos na sequência.");

		}

		System.out.println(maior);

	}

	public static void exercicio19() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();

		if (idade >= 16) {

			if ((idade < 18) && (idade > 70)) {

				System.out.println("Seu voto é facultativo.");

			} else {

				System.out.println("Seu voto é obrigatório.");
			}


		} else {

			System.out.println("Você não pode votar. ");

		}

	}

	public static void exercicio20() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite de 4 digitos: ");
		int numero = scanner.nextInt();
		int milhar = 0;
		int centena = 0;
		int dezena = 0;
		int unidade = 0;
		int resto = 0;

		if(numero != 0){
			milhar = numero / 1000;
			resto = numero % 1000;
			numero = resto;
		}

		if (numero != 0){

			centena = numero / 100;
			resto = numero % 100;
			numero = resto;
		}

		if (numero != 0){

			dezena = numero / 10;
			resto = numero % 10;
			unidade = resto;

		}
		
		System.out.println("Milhar: " + milhar);
		System.out.println("centena: " + centena);
		System.out.println("dezena: " + dezena);
		System.out.println("unidade: " + unidade);

	}

	public static void main(String[] arzengs) {

		while (true) {
			
			Scanner scanner = new Scanner(System.in);

			System.out.println("Digite o número do exercício que deseja executar: ");
			int exercicio = scanner.nextInt();
			
			switch (exercicio) {
			case 1:
				exercicio1();				
				break;
			case 2:
				exercicio2();				
				break;
			case 3:
				exercicio3();				
				break;
			case 4:
				exercicio4();				
				break;
			case 5:
				exercicio5();				
				break;
			case 6:
				exercicio6();				
				break;
			case 7:
				exercicio7();				
				break;
			case 8:
				exercicio8();				
				break;
			case 9:
				exercicio9();				
				break;
			case 10:
				exercicio10();				
				break;
			case 11:
				exercicio11();				
				break;
			case 12:
				exercicio12();				
				break;
			case 13:
				exercicio13();				
				break;
			case 14:
				exercicio14();				
				break;
			case 15:
				exercicio15();				
				break;
			case 16:
				exercicio16();				
				break;
			case 17:
				exercicio17();				
				break;
			case 18:
				exercicio18();				
				break;
			case 19:
				exercicio19();				
				break;
			case 20:
				exercicio20();				
				break;
				

			default:
				System.out.println("Este exercício não existe: ");
				break;
			}
			
			
		}

	}

}
