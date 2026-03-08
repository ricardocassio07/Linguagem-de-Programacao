/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import java.util.Scanner;

/*
    29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor investimoento. Calcule e mostre o valor corrigido
    em 30 dias, sabendo que a poupança = 3% e a remda fixa 5%. Demais tipos não são considerados.
    Programador: Cássio
    Data: 08/03/2026
*/
public class modproc_Lt02_29 
{
    static int tipoInvestimento;
    static double valorInvestido, novoValor;
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        do
        {
            System.out.println("Tipo de investimento (1- Poupanca 2- Renda Fixa):");
            tipoInvestimento = scan.nextInt();
        }
        while((tipoInvestimento != 1) && (tipoInvestimento != 2));
        
        do
        {
            System.out.println("Valor investido:");
            valorInvestido = scan.nextDouble();
        }
        while(valorInvestido < 0);
        
        calcular();
        
        System.out.printf("Valor reajustado R$ %.2f%n", novoValor);
        
        scan.close();
    }
    
    static void calcular()
    {
        if (tipoInvestimento == 1)
        {
            novoValor = (valorInvestido * 1.03);
        }
        else
        {
            novoValor = (valorInvestido * 1.05);
        }
    }
}
