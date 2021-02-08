package emailapp;

import java.util.Scanner;

public class EmailApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#  Cadastro de Email #-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#");

		System.out.println("Você poderia me dizer o seu nome? ");
		String name = in.next();

		System.out.println("E qual é o seu sobrenome? ");
		String sobreNome = in.next();

		Email em1 = new Email(name, sobreNome);
		System.out.println(em1.showInfo());
	}
}
