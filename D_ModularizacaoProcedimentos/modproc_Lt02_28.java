/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import java.util.Scanner;

/*
    28. Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
        Venda Mensal | Preço Atual | Preço Novo
            <500          <30            +10%
        >=500 e <1000  >=30 e <80        +15%
           >=1000         >=80           -5%
        Obs.: Para outras condições, preço novo será igual ao preço atual.
    Programador: Cássio
    Data: 08/03/2026
*/

public class modproc_Lt02_28 
{
    static double pAtual, vMensal, pNovo;
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantidade de vendas:");
        vMensal = scan.nextInt();
        System.out.println("Preco atual:");
        pAtual = scan.nextInt();
        
        calcular();
        
        System.out.printf("Novo preco: R$ %.2f%n", pNovo);
        
        scan.close();
    }
    
    static void calcular()
    {
        if ((vMensal < 500) && (pAtual < 30))
        {
            pNovo = (pAtual * 1.10);
        }
        else if ((vMensal >= 500) && (vMensal < 1000) && (pAtual >= 30) && (pAtual < 80))
        {
            pNovo = (pAtual * 1.15);
        }
        else if ((vMensal >= 1000) && (pAtual >= 80))
        {
            pNovo = (pAtual * 0.95);
        }
        else
        {
            pNovo = pAtual;
        }
    }
}
