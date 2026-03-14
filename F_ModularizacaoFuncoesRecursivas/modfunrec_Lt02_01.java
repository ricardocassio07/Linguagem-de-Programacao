/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividade;

/*
    Programador: Cássio
    Data: 12/03/2026
*/
public class modfunrec_Lt02_01 
{
    public static void main(String args[])
    {
        System.out.println(fatorial(4));
    }
    
    public static int fatorial(int num)
    {
        int fat;
        if (num > 1)
        {
            fat = (num * fatorial(num - 1));
            return fat;
        }
        else
        {
            return num;
        }
    }
}
