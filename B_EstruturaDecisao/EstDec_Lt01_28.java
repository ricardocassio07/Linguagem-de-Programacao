    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import java.util.Scanner;

/*
    28. Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
        Venda Mensal | Preço Atual | Preço Novo
            <500           <30          +10%
        >=500 e <1000  >=30 e < 80      +15%
           >=1000         >=80          -5%
        Obs.: Para outras condições, preço novo será igual ao preço atual.
    Programador: Cássio
    Data: 22/02/2026 
*/
public class EstDec_Lt01_28 
{
    public static <T> void print(T arg)
    {
        System.out.println(arg);
    }
    
    public static void main(String args[])
    {
        double pAtual, vMensal, pNovo;
        
        Scanner scan = new Scanner(System.in);
        
        print("Quantidade de vendas:");
        vMensal = scan.nextDouble();
        print("Preco atual:");
        pAtual = scan.nextDouble();
        
        if (vMensal < 500 && pAtual < 30)
        {
            pNovo = (pAtual * 1.10);
        }
        else if (vMensal >= 500 && vMensal < 1000 && pAtual >= 30 && pAtual < 80)
        {
            pNovo = (pAtual * 1.15);
        }
        else if (vMensal >= 1000 && pAtual >= 80)
        {
            pNovo = (pAtual * 0.95);
        }
        else
        {
            pNovo = pAtual;
        }
        
        System.out.printf("Novo preco: R$ %.2f%n", pNovo);
    }
}
