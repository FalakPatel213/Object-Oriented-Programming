// Here, the variabales are declared private, so we cannot access these variables in another class.
// So, we have to make two methods. One to set the info from another class and Second one to get the info in another class.

class Account{
    private long accNo;
    private String name;
    private float amount;

    public long getAcc_no(){
        return accNo;
    }

    public void setAccNo(long accNo){
        this.accNo = accNo;
    }
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getAmount(){
        return amount;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }
}

public class TestEncapsulation{
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAccNo(453564);
        ac.setName("Falak Patel");
        ac.setAmount(500000);

        System.out.println(ac.getAcc_no());
        System.out.println(ac.getAmount());
        System.out.println(ac.getName());
    }
}