
public class Main {
    public static void main(String[] args) {
//        Point p1 = new Point(0,0);
//        p1.getX(); //wrong
//        Point p2 = new Point(3,4);
//        p1.printPoint();
//        p2.printPoint();
//        System.out.println(p1.getX()); //0
//        p1.setX(1);
//        System.out.println(p1.getX()); //1
//        MyComplex sum = MyComplex.addNew( new MyComplex(1, 1), new MyComplex(1,
//                2));
//        System.out.println(sum);



        //Bank Account Lab
        BankAccount bankAccount1 = new BankAccount("person1",
                123, 1000);
        System.out.println(bankAccount1);

        bankAccount1.withdraw(100);
        System.out.println(bankAccount1);

        bankAccount1.deposit(200);
        System.out.println(bankAccount1);

        System.out.println(BankAccount.getNumberOfAccounts());
    }
}