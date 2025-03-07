import java.lang.System;
// indica que estamos utilizando uma classe,
// porém, não é necessário importar
// classes do pacote java.lang.

import java.util.Scanner;
// indica que estamos utilizando uma classe
// chamada Scanner, que está no pacote
// java.util.

public class Main
{
// inicia uma classe nova, chamada Main
// a classe Main pode ser utilizada
// como parte de qualquer outro programa

    public static void main(String[] args)
    {
    // inicia um novo programa (metodo),
    // que eh parte da classe Main
    // e pode ser utilizado mesmo sem o BlueJ
    // O argumento (args) nao eh utilizado.
    
        // variaveis
        Scanner in;
        int a;
        int b;
        int s;

        // entrada de dados
        in = new Scanner(System.in);
        // cria um novo scanner lendo
        // da entrada padrao, o teclado
        
        a = in.nextInt(); 
        // aguarda a digitaçao de um valor inteiro
        b = in.nextInt();      
        // aguarda a digitaçao de um valor inteiro
        in.close();
        // informa que a entrada de dados 
        // se encerrou

        // processamento de dados
        s = a + b;

        // saida de dados
        System.out.print("X = ");
        System.out.print(s);
        System.out.println();
    }
}
