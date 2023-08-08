package Lista02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ex002 {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner input = new Scanner(System.in);
		int opcao = 1;
		
		
		
		while(opcao != 0) {
			
			System.out.println("************************************");
			System.out.println();
			System.out.println("(1) Adiiconar um novo livro na pilha");
			System.out.println("(2) Listar todos os livros da Pilha ");
			System.out.println("(3) Retirar um livro da Pilha       ");
			System.out.println("(0) Sair do Sistema                 ");
			System.out.println();
			System.out.println("************************************");
			System.out.println();
			System.out.println("Entre com a opcao desejada: ");
			opcao = input.nextInt();
			
			switch(opcao) {
			case 1:
				String livro;
				System.out.println("\nDigite o livro que deseja adicionar: ");
				livro = input.next();
				pilha.push(livro);
				System.out.printf("\nLivro %s adicionado!", livro);
				System.out.println();
				break;
				
			case 2:
				if(pilha.isEmpty()) {
					System.out.println("\nA pilha esta vazia! ");
					System.out.println();
				}else {
					
					Iterator<String> iterator = pilha.iterator();
					System.out.println("\nLista de Livros na Pilha: ");
					System.out.println();
					while(iterator.hasNext()) {
						
						System.out.println(iterator.next());
					}
					System.out.println();
				}
				break;
				
			case 3:
				if(!pilha.isEmpty()) {
					pilha.pop();
					System.out.println("Pilha: ");
					
					Iterator<String> iterator = pilha.iterator();
	
					while(iterator.hasNext()) {
						
						System.out.println(iterator.next());
					}
					
					System.out.println("\nUm Livro foi retirado da pilha! ");
					
					
				}else {
					System.out.println("\nA Pilha está vazia! ");
				}
				break;
				
			case 0:
				opcao = 0;
				System.out.println("\nSistema Finalizado! ");
				input.close();
				
				break;
				
				default:
					System.out.println("\nOpcao inexistente! ");
					break;
					
				
				
			
				
			}
			
		}
		
	}

}
