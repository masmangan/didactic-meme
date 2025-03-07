import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        // variaveis
        Scanner in;
        String name;

        // entrada de dados
        in = new Scanner(System.in);
        name = in.nextLine();      
        in.close();
        
        // saida de dados
        System.out.printf("Hello, %s!\n", name);
    }
}
