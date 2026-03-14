/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividade;

/*
    02. Série: (n) + (n - 1) + (n - 2) + ... + (1)
    Programador: Cássio
    Data: 12/03/2026
*/
public class modfunrec_Lt02_03 
{
    public static void main(String args[])
    {
        System.out.println(somar(10));
    }
    
    public static int somar(int N)
    {
        if (N > 1)
        {
            return N + somar(N - 1);
        }
        return N;
    }
}
