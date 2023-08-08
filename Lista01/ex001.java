package Lista01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner input = new Scanner(System.in);
		int opcao;
		
		
		
		do{
			
			System.out.println("\n*******************************");
			System.out.println("(1) Adicionar Cliente na Fila  ");
			System.out.println("(2) Listar todos os Clientes   ");
			System.out.println("(3) Retirar Cliente da Fila    ");
			System.out.println("(0) Sair                       ");
			System.out.println("\n*******************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = input.nextInt();
			
			switch(opcao){
				
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				String cliente = input.next();
				fila.add(cliente);
				System.out.printf("\nCliente %s adicionado! ",cliente);
				break;
			case 2:
				if(!fila.isEmpty()) {
					System.out.println("\nTodos os clientes na fila: ");
					Iterator<String> iterator = fila.iterator();
					int i = 1;
					while(iterator.hasNext()) {
						
						System.out.printf("%d° da fila é o %s.",i,iterator.next());
						System.out.println();
						i++;
					}
					if(fila.size() > 1) {
						System.out.println("Os Clientes foram chamados)!");
					}else if(fila.size() == 1) {
						System.out.println("O Cliente foi chamado!");
					}
				}else {
					System.out.println("\nNao contem nenhum cliente na fila!");
				}
				break;
			
			case 3:
				System.out.println("Digite o nome do cliente que deseja retirar da fila: ");
				String verificar = input.next();
				if(fila.contains(verificar)) {
					fila.remove(verificar);
					System.out.printf("\nCliente %s removido! ",verificar);
				}else{
					System.out.printf("%s não existe na fila!",verificar);
				}
				break;
				
			case 0:
				opcao = 0;
				System.out.println("Programa Finalizado!");
				System.out.println("Obrigado por usar nosso sistema!");
				break;
				
			default:
				System.out.println("\nOpção inexistente!");
				break;
		}
			
		}while(opcao != 0);
		
		
	}

}
