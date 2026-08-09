

// Parent cls
class payment{
    void pay(){
        System.out.println("Payment is done");
    }
}

// Child cls extend the parent cls, parent's methos are comes here
class credit_card extends payment{
    @Override // parent's already written method is override in child cls for modification
    void pay(){
        System.out.println("Payment is done using credit card");
    }
    
    void withdraw(){ // new method is created in child cls it doesn't need the override not for new method only for same method name that needs to be modify
        System.out.println("Withdraw is done using credit card");
    }
}

class debit_card extends payment{
    @Override
    void pay(){
        System.out.println("Payment is done using debit card");
    }

    void deposit(){
        System.out.println("Deposit is done using debit card");
    }

}


public class extend_cls {
    public static void main(String[] args) {
        payment obj = new payment();
        obj.pay();
        
        credit_card obj1 = new credit_card();
        obj1.pay();
        obj1.withdraw();
        
        debit_card obj2 = new debit_card();
        obj2.pay();
        obj2.deposit();
    }
}
