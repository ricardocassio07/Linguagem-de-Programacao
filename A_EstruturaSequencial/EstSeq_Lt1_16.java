/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_EstruturaSequencial;

import java.util.Scanner;

/*
    16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número
    de dependentes. Calcule o salário que serão as horas trabalhadas multiplicado pelo valor da hora.
    Calcule o salário líquido (= Sálario Bruto - Desconto). A cada dependente, será acrescido R$100,00 no Salário Líquido.
    Mostre o sálario a ser recebido.
*/
public class EstSeq_Lt1_16 {
    public static void main(String args[]){
        double qtdeHoras, valorHora, percentDeconto, salBruto, salLiquido;
        int numDepen;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de horas trabalhadas:\n-> ");
        qtdeHoras = scan.nextDouble();
        System.out.print("Digite o valor da hora de trabalhado:\n-> ");
        valorHora = scan.nextDouble();
        System.out.print("Digite o percentual de desconto:\n-> ");
        percentDeconto = scan.nextDouble();
        System.out.print("Digite a quantidade de dependentes:\n-> ");
        numDepen = scan.nextInt();
        
        if ((qtdeHoras > 0) && (valorHora > 0) && (percentDeconto >= 0) && (numDepen >= 0)){
            salBruto = (qtdeHoras * valorHora);
            salLiquido = (salBruto * (1 - (percentDeconto / 100)));
            salLiquido += (100 * numDepen);
            System.out.println("Esse funcionario ira receber " + salLiquido);
        } else {
            System.out.println("Entrada inválida! Verifique se as horas e valor da hora são maiores que zero e se desconto e dependentes não são negativos.");
        }
        
        scan.close();
        
    }
}
