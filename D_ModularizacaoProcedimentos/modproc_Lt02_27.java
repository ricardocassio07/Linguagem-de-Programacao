/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D_ModularizacaoProcedimentos;

import java.util.Scanner;

/*
    27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule
    velocidade média em Km/h.
    Programador: Cássio
    Data: 08/03/2026
*/
public class modproc_Lt02_27 
{
    static int numVoltas;
    static double extensao, tempo, VM;
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        do
        {
            System.out.println("Digite o numero de voltas:");
            numVoltas = scan.nextInt();
            System.out.println("Digite a extensao do circuito em metros:");
            extensao = scan.nextDouble();
            System.out.println("Digite o tempo de duracao da prova em minutos:");
            tempo = scan.nextDouble();
        }
        while((numVoltas < 0) || (extensao < 0) || (tempo < 0));
        
        calcular();
        
        scan.close();
    }
    
    static void calcular()
    {
        extensao /= 1000.0;
        tempo /= 60;
        
        VM = ((numVoltas * extensao) / tempo);
        
        System.out.println("VM = " + VM + " Km/h");
    }
}
