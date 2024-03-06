import Classes.NaveEspacial;
import Classes.NaveCarga;
import Classes.NaveCombate;
import Classes.NavePassageiros;
import java.util.*;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    NaveEspacial nave = new NaveCarga("");
    Scanner ler = new Scanner(System.in);

    System.out.println("===============================================");
    System.out.println("Bem Vindo a cabine de controle espacial!");
    System.out.println("===============================================");

    boolean loop = true;
    while (loop) {
      // estoque = menu(estoque);
      System.out.println("===============================================");
      System.out.println("MENU");
      System.out.println("1 - Cadastro de Nave");
      System.out.println("2 - Mostrar Nave");
      System.out.println("3 - Entrada de Produto");
      System.out.println("4 - Saida de Produto");
      System.out.println("===============================================");

      int option = ler.nextInt();

      switch (option) {
        case 1:
          nave = Cadastro();
          break;
		
        case 2:
          // System.out.println(nave);
          nave.ToString();
          break;
      }
    }
  }

  public static NaveEspacial Cadastro() {
    Scanner ler = new Scanner(System.in);
    NaveEspacial naveVazia;

    System.out.println("Digite o nome da nave");
    String nome = ler.nextLine();

    System.out.println("/////////////////////////////////");
    System.out.println("Tipos de Nave");
    System.out.println("1- Nave de Passageiros");
    System.out.println("2- Nave de Carga");
    System.out.println("3- Nave de Combate");
    System.out.println("/////////////////////////////////");
    System.out.println("Digite qual o tipo de nave ");
    int option = ler.nextInt();

    switch (option) {
      case 1:
        naveVazia = CadastroNavePassageiros(nome);
        break;
      case 2:
        naveVazia = CadastroNaveCarga(nome);
		break;
      case 3:
        naveVazia = CadastroNaveCombate(nome);
		
        break;
      default:
        System.out.println("Não foi encontrado opção desejada");
		return null;
        // break;
    }

    System.out.println("Digite a quantidade de tripulantes");
    naveVazia.setTripulantes(ler.nextInt());

    System.out.println("Digite a velocidade para acelerar em km/h");
    naveVazia.acelerar(ler.nextDouble());

    System.out.println("Digite a quantidade combustivel");
    naveVazia.setCombustivel(ler.nextDouble());

	return naveVazia;
  }

  public static NaveCarga CadastroNaveCarga(String nome){
	Scanner ler = new Scanner(System.in);
	NaveCarga nave = new NaveCarga(nome);

	System.out.println("Digite a quantidade carga em toneladas");
	Double carga = ler.nextDouble();
	nave.carrega(carga);

	return nave;
  }

  public static NavePassageiros CadastroNavePassageiros(String nome){
	Scanner ler = new Scanner(System.in);
	NavePassageiros nave = new NavePassageiros(nome);

	System.out.println("Digite a quantidade de passageiros");
	int qtd = ler.nextInt();
	nave.setNumeroPassageiro(qtd);

	return nave;
  }

  public static NaveCombate CadastroNaveCombate(String nome){
	Scanner ler = new Scanner(System.in);
	NaveCombate nave = new NaveCombate(nome);

	System.out.println("Digite o nome da arma");
	String arma = ler.nextLine();
	nave.setArmamento(arma);

	return nave;
  }
  // public static List<Produto> menu(List<Produto> estoque){
  // Scanner ler = new Scanner(System.in);

  // System.out.println("===============================================");
  // System.out.println("MENU");
  // System.out.println("1 - Cadastro de Produto");
  // System.out.println("2 - Estoque");
  // System.out.println("3 - Entrada de Produto");
  // System.out.println("4 - Saida de Produto");
  // System.out.println("===============================================");

  // int option = ler.nextInt();

  // switch(option){
  // case 1:
  // var produto = Cadastro();
  // estoque.add(produto);
  // break;

  // case 2:
  // Estoque(estoque);

  // break;

  // case 3:
  // estoque = Entrada(estoque);

  // break;

  // case 4:
  // estoque = Saida(estoque);

  // break;
  // }
  // return estoque;

  // }

  // public static void Estoque(List<Produto> estoque){
  // estoque.forEach(item -> {
  // System.out.println("Descrição: "+item.getDescricao()+
  // ", Codigo: "+item.getCodigo()+
  // ", Quantidade: "+item.getQuantidade());
  // });
  // }

  // public static List<Produto> Entrada(List<Produto> estoque){
  // Scanner ler = new Scanner(System.in);

  // System.out.println("Digite o codigo do produto que quer dar entrada.");
  // int codigo = ler.nextInt();

  // System.out.println("Digite quantidade do produto para entrada.");
  // int quantidade = ler.nextInt();

  // estoque.stream()
  // .filter(produto -> produto.getCodigo() == codigo)
  // .findFirst()
  // .ifPresent(produto -> {produto.setQuantidade(quantidade);});

  // System.out.println("Entrada realizada com sucesso!");
  // return estoque;
  // }

  // public static List<Produto> Saida(List<Produto> estoque){
  // Scanner ler = new Scanner(System.in);

  // System.out.println("Digite o codigo do produto que quer dar saida.");
  // int codigo = ler.nextInt();

  // System.out.println("Digite quantidade do produto para saida.");
  // int quantidade = ler.nextInt();

  // estoque.stream()
  // .filter(produto -> produto.getCodigo() == codigo)
  // .findFirst()
  // .ifPresent(produto -> {
  // if(produto.getQuantidade() < quantidade){
  // System.out.println("Não tem estoque suficiente para dar saida nesta
  // quantidade!");
  // }else{
  // int quantidadeAtual = produto.getQuantidade() - quantidade;
  // produto.setQuantidade(quantidadeAtual);
  // System.out.println("Saída realizada com sucesso!");
  // }
  // });
  // return estoque;
  // }
}
