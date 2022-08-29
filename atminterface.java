import java.util.Scanner;
 class atminterface1{
        String name;
        String uname;
        String username;
        String password;
        String upassword;
        String accountno;
        String transactionh=" ";
        float balance=0.0f;
        float amount;
        Scanner sc=new Scanner(System.in);
       public void register()
       {
        System.out.println("Welcome!Register yourself here");
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter user name:");
         uname=sc.nextLine();
         System.out.println("Enter Password:");
         password=sc.nextLine();
         System.out.println("Enter accountno:");
        accountno=sc.nextLine();
        System.out.println("Registered Successfully");
        
       }


       public boolean login()
       {
        boolean ulogin=false;
         while(!ulogin){
         System.out.println("Enter  user name:");
        username=sc.nextLine();
        
        if(username.equals(uname))
        {
            while(!ulogin){
           System.out.println("Enter your password:");
        upassword=sc.nextLine();
        if(upassword.equals(password))
        {
              System.out.println("Login Successfully!");
               ulogin=true;
            
        }
        else
        {
              System.out.println("Invalid Password! Try again");
        }
            }
        }
        else
          System.out.println("no such username! Try again"); 
           }
           return ulogin;
       }
public void withdraw()
{
    int wamount;
    System.out.println("Enter amount to withdraw:");
    wamount=sc.nextInt();
    if(wamount<=balance)
    {
 System.out.println("Money withdrwan successfully");
 balance=balance-wamount;
  transactionh=transactionh.concat("\n Withdrawn-"+wamount);
    }
    else
    {System.out.println("Insufficient balance");
    }
}

public void deposit()
{
    int depositamt;
    System.out.println("Enter amount to deposit:");
    depositamt=sc.nextInt();
    System.out.println("Money deposited successfully");
    balance=balance+depositamt;
   
    transactionh=transactionh.concat("\n Deposited -"+depositamt);
}

public void checkbalance()
{
System.out.println("Your current amount balance is:"+balance);
}

public void transfer()
{
    int amt;
    System.out.println("Enter amount to transfer:");
    amt=sc.nextInt();
    if(amt<=balance)
    {
        System.out.println("Amount transferred successfully");
        balance=balance-amt;
           transactionh=transactionh.concat("\nTransferred-"+amt);
    }
    else
    {
          System.out.println("Insufficient balance");
    }

}

public void transactionhistory()
{
      System.out.println(transactionh);
}
 }
      
    
 public class atminterface
 {
public static void main(String[] args)
{
    System.out.println("----------------------------ATM INTERFACE----------------------------");
     System.out.println("\n1.Register \n2.Exit");
    System.out.println("Enter your choice:");
 atminterface1 obj=new atminterface1();
    Scanner sc=new Scanner(System.in);
    int choice;
    choice=sc.nextInt();

   switch(choice)
   {
    case 1:obj.register();
    System.out.println("\n1.Login \n2.Exit");
    System.out.println("Enter your choice:");
    int choi=sc.nextInt();
    
    switch(choi)
    {
        case 1:
        {
            if(true==obj.login())
            {
                System.out.println("\n1.Withdraw \n2.Deposit \n3.Check Balance \n4.Transaction history  \n5.Transfer \n6.Exit ");
               while(choi!=6){ System.out.println("Enter your choice:");
                int cho=sc.nextInt();
                switch(cho){
                case 1:
               obj.withdraw();
                break;
                case 2:obj.deposit();
                break;
                case 3:obj.checkbalance();
                break;
                case 4:obj.transactionhistory();
                break;
                case 5:obj.transfer();
                break;
                case 6:System.out.println("Exited successfully");
                System.exit(0);
                break;
                }}
            }
        }
        break;
      
        case 2:  System.out.println("Exited successfully");
        System.exit(0);
        break;
    }
    break;
  
    case 2:  System.out.println("Exited successfully");
    System.exit(0);
    break;
    default: System.out.println( "Invalid choice!");
    break;

   }}}
