class BankService{
    public static void main(String[] args){
        int balance=1000;
        int withdrawlamount=900;
        int depositamount=500;
        System.out.println("Initial Balance:" +balance);
        balance= balance + depositamount;
        System.out.println(" Balance after Deposit of " +depositamount + ":" +balance);
       
        balance = balance - withdrawlamount;
        System.out.println("balance after Withdrawl of " +withdrawlamount + ":" +balance);
        System.out.println(" Final Balance:" +balance);  
        }
    }
