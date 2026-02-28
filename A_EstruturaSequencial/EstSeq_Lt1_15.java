/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import java.util.Scanner;

/*
    15. Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre o valor da hipotenusa.
*/
public class EstSeq_Lt1_15 {
    public static void main(String args[]){
        double c1, c2, h;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor do primeiro cateto:\n-> ");
        c1 = scan.nextDouble();
        
        System.out.print("Digite o valor do segundo cateto:\n-> ");
        c2 = scan.nextDouble();
        
        if (c1 > 0 && c2 > 0){
            h = Math.sqrt(Math.pow(c1, 2.0) + Math.pow(c2, 2.0));
            System.out.println("O valor da hipotenusa e " + h);
        } else{
            System.out.print("O comprimento dos catetos devem ser positivos!");
        }
        
        scan.close();
    }
}
