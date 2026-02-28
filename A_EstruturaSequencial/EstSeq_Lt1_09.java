/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import java.util.Scanner;

/*
    9. Receba 2 números inteiros. Calcule e mostre a soma dos quadrados.
*/
public class EstSeq_Lt1_09 {
    public static void main(String args[]){
        int n1, n2, r;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero inteiro:\n-> ");
        n1 = scan.nextInt();
        System.out.print("Digite outro nu mero inteiro:\n-> ");
        n2 = scan.nextInt();
        r = ((n1 * n1) + (n2 * n2));
        System.out.println("A soma dos quadrados de " + n1 + " e " + n2 + " e igual a " + r);
    }
}
