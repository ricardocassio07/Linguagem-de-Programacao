/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import java.util.Scanner;

/*
    28. Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
        Venda Mensal | Preço Atual | Preço Novo
            <500           <30          +10%
        >=500 e <1000  >=30 e < 80      +15%
           >=1000         >=80          -5%
        Obs.: Para outras condições, preço novo será igual ao preço atual.
    Programador: Cássio
    Data: 14/03/2026 
*/
public class modfun_Lt02_28 
{
    public static void main(String args[])
    {
        double vendaMensal, precoAtual;
        
        Scanner scan = new Scanner(System.in);
        
        do
        {
            System.out.println("Venda mensal:");
            vendaMensal = scan.nextDouble();
            System.out.println("Preco atual:");
            precoAtual = scan.nextDouble();
        }
        while((vendaMensal < 0) || (precoAtual < 0));
        
        double  novoPreco = calcular(vendaMensal, precoAtual);
        
        System.out.printf("Novo preco: R$ %.2f%n", novoPreco);
    }
    
    static double calcular(double vendaMensal, double precoAtual)
    {
        if ((vendaMensal < 500) && (precoAtual < 30))
        {
            return (1.10 * precoAtual);
        }
        else if (((vendaMensal >= 500) && (vendaMensal < 1000)) && ((precoAtual >= 30) && (precoAtual < 80)))
        {
            return (1.15 * precoAtual);
        }
        else if ((vendaMensal >= 1000) && (precoAtual >= 80))
        {
            return (0.95 * precoAtual);
        }
        else
        {
            return precoAtual;
        }
    }
}
