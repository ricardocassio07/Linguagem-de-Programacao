package H_Matrizes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

/*
    01. Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas, Calcular e exibir:
        a. A quantidade de cada produto vendido no mês;
        b. A quantidade de produtos vendidos por semana;
        c. O total de produtos vendidos no mês.
    Programador: 20/03/2026
    Data: 20/03/2026
*/

public class mat_Lt02_01 
{
    static int semanas = 4;
    static int qtdeProdutos = 3;
    
    public static void main(String args[])
    {
        int[][] produtos = new int[semanas][qtdeProdutos];
        
        for (int produto = 0; produto < qtdeProdutos; produto++)
        {
            switch (produto){
                case (0):
                    JOptionPane.showMessageDialog(null, "Para o produto A:");
                    break;
                case (1):
                    JOptionPane.showMessageDialog(null, "Para o produto B:");
                    break;
                case (2):
                    JOptionPane.showMessageDialog(null, "Para o produto C:");
                    break;
            }
            for (int semana = 0; semana < semanas; semana++)
            {
                produtos[semana][produto] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vendas do produto na semana " + (semana + 1) + ":"));
            }
        }
        
        int[] qtdeProdutosVendidos = qtdeProdutosVendidos(produtos);
        int[] qtdeSemanal = qtdeVendidasSemanalmente(produtos);
        int qtdeProdutos = qtdeProdutos(produtos);
        
        JOptionPane.showMessageDialog(null, "Quantidade de vendas:\nProduto A: " + qtdeProdutosVendidos[0] + 
                                    " vendas\nProduto B: " + qtdeProdutosVendidos[1] + " vendas\nProduto C: " + 
                                    qtdeProdutosVendidos[2] + " vendas");
        
        JOptionPane.showMessageDialog(null, "Quantidade de vendas semanais:\nSemana 1: " + qtdeSemanal[0] +
                                      " vendas\nSemana 2: " + qtdeSemanal[1] + " vendas\nSemana 3: " + 
                                      qtdeSemanal[2] + " vendas\nSemana 4: " + qtdeSemanal[3] + " vendas");
        
        JOptionPane.showMessageDialog(null, "No mês foram vendidos " + qtdeProdutos + " produtos");
        
        
    }
    
    public static int[] qtdeProdutosVendidos(int[][] produtos)
    {
        int[] qtde = new int[3];
        for (int produto = 0; produto < qtdeProdutos; produto++)
        {
            for (int semana = 0; semana < semanas; semana++)
            {
                qtde[produto] += produtos[semana][produto];
            }
        }
        return qtde;
    }
    
    public static int[] qtdeVendidasSemanalmente(int[][] produtos)
    {
        int[] qtde = new int[4];
        for (int semana = 0; semana < semanas; semana++)
        {
            for (int produto = 0; produto < qtdeProdutos; produto++)
            {
                qtde[semana] += produtos[semana][produto];
            }
        }
        return qtde;
    }
    
    public static int qtdeProdutos(int[][] produtos)
    {
        int qtde = 0;
        for (int produto = 0; produto < qtdeProdutos; produto++)
        {
            for (int semana = 0; semana < semanas; semana++)
            {
                qtde += produtos[semana][produto];
            }
        }
        return qtde;
    }
}
