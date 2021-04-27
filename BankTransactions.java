importjava.util.*;
class CustomerDetails
{
Scanner sc=new Scanner(System.in);
String name,type;
intaccno;
double balance;
public void get_details()
{
System.out.println("Enter account number");
accno=sc.nextInt();
System.out.println("Enter the name of account holder");
name=sc.next();
System.out.println("Enter account type");
type=sc.next();
System.out.println("Enter balance");
balance=sc.nextDouble();
}
public void display()
{
System.out.println("ACCOUNT NUMBER:"+accno+"\n"+"NAME OF THE ACCOUNT HOLDER:"+name);
System.out.println("ACOUNT TYPE:"+type+"\n"+"AVAILABLE BALANCE:"+balance);
}
}
class TransactionDetails extends CustomerDetails
{
Scanner sc=new Scanner(System.in);
public void withdraw()
{
System.out.println("Enter amount to withdraw");
double amount=sc.nextInt();
if(balance-amount<500)
System.out.println("You must maintain minimum balance");
else
{
balance=balance-amount;
System.out.println("AVAILABLE BALANCE:"+balance);
}
}
public void deposit()
{
System.out.println("Enter amount to deposit");
double amount=sc.nextInt();
balance=balance+amount;
System.out.println("AVAILABLE BALANCE:"+balance);
}
}
class BankTransactions extends TransactionDetails
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
BankTransactionbt=new BankTransaction();
bt.get_details();
bt.display();
System.out.println("Enter your choice(0(withdraw)/1(deposit)");
int choice=sc.nextInt();
if(choice==0)
bt.withdraw();
else if(choice==1)
bt.deposit();
else
System.out.println("invalid choice");
}
}
