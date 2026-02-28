/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import java.util.Scanner;

/*
    12. Receba o ano de nascimento de uma pessoa e o ano atual. Calcule e mostre sua idade e quantos anos ela terá daqui a 17 anos.
*/
public class EstSeq_Lt1_12 {
    public static void main(String args[]){
        int aNasc, aAtual, iAtual, iFutura;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento da pessoa:\n-> ");
        aNasc = scan.nextInt();
        System.out.print("Digite o ano atual:\n-> ");
        aAtual = scan.nextInt();
        
        if (aNasc < aAtual){
            iAtual = (aAtual - aNasc);
            iFutura = (iAtual + 17);
            
            System.out.println("A idade atual dessa pessoa e " + iAtual + " anos e daqui a 17 anos, ela tera " + iFutura + " anos!");
        } else {
            System.out.println("O ano de nascimento nao pode ser maior que o ano atual!");
        }
    }
}
