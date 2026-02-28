/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import java.util.Scanner;

/*
    11. Receba o raio de uma circunferência. Calcule e mostre o valor de seu comprimento.
*/
public class EstSeq_Lt1_11 {
    public static void main(String args[]){
        double R, P;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do raio da circunferencia:\n-> ");
        R = scan.nextInt();
        
        P = (2 * Math.PI * R);
        
        System.out.println("O valor do comprimento da figura e " + P);
    }
}
