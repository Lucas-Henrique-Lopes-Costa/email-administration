package emailapp;

import java.util.Scanner;

public class Email {
	private String primeiroNome; // private => as pessoas não podem acesssar
	private String ultimoNome;
	private String senha;
	private String departamento;
	private String email;

	private String emailAlternativo;

	private int numeroCaracter = 10; // numero de caracters da senha
	private String empresa = "wep";
	private int capacidadeCaixaEmail = 500;

	// Receber o primeiro nome e o último nome
	public Email(String primeiroNome, String ultimoNome) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;

		System.out.println("Olá, " + this.primeiroNome + " " + this.ultimoNome + ".");

		// Chamando o method do Departamento
		this.departamento = setDepartament();

		System.out.println("\nOlá, " + this.departamento + ". Tenha um Bom Dia!\n");

		// Chamando o method da Senha
		this.senha = senhaAleatoria(numeroCaracter);
		// System.out.println("Sua senha é: " + this.senha);

		// Gerando o email
		email = primeiroNome.toUpperCase() + "." + ultimoNome.toUpperCase() + "@" + departamento + "-" + empresa
				+ ".com";
		// System.out.println("Seu email é: " + email);
	}

	Scanner in = new Scanner(System.in);

	// Pergutar o Departamento
	private String setDepartament() {
		System.out.print(
				"\nColoque seu Deparamento : \n1 - Vendedas\n2 - Desenvolvimento\n3 - Contabilidade\n0 - Nenhum\n\nQual o seu DEPARTAMENTO: ");

		int choice = in.nextInt();

		// tipos das escolhas
		if (choice == 1) {
			capacidadeCaixaEmail = 1000;
			return "vendedor";
		}

		if (choice == 2) {
			capacidadeCaixaEmail = 1500;
			return "desenvolvedor";
		}

		if (choice == 3) {
			capacidadeCaixaEmail = 500;
			return "contador";
		}

		else {
			return "amigo";
		}
	}

	// Gerando um Senha aleatória
	private String senhaAleatoria(int length) {
		String setSenha = "ABCDEFHIJKLMNOPQRSTUVWXYZ0123456789@#$";

		char[] senha = new char[length];

		for (int i = 0; i < length; i++) {
			int aleatorio = (int) (Math.random() * setSenha.length());
			senha[i] = setSenha.charAt(aleatorio);
//			 System.out.println(aleatorio);
//			 System.out.println(setSenha.charAt(aleatorio));
		}
		return new String(senha);
	}

	// Capacidade da caixa de email
	public void setCapacidade(int capacidade) { // public void permite voce atribui-lo no arquivo EmailApp
		this.capacidadeCaixaEmail = capacidade;
	}

	public int pegarCapacidade() { // com o public voce estaria atribuindo o valor no EmailApp
		return capacidadeCaixaEmail;
	}

	// Email alternativo
	public void setEmailAlternativo(String altEmail) {
		this.emailAlternativo = altEmail;
	}

	public String pegarEmailAlternativo() {
		return emailAlternativo;
	}

	// Mudar a senha
	public void mudarSenha(String senha) {
		this.senha = senha;
	}

	public String pegarSenha() {
		return senha;
	}

	public String showInfo() {
		String answer = "";
		if (departamento == "amigo") {
			answer = "Cadastre Novamente, por favor!";
		} else {
			answer = "Nome: " + primeiroNome + " " + ultimoNome + "\nNome da Empresa: " + empresa + "\nEmail: " + email
					+ "\nCapacidade do Email: " + capacidadeCaixaEmail + "mb" + "\nSua senha: " + senha;
		}

		return answer;
	}

}
