/**
 * Demonstrando que caractere pode armazenar números decimais
 *
 * @author <a href="https://github.com/Benefrancis">Benefrancis do Nascimento</a>
 */
public class Demonstrando {
    public static void main(String[] args) {

        //Atribuindo um número inteiro num tipo caractere
        char caractere = 0;

        //Realizando comparação numérica com um tipo caractere
        while (caractere < 6556) {
            //Pegando o resto da divisão de um valor caractere (dividendo)
            //Por um divisor (99)
            if (caractere % 99 == 0 )
                System.out.println(caractere + "\t ");
            else
                System.out.print(caractere + "\t ");
            //Somando +1 ao valor atual da variável caractere
            caractere++;
        }
    }
}