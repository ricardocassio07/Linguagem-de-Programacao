/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividade;

/*
    03. Série: (1/1) + (1/2) + (1/3) + ... + (1/N)
    Programador: Cássio
    Data: 12/03/2026
*/
public class modfunrec_Lt02_04 
{
    public static void main(String args[])
    {
        System.out.println(somar(2));
    }
    
    public static double somar(double N)
    {
        if (N > 1)
        {
            return ((1/N) + somar(N-1));
        }
        else if (N == 1)
        {
            return 1;
        }
        return 0;
    }
}

