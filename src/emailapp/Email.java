package emailapp;

import java.util.Scanner;

public class Email {
	private String primeiroNome; // private => as pessoas n�o podem acesssar 
	private String ultimoNome;
	private String senha;
	private String departamento;
	private String email;
	
	private String emailAlternativo;
	
	private int numeroCaracter = 5;
	private String empresa = "wep";
	private int capacidadeCaixaEmail = 500;
	
	// Receber o primeiro nome e o ultimo nome
	public Email(String primeiroNome, String ultimoNome) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		System.out.println("Ola, " + this.primeiroNome + " " + this.ultimoNome + ".");
		
		// Chamando o method do Departamento
		this.departamento = setDepartament();
		System.out.println("\nOla, " + this.departamento + ". Tenha um Bom Dia!\n");
		
		// Chamando o method da Senha
		this.senha = senhaAleatoria(numeroCaracter);
		// System.out.println("Sua senha e: " + this.senha);
		
		// Gerando o email
		email = primeiroNome.toUpperCase() + "." + ultimoNome.toUpperCase() + "@" + departamento + "-" + empresa + ".com";
		// System.out.println("Seu email e: " + email);
	}
	
	// Pergutar o Departamento
	private String setDepartament() {
		System.out.print("\nColoque seu Deparamento : \n1 Vendedas\n2 Desenvolvimento\n3 Contabilidade\n0 Nenhum\n\nQual o seu DEPARTAMENTO: ");
		
		Scanner in = new Scanner(System.in);
		
		int choice = in.nextInt();
		
		// tipos das escolhas
		if (choice == 1) {
			return "vendedor";
		}
		
		if (choice == 2) {
			return "desenvolvedor";
		}
		
		if(choice == 3) {
			return "contador";
		}
		
		else {
			return "";
		}
	}
	
	// Gerando um Senha aleat�ria
	private String senhaAleatoria (int length) {
		String setSenha = "ABCDEFHIJKLMNOPQRSTUVWXYZ0123456789@#$";
		
		char [] senha = new char[length];
		
		for(int i=0; i<length; i++) {
			int aleatorio = (int) (Math.random() * setSenha.length());
			senha[i] = setSenha.charAt(aleatorio);
			// System.out.println(aleatorio);
			// System.out.println(setSenha.charAt(aleatorio));
		}
		return new String(senha);
	}
	
	
	// Capacidade da caixa de email
	public void setCapacidade (int capacidade) { // public void permite voce atribui-lo no arquivo EmailApp
		this.capacidadeCaixaEmail = capacidade;
	}
	
	public int pegarCapacidade() { // com o public voce estaria atribuindo o valor no EmailApp
		return capacidadeCaixaEmail;
	}
	
	// Email alternativo
	public void setEmailAlternativo (String altEmail) {
		this.emailAlternativo = altEmail;
	}
	
	public String pegarEmailAlternativo() {
		return emailAlternativo;
	}
	
	// Mudar a senha
	public void mudarSenha (String senha) {
		this.senha = senha;
	}
	
	public String pegarSenha() {
		return senha;
	}
	
	public String showInfo() {
		return "Nome: " + primeiroNome + " " + ultimoNome +
				"\nNome da Empresa: " + empresa +
				"\nEmail: " + email +
				"\nCapacidade do Email: " + capacidadeCaixaEmail + "mb";
	}
	
}
