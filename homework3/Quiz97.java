//Account类
import java.util.Date;

public class Quiz97{
    public static void main(String[] args){
        //创建一个新账户，存款、取款、打印
        Account account1122 = new Account(1122, 20000);
        account1122.setAnnualInterestRate(4.5);
        account1122.withdraw(2500);
        account1122.deposit(3000);

        System.out.println("Account balance: " + account1122.getBalance());
        System.out.println("Account monthly interest: " + account1122.getMonthlyInterest());
        System.out.println("Account opened on: " + account1122.getDateCreated().toString());
    }
}

class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    //无参构造方法
    public Account(){
        dateCreated = new Date();
    }

    //有指定id和初始余额的构造方法
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    //id、balance、annualInterestRate的访问器和修改器
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //dateCreated的访问器方法
    public Date getDateCreated(){
        return dateCreated;
    }

    //返回月利率
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    //返回月利息
    public double getMonthlyInterest(){
        double monthlyInterestRate = getMonthlyInterestRate();
        return balance * (monthlyInterestRate / 100);
    }

    //从账户提取指定额度
    public void withdraw(double amount){
        balance = balance - amount;
    }

    //向账户存储指定额度
    public void deposit(double amount){
        balance = balance + amount;
    }
}
