public class Bank {
    public static void main(String[] args){
        Account a=new Account();
        a.setAccno(123456789);
        a.setAccname("Satyam");
        a.setAmt(40000);
        a.setEmail("satyam.samrat@gmail.com");
        System.out.println(a.getAccno()+" "+a.getAccname()+" "+a.getAmt()+" "+a.getEmail());
    }
}
