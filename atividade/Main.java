package atividade;

//import java.util.Scanner;

public class Main {

        public static void main (String[] args){
           // Scanner sc = new Scanner(System.in);

            Livro livro1 = new Livro("Kleber", "ricardo", 89, 190);

            System.out.println("autor: " + livro1.getAutor());
            System.out.println("preco: " + livro1.getPreco());
            System.out.println("numero de pg: " + livro1.getNumPg());
            System.out.println("Titulo: " + livro1.getNome());


        }


    
}
