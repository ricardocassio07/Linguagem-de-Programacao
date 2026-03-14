/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividade;

/*
    Série: (N)! + (N-1)! + (N-2)! + ... + (1)!
    Programador: Cássio
    Data: 12/03/2026
*/
public class modfunrec_Lt02_06 
{
    public static void main(String args[])
    {
        System.out.println(somar(5));
    }
    
    public static int somar(int N)
    {
        if (N > 1)
        {
            return fat(N) + somar(N-1);
        }
        return 1;
    }
    
    public static int fat(int n)
    {
        if (n > 1)
        {
            return n * fat(n-1);
        }
        return 1;
    }
}
