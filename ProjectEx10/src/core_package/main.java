package core_package;

import java.util.*;
import entities.BaseDados;

public class main {
	public static int n = 0;
	public static Scanner sc = new Scanner(System.in);

	public static void entry() {
		System.out.print("> 0 Sair do Programa");
		System.out.printf("\n> 1 Adicionar Funcionário");
		System.out.printf("\n> 2 Adicionar Salário a um Funcionário");
		System.out.printf("\n> 3  Aumentar Salário a um Funcionário");
		System.out.printf("\n> 4 Consular Lista de Funcionários");
		System.out.printf("\n> 5  Inserir Informações Disponíveis para Funcionários");
		System.out.printf("\n> 6 Consultar Lista de Formações Disponíveis para Funcionários");
		System.out.printf("\n\nIntroduza a opção pretendida > ");
		n = sc.nextInt();
		if (n > 6 || n < 0) {
			System.out.printf("\n\nNÚMERO INVÁLIDO\n\n");
		}
	}

	public static void main(String[] args) {
		do {
			entry();
			List<BaseDados> list = new ArrayList<>();
			switch (n) {
				case 1:
                    System.out.print("Adicionar o nome do funcionário: ");
					sc.nextLine();
					String Nome = sc.nextLine();
					list.add(new BaseDados(null, Nome, Nome, null, null, null, null));
					entry();
			}
		} while (n != 0);
		if (n == 0) {
			System.out.printf("\nSair do Programa");
			System.exit(0);
			sc.close();
		}
	}

}
