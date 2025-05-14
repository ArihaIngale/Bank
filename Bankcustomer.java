public class Bankcustomer {
    String c_name;
    String acc_num;
    int cust_age;
    Bankcustomer(String c_name,String acc_num,int cust_age){
        this.c_name=c_name;
        this.acc_num=acc_num;
        this.cust_age=cust_age;
    }
    void Displaycust(){
        System.out.println("Customer name"+c_name);
        System.out.println("Account number"+acc_num);
        System.out.println("Customer age"+cust_age);
    }
    public static void main(String[] args){
        Bankcustomer c = Bankcustomer("rohit","F3600",40);
        c.Displaycust();
    }
}
