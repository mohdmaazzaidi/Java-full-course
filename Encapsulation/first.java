public class first {
    public static void main(String[] args) {
        Bank a1 = new Bank("Muaaz","SBIN10012","SBI");
        a1.deposit(200);
        
        a1.withdrawal(70);

        a1.accountDt();
    }
}


class Bank{
    private int amount;
    String name;
    String ifsc;
    String bank;

    void accountDt(){
        System.out.println("Account holder name " +name);
        System.out.println("Available balance in your bank account is: "+amount);
        System.out.println("Your bank IFSC is: "+ifsc);
        System.out.println("Your bank is: "+bank);
    }

    void deposit(int amount){
        this.amount =  amount;
        System.out.println("Amount deposit sucessfully. Your Account balance is: "+amount);
    }

    void withdrawal(int amount){
        if(amount<=this.amount){
            System.out.println("Amount withdrawal of Rs: "+ amount);
            this.amount -= amount; 
        } else{
            System.out.println("Insufficent balance");
        }
    }
    
    Bank(String name ,String ifsc, String bank){
        this.name = name;
        this.ifsc = ifsc;
        this.bank = bank;
    }

}
