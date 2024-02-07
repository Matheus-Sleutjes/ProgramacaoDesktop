import java.util.Scanner;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("===============================================");
		System.out.println("Bem Vindo ao ontrole de estoque!");
		System.out.println("===============================================");

		List<Produto> estoque = new ArrayList<Produto>();
		boolean loop = true;
		while(loop){
			estoque = menu(estoque);
		}
	}

	public static List<Produto> menu(List<Produto> estoque){
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("===============================================");
		System.out.println("MENU");
		System.out.println("1 - Cadastro de Produto");
		System.out.println("2 - Estoque");
		System.out.println("3 - Entrada de Produto");
		System.out.println("4 - Saida de Produto");
		System.out.println("===============================================");
		
		int option = ler.nextInt();

		switch(option){
			case 1: 
				var produto = Cadastro();
				estoque.add(produto);
				break;
			
			case 2: 
				Estoque(estoque);
			
				break;
				
			case 3: 
				Entrada(estoque);
				
				break;
						
			case 4: 
				Saida();
				
				break;
		}
		return estoque;

	}

	public static Produto Cadastro(){
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a descrição do produto");
		String descricao = ler.nextLine();
		
		System.out.println("Digite o codigo do produto");
		int codigo = ler.nextInt();
		
		return new Produto(descricao, codigo);
	}

	public static void Estoque(List<Produto> estoque){
		estoque.forEach(item -> {
			System.out.println("Descrição: "+item.getDescricao()+
								", Codigo: "+item.getCodigo()+
								", Quantidade: "+item.getQuantidade());
		});
	}

	public static void Entrada(List<Produto> estoque){
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o codigo do produto que quer dar entrada.");
		int codigo = ler.nextInt();
		
		Optional<Produto> produtoAchado = estoque.stream()
			.filter(produto -> produto.getCodigo() == codigo)
			.findFirst();
	}

	public static void Saida(){
		System.out.println("Saida");
	}
}
