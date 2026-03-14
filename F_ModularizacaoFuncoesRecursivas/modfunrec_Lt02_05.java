/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividade;

/*
    Série: (N/1) + ((N-1)/2) + ((N-2)/3) + ... + (1/N)
    Programador: Cássio
    Data: 12/03/2026
*/
public class modfunrec_Lt02_05 
{
    public static void main(String args[])
    {
        System.out.println(somar(10, 1));
    }
    
    public static double somar(double num, double x)
    {
        if (num > 1)
        {
            return (num/x) + somar((num - 1), (x + 1));
        }
        return num/x;
    }
}
