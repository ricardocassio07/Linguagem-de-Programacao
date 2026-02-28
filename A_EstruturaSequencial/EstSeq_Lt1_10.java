/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import java.util.Scanner;

/*
    10. Receba 2 números reais. Calcule e mostre a diferença desses valores.
*/
public class EstSeq_Lt1_10 {
    public static void main(String args[]){
        double n1, n2, diferenca;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um numero real:\n-> ");
        n1 = scan.nextInt();
        System.out.print("Digite outro numero real:\n-> ");
        n2 = scan.nextInt();
        
        if (n1 > n2){
            diferenca = (n1 - n2);
        } else{
            diferenca = (n2 - n1);
        }
        
        System.out.println("A diferenca entre " + n1 + " e " + n2 + " e " + diferenca);
    }
}
