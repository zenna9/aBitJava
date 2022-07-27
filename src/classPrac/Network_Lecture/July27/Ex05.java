package classPrac.Network_Lecture.July27;

class Account {
    //공유해서 쓸 아래 static 
    static long balance = 10000;

    public void deposit(long amount){
        balance = balance + amount;
    }

    public void withdraw(long amount) {
        balance =+ amount;
    }
    public void getBalance() {
        System.out.println("balance : "+balance);
    }
}

//입금기능
// Thread 클래스로 만들면 한번밖에 못만듦. 근데 Runnable은 여러번 쓸 수 있어
class DepositThread implements Runnable{
    Account account;
    DepositThread(Account account){// 생성자가 생성할 때, Account를 전달받게 해줌
        this.account = account;
    }
    public void run(){
        for (int i = 0; i < 1000; i++) {//1000원을 1000번씩 입금하도록 할 예정
            account.deposit(1000);//1000원...
        }
        account.getBalance(); //잔액출력
    }
}
//출금기능
class WithdrawThread implements Runnable{
    Account account;
    WithdrawThread(Account account){// 생성자가 생성할 때, Account를 전달받게 해줌
        this.account = account;
    }
    public void run(){
        for (int i = 0; i < 1000; i++) {//1000원을 1000번씩출금
            account.withdraw(1000);//1000원...
        }
        account.getBalance();
    }
}

public class Ex05 {
    //위의 기능들을 스레드로 만들어서 실행
    //입금출금 열번씩 수행하자
    
    public static void main(String[] args) {
        Account account = new Account();
        for (int i = 0; i < 10; i++) {
            Thread deposit = new Thread(new DepositThread(account));
            Thread Withdraw = new Thread(new WithdrawThread(account));
            deposit.start();
            Withdraw.start();
        }
    }
    //출금과 입금 시행 수가 동일하므로 잔액이 같아야 하는데
    // 스레드가 두개인데 하나를 동시에 변경시키려고 하므로 금액이 개판됨
}
