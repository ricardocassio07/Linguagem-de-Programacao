/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C_EstruturaRepeticao;

/*
    43. Calcule e mostre quantos anos serão necessários para que Ana seja maior que
    Maria sabendo Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao
    ano.
    Programador: Cássio
    Data: 28/02/2026
*/
public class EstRep_Lt01_43
{
    public static void main(String args[])
    {
        double aAna = 1.10, aMaria = 1.50;
        int tempo = 0;
        
        while (aAna <= aMaria)
        {
            aAna += 0.03;
            aMaria += 0.02;
            tempo++;
        }
        
        System.out.println("Vai demorar " + tempo + " anos!");
    }
}
