// package classPrac.JavaBase_Lectrue.FistTest;

// public class ListStack<k> {
//     private Node root=null;
//     interface ListStackin<k>{
//         public k getKey();
//     }
    
//     public ListStack(){
//     }
//     class OrderedList<k> implements ListStackin<k>{
//         private k key;
//         public OrderedList(k key){
//             this.key = key;
//         }
//         public k getKey(){return key;}
//     }
//     public class Node{
//         private String data;
//         public Node link;

//         public Node(){
//             this.data = null;
//             this.link = null;
//         }
//         public Node(String data){
//             this.data = data;
//             this.link = null;
//         }

//         public String getData() {
//             return data;
//         }
//     }
// // ====add====
//     public void add(String item){
//         Node newNode = new Node(item);
//         if(root ==null ){
//             this.root = newNode;
//         }else {
//             Node temp = root;
            
//             while(temp.link != null){
//                 temp = temp.link;
//             }
//             temp.link = newNode;
//         }
//     }
//     // ====delete====
//     public void delete() {
//         Node preNode=null;
//         Node temp = null;
        
//         //stack 비어있는지 여부 확인
//         if (root ==null){
//             return;
//         }
//         if(root.link == null){
//             root = null;
//         }else {
//             preNode = root;
//             temp = root.link;
//         }
        
//         while(temp.link != null){
//             preNode = temp;
//             temp = temp.link;
//         }
//         preNode.link = null;
        
//     }
//     // ====print====
//     public void print(int[] ind) {
        
//         System.out.println("=======root is"+root.toString());
// //        Node temp = ind;
// //        while(temp != null){
// //            System.out.println();
// //            // 아래는 왜하지?
// //            temp = temp.link;
//     }
// }
