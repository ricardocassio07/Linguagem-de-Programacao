/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import java.util.Scanner;

/*
    17. Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12km/L.
    Receber o tempo de percuso e a velocidade média.
*/
public class EstSeq_Lt1_17 {
    public static void main(String args[]){
        double T, VM, D, L;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o tempo total gasto para realizar o percuso em horas:\n-> ");
        T = scan.nextDouble();
        
        System.out.print("Digite a velocidade média do percurso em kilometros por hora:\n-> ");
        VM = scan.nextDouble();
        
        if (T > 0 && VM > 0){
            D = VM/T;

            L = D / 12.0;

            System.out.println("Foram gastos " + L + " litros na viagem");
        } else{
            System.out.println("Entrada inválida! Verifique se o tempo e a velocidade média é maior que zero!");
        }
    }
}
