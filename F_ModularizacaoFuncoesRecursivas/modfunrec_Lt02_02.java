/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividade;

/*
    01. Série 1 = (1 + 2 + 3 + ... + 100)
    Programador: Cássio
    Data: 12/03/2026
*/
public class modfunrec_Lt02_02 
{
    public static void main(String args[])
    {
        System.out.println(somar(1, 100));
    }
    
    public static int somar(int inicio, int fim)
    {
        if (inicio < fim)
            return inicio + somar((inicio + 1), fim);
        return inicio;
    }
}
