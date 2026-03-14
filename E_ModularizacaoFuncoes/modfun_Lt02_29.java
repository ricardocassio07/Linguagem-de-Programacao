/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import java.util.Scanner;

/*
    29. Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido 
    em 30 dias, sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não são considerados.
    Programador: Cássio
    Data: 14/03/2026
*/
public class modfun_Lt02_29 
{
    public static void main(String args[])
    {
        int tipoInvestimento;
        double valorInvestido;
        
        Scanner scan = new Scanner(System.in);
        
        do
        {
            System.out.println("Tipo de investimento (1. Poupanca 2. Renda fixa):");
            tipoInvestimento = scan.nextInt();
        }
        while((tipoInvestimento != 1) && (tipoInvestimento != 2));
        
        do
        {
            System.out.println("Valor do investimento:");
            valorInvestido = scan.nextDouble();
        }
        while(valorInvestido <= 0);
        
        double resultado = calcular(tipoInvestimento, valorInvestido);
        
        System.out.printf("R$ %.2f%n", resultado);
    }
    
    static double calcular(int tipo, double valor)
    {
        if (tipo == 1)
        {
            return (valor * 1.03);
        }
        else
        {
            return (valor * 1.05);
        }
    }
}
