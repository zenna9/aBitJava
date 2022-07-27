// package classPrac.Network_Lecture.July27;
// //혼자 다시해봐야함
// import java.io.*;
// import java.net.*;

// public class Client04 {

//     //보내는 스레드...
//     public static void main(String[] args) throws IOException{
//         Socket cs = new Socket("192.168.1.10",2222);
//         //스레드1
//         Sender sender = new Sender(cs);
//         sender.start();
//         //스레드2
//         Reciever reciever = new Reciever(cs);
//         reciever.start();
//     }

// }
