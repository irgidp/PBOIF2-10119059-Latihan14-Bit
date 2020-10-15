/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi program untuk bit
 */
package pboif2.pkg10119059.latihan14.bit;

public class PBOIF210119059Latihan14Bit {

    public static void main(String[] args) {
        // TODO code application logic here
        int a = 60; // 60 = 0011 1100 
        int b = 13; // 13 = 0000 1101
        int c = 0;
        
       
        c = a & b;
        // 12 = 0000 1100
        System.out.println("a & b = " + c);
        
        c = a | b;
        // 61 = 0011 1101
        System.out.println("a | b = " + c);
        
        c = a ^ b;
        // 49 = 0011 0001
        System.out.println("a ^ b = " + c);
        
        c = ~a;
        // 61 = 0011 1101
        System.out.println("~a    = " + c);
        
        c = a << 2;
        // 240 = 1111 0000
        System.out.println("a << 2    = " + c);
        
        c = a >> 2;
        // 15 = 0000 1111
        System.out.println("a >> 2    = " + c);
        
    }
    
}
