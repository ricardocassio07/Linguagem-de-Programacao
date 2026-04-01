/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package I_CaixaEletronico;

import java.util.Scanner;

/*
    CAIXA ELETRÔNICO
        1. Criar um menu de opções:
            Menu Principal
            1 – Carregar Notas
            2 – Retirar Notas
            3 – Estatística
            9 – Fim

        1.1. Carregar a quantidade de notas em uma área da memória com 6 ocorrências.

        1.2. Solicitar que o cliente faça a retirada de valores obedecendo ao critério do maior
        pelo menor.

        1.3. Dar a opção para o cliente escolher o valor e a quantidade de notas. 
            P. ex.: 1 x 20, 2 x 10

        1.4. Caso não tenha o valor da maior cédula, disponibilizar a próxima.

        1.5. Se o valor a ser solicitado for maior que o saldo total do caixa, enviar a mensagem?
            “EXCEDEU O LIMITE DO CAIXA”.

        1.6. Solicitar até 100 retiradas ou até não haver mais notas.

        1.7. No momento da solicitação do valor, coletar também o código do banco que o
        cliente tem conta, segundo:
            |Código:|        1        |     2    |   3  |   4   |
            |Banco: | Banco do Brasil | Santader | Itaú | Caixa |

        1.8. No final, exibir a estatística, separada por bancos, com:
            1.8.1. O maior e o menor valor sacado;
            1.8.2. A média dos saques;
            1.8.3. Valor total dos saques;
            1.8.4. Valor das sobras dos caixas.
*/

/*
    Programador: Cássio
    Data: 24/03/2026
*/

public class caixa 
{
    static int[] notas = new int[6];
    static int[] valores = {100, 50, 20, 10, 5, 2};
    
    static int totalSaques = 0;
    static int somaSaques = 0;
    static int maiorSaque = 0;
    static int menorSaque = Integer.MAX_VALUE;
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String args[])
    {
        int opc;
        do
        {
            System.out.println("--------------------------------------------------------");
            System.out.print("Menu Principal:\n1- Carregar Notas\n2- Retirar Notas\n3- Estatisticas\n9- Finalizar Programa\n-> ");
            opc = scan.nextInt();
            System.out.println("--------------------------------------------------------");
            
            switch (opc){
                case 1:
                    carregarNotas();
                    break;
                case 2:
                    retirarSaques();
                    break;
                case 3:
                    estatisticas();
                    break;
                case 9:
                    System.out.println("Sessao encerrada!");
                    scan.close();
                    break;
                default:
                    System.out.println("ESCOLHA INVALIDA!");
                    break;
            }
        }
        while (opc != 9);
    }
    
    public static void carregarNotas()
    {
        for (int i = 0; i < 6; i++)
        {
            notas[i] = 100;
        }
        System.out.println("-> NOTAS CARREGADAS COM SUCESSO <-");
    }
    
    public static void retirarSaques()
    {
        int opc = 0;
        do
        {
            System.out.println("Digite o valor que deseja sacar:");
            int valorSaque = scan.nextInt();
            
            if (valorSaque > 0)
            {
                int valorTotalCaixa = 0;
                for (int i = 0; i < 6; i++)
                {
                    valorTotalCaixa += (notas[i] * valores[i]);
                }
                
                if (valorSaque < valorTotalCaixa)
                {
                    int valorOriginal = valorSaque;
                    
                    for (int i = 0; i < 6 ; i++)
                    {
                        int q = 0;
                        while ((valorSaque >= valores[i]) && (notas[i] > 0))
                        {
                            valorSaque -= valores[i];
                            notas[i] -= 1;
                            q += 1;
                        }
                        
                        if (q > 0)
                        {
                            System.out.println(q + " notas de " + valores[i]);
                        }
                    }
                    
                    if (valorSaque > 0)
                    {
                        System.out.println("-> IMPOSSIVEL SACAR O VALOR COMPLETO! <-");
                    }
                    else
                    {
                        System.out.println("-> SAQUE REALIZADO COM SUCESSO! <-");
                        
                        totalSaques += 1;
                        somaSaques += valorOriginal;
                        
                        if (valorOriginal > maiorSaque)
                        {
                            maiorSaque = valorOriginal;
                        }
                        
                        if (valorOriginal < menorSaque)
                        {
                            menorSaque = valorOriginal;
                        }
                    }
                    
                }
                else
                {
                    System.out.println("-> O VALOR DO SAQUE DESEJADO EXCEDE O TOTAL DE DINHEIRO EM CAIXA! <-");
                }
            }
            
            boolean valido = false;
            while (valido == false)
            {
                System.out.println("--------------------------------------------------------");
                System.out.println("Deseja:\n1- Realizar outro saque\n2- Voltar para o menu");
                opc = scan.nextInt();
                if ((opc == 1) || (opc == 2))
                {
                    valido = true;
                }
            }
        }
        while(opc != 2);
    }
    
    public static void estatisticas()
    {
        System.out.println("-------------- ESTATISTICAS --------------");
        
        if (totalSaques == 0)
        {
            System.out.println("-> NENHUM SAQUE REALIZADO <-");
            return;
        }
        
        double media = (double) somaSaques / totalSaques;
        
        System.out.println("Total de saques: " + totalSaques);
        System.out.println("Maior saque: " + maiorSaque);
        System.out.println("Menor saque: " + menorSaque);
        System.out.println("Media dos saques: " + media);
        System.out.println("Valor total sacado: " + somaSaques);

        // sobra do caixa
        int sobra = 0;
        for (int i = 0; i < 6; i++) {
            sobra += notas[i] * valores[i];
        }

        System.out.println("Dinheiro restante no caixa: " + sobra);
    }
}
