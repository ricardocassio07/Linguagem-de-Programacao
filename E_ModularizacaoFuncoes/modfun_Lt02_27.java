/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E_ModularizacaoFuncoes;

import java.util.Scanner;

/*
    27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a 
    velocidade média em Km/h.
    Programador: Cássio
    Data: 14/03/2026
*/
public class modfun_Lt02_27 
{
    public static void main(String args[])
    {
        int numVoltas;
        double extensao, tempo;
        
        Scanner scan = new Scanner(System.in);
        
        do
        {
            System.out.println("Numero de voltas:");
            numVoltas = scan.nextInt();
            System.out.println("Extensao do circuito:");
            extensao = scan.nextDouble();
            System.out.println("Tempo:");
            tempo = scan.nextDouble();
        }
        while((extensao < 0) || (numVoltas < 0) || (tempo < 0));
        
        double resultado = calcular(numVoltas, extensao, tempo);
        
        System.out.println("VM = " + resultado);
    }
    
    static double calcular(int numVoltas, double extensao, double tempo)
    {
        return (numVoltas * extensao) / tempo;
    }
}
