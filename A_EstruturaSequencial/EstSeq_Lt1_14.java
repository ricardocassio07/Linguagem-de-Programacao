/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import java.util.Scanner;

/*
    14. Receba 2 ângulos de um triângulo. Calcule e mostre o valor do terceiro ângulo.
*/
public class EstSeq_Lt1_14 {
    public static void main(String args[]){
        double a1, a2, a3;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor do primeiro angulo:\n-> ");
        a1 = scan.nextDouble();
        
        System.out.print("Digite o valor do segundo angulo:\n-> ");
        a2 = scan.nextDouble();
        
        if (a1 > 0 && a2 > 0 && a1 + a2 < 180){
            
            a3 = (180 - (a1 + a2));
            
            System.out.println("O valor do terceiro angulo e " + a3);
        } else{
            System.out.println("Os angulos devem ser maiores que zero!");
        }
        
        scan.close();
    }
}
