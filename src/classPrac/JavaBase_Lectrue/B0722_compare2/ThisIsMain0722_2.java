package classPrac.JavaBase_Lectrue.B0722_compare2;

import java.util.Scanner;

public class ThisIsMain0722_2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("input First String");
        
        String s = inp.next();
        System.out.println("input Second String");
        String t = inp.next();
        inp.close();

        Tr2 P = new Select2(s,t);
        Tr2 Q = ((Select2)P).check();

        if(Q instanceof Numcmp2){
            System.out.println("두 문자열은 동일한 숫자를 의미합니다");
        }else{
            System.out.println("두 문자열은 다릅니다");
        }

    }
}
