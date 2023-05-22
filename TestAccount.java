public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("1", "Account 1", 5000);
        Account acc2 = new Account("2", "Account 2", 4000);


        System.out.println("Balance of acc1: " + acc1.getBalance());
        System.out.println("Balance of acc2: " + acc2.getBalance());

        acc1.transferTo(acc2, 1000);
        
        System.out.println("Balance of Account 1: " + acc1.getBalance());
        System.out.println("Balance of Account 2: " + acc2.getBalance());
    }
}
