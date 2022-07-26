// package classPrac.JavaBase_Lectrue.FistTest;

// import java.util.Scanner;

// import FistTest.ListStack.Node;

// public class ThisIsMain {
//     public static void main(String[] args) {
//         ListStack<String> links = new ListStack<>();
//         ListStack<String>.Node nodeLink = links.new Node();

//         boolean continues = true;
//         System.out.println("Linked List is generated.");

//         Scanner inp = new Scanner(System.in);
        
//         while (continues){
//             System.out.println("원하시는 메뉴를 선택 해 주세요");
//             System.out.println("1.insert \t 2.delete \t 3.output \t 4.invert \t 5.exit");
//             int menuchoice = inp.nextInt();
            
//             switch (menuchoice){
//                 case 1: //insert
//                 System.out.print("삽입할 데이터를 입력하세요 : ");
//                 String dataToAdd = inp.next();
//                 links.add(dataToAdd);
//                 System.out.println("...데이터가 추가되었습니다");
//                 System.out.println();
//                 break;

//                 case 2: //delete
//                 links.delete();
//                 System.out.println("...데이터를 지웠습니다");
//                 System.out.println();
//                 break;

//                 case 3: //print
//                 System.out.println("출력을 시작합니다....");
                
//                 links.print({0});
//                 break;

//                 case 4: //invert

//                 break;

//                 case 5: 
//                 System.out.println("시스템을 종료합니다");
//                 System.exit(0);
                
//                 //메뉴번호 외의 것을 입력한 경우 default
//                 default:
//                     System.out.println("없는 메뉴를 선택했습니다");
//                     System.out.println();

//             }
//         }


//         inp.close();

//     }
// }
