package julyForth.B0721_compare1;

import java.util.Scanner;

public class ThisIsMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("input First String");
        
        String s = inp.next();
        System.out.println("input Second String");
        String t = inp.next();
        inp.close();

        Tr P = new Select(s,t);
        Tr Q = ((Select)P).check();

        System.out.println(((Select)P).connect(Q));

    }
}
