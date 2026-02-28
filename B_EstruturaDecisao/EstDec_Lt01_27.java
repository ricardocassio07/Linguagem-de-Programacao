/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B_EstruturaDecisao;

import java.util.Scanner;
/*
    27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a 
    velocidade média em Km/h.
    Programador: Cássio
    Data: 22/02/20o26
*/
public class EstDec_Lt01_27 
{
    public static <T> void print(T arg)
    {
        System.out.println(arg);
    }
    public static void main(String args[])
    {
        double numVoltas, extensao, tempo, VM;
        
        Scanner scan = new Scanner(System.in);
        
        print("Numero de voltas:");
        numVoltas = scan.nextDouble();
        print("Extensao do circuito (em metros):");
        extensao = scan.nextDouble();
        print("Tempo de duracao (em minutos):");
        tempo = scan.nextDouble();
        
        extensao /= 1000.0;
        tempo /= 60.0;
        
        VM = ((numVoltas * extensao) / tempo);
        
        print("VM = " + VM);
        
    }
}
