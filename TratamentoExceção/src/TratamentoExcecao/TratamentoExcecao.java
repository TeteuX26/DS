/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TratamentoExcecao;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class TratamentoExcecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
       try {
            // Entrada de dados do usuário
            System.out.print("Digite um número inteiro: ");
            String entrada = sc.nextLine();

            // Conversão da String para int
            // Pode gerar NumberFormatException se o usuário digitar algo inválido
            int numero = Integer.parseInt(entrada);

            // Divisão entre números
            System.out.print("Digite um divisor: ");
            int divisor = sc.nextInt();

            // Pode gerar ArithmeticException se o divisor for 0
            int resultado = numero / divisor;

            System.out.println("Resultado da divisão: " + resultado);

        } catch (NumberFormatException e) {
            // Tratamento de erro de conversão (dado inválido)
            System.out.println("Erro: Você não digitou um número válido!");
            System.out.println("Detalhes da exceção: " + e.getMessage());

        } catch (ArithmeticException e) {
            // Tratamento da divisão por zero
            System.out.println("Erro: Não é possível dividir por zero!");
            System.out.println("Detalhes da exceção: " + e.getMessage());

        } catch (Exception e) {
            // Captura exceções gerais (boa prática: usar apenas quando necessário)
            System.out.println("Ocorreu um erro inesperado!");
            System.out.println("Detalhes: " + e.getMessage());

        } finally {
            // O bloco finally sempre é executado
            System.out.println("Finalizando o programa...");
            sc.close();
        }
    }
}
