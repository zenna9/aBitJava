package classPrac.JavaBase_Lectrue.B0721_compare1;

import java.util.Scanner;

public class ThisIsMain0722 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("input First String");
        
        String s = inp.next();
        System.out.println("input Second String");
        String t = inp.next();
        inp.close();

        Tr1 P = new Select1(s,t);
        Tr1 Q = ((Select1)P).check();

        System.out.println(Select1.connect(Q));

    }
}
