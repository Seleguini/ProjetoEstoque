package armazem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int id, estoque;
        String produto;
        double preco;

        System.out.println("Digite o id do produto: ");
        id = ler.nextInt();

        System.out.println("Digite o nome do produto: ");
        produto = ler.nextLine();
        produto = ler.nextLine();

        System.out.println("Digite quanto de estoque tem: ");
        estoque = ler.nextInt();

        System.out.println("Digite qual o preço do produto: ");
        preco = ler.nextDouble();

        Estoque e1 = new Estoque(id,produto,estoque,preco);

        System.out.println("\n" + e1.ConsultaEstoque()+"\n");
        System.out.println(e1.TotalEstoque()+"\n");

        System.out.println("Digite a quantidade a acrescentar");
        int qtde = ler.nextInt();
        e1.Acrescimo(qtde);

        System.out.println(e1.ConsultaEstoque());
        System.out.println("Novo Valor Total no estoque é: " + e1.TotalEstoque());

        System.out.println("Digite a quantidade a baixar");
        qtde = ler.nextInt();
        e1.Baixa(qtde);

        System.out.println(e1.ConsultaEstoque());
        System.out.println("Novo Valor Total no estoque é: " + e1.TotalEstoque());



        /*Estoque e1 = new Estoque(1,"Arroz", 10, 25);
        //estamos criando aqui
        Estoque e2 = new Estoque(2,"Feijão", 10, 5.65);
        Estoque e3 = new Estoque(3,"Picanha",10,49);

        e1.Acrescimo(100);

        System.out.println(e1.ConsultaEstoque()+"\n");

        e2.Baixa(7);
        System.out.println(e2.ConsultaEstoque()+"\n");

        System.out.println(e3.TotalEstoque());*/
    }
}