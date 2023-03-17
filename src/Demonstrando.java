/**
 * Demonstrando que caractere pode armazenar números decimais
 *
 *
 * Alguns exemplos legais:
 * 8986 [⌚] 8987 [⌛] 9200 [⏰] 9748 [☔] 9749 [☕] 9855 [♿] 9917 [⚽] 9918 [⚾]
 * 9973 [⛵] 11088 [⭐] 59688 [] 57350 [] 9981 [⛽] 9924 [⛄] 9875 [⚓]
 *
 *
 * @author <a href="https://github.com/Benefrancis">Benefrancis do Nascimento</a>
 */
public class Demonstrando {
    public static void main(String[] args) {

        int numero = 1;
        //Atribuindo um número inteiro num tipo caractere
        char caractere = 1;

        //Realizando comparação numérica com um tipo caractere
        while (caractere <= 65534) {
            //Pegando o resto da divisão de um valor caractere (dividendo)
            //Por um divisor (9)
            if (caractere % 9 == 0) {
                System.out.println(numero + " [" + caractere + "] ");
            } else {
                System.out.print(numero + " [" + caractere + "] ");
            }

            //Somando +1 ao valor atual da variável caractere
            caractere++;
            numero++;
        }
    }
}