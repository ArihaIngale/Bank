public class TransactionHistory {
    int id;
    String s_name;
    String r_name;
    String status;
    String date;
    TransactionHistory(int id,String s_name,String r_name,String status,String date){
        this.id=id;
        this.s_name=s_name;
        this.r_name=r_name;
        this.status=status;
        this.date=date;
    }
    void displayhistory(){
        System.out.println("Transaction id: "+id);
        System.out.println("Sender name "+s_name);
        System.out.println("Reciever name "+r_name);
        System.out.println("Amount status "+status);
        System.out.println("Date: "+date);
    }
    public static void main(String[] args) {
       TransactionHistory t = new TransactionHistory(101,"shreya","ariha","successfull","10-05-2025");
       t.displayhistory(); 
    }
}
