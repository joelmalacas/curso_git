package core_package;
import entities.BaseDados;
import java.util.Scanner;

public class main {
	
	public static void entry() {
		System.out.print("> 1 Adicionar Funcionário");
		System.out.printf("\n> 2 Adicionar Salário a um Funcionário");
		System.out.printf("\n> 3  Aumentar Salário a um Funcionário");
		System.out.printf("\n> 4 Consular Lista de Funcionários");
		System.out.printf("\n> 5  Inserir Informações Disponíveis para Funcionários");
		System.out.printf("\n> 6 Consultar Lista de Formações Disponíveis para Funcionários");
		System.out.printf("\n\nIntroduza a opção pretendida: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		entry();
		while (n == 1) {  //ADD Funcionario
			
		}
		
		while (n == 2) { //ADD SALARIO
			
		}
		
		while (n == 3) { //Aumentar SALARIO 
			
		}
		
		while (n == 4) { // CONSULTA LISTA
			
		}
		
		while (n == 5) { // INSERIR INFO FUNCIONARIOS
			
		}
		
		while (n == 6) { //CONSULTA LISTA FORMACOES DISPONIVEIS
			
		}
	}

}
