/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import java.util.Scanner;

/*
    13. Receba a quantidade de alimentos em quilograma. Calcule e mostre
    quantos dias durará esse alimento sabendo que a pessoa consome 50g ao
    dia.
*/
public class EstSeq_Lt1_13 {
    public static void main(String args[]){
        double qtdeAlimentos, qtdeDias;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a quantidade total de alimentos em quilogramas (Kg):\n-> ");
        qtdeAlimentos = scan.nextDouble();
        
        if (qtdeAlimentos > 0){
            qtdeDias = (qtdeAlimentos / 0.050);

            System.out.println("Esse alimento durara por " + qtdeDias + " dias!");
        } else{
            System.out.println("Quantidade invalida");
        }
        
        scan.close();
    }
}
