import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
  public static void main(String args[])throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n,choice,accid,accidf,accidt;
       String id,name;
       Integer balance,amount;
       Account acc,accf,accct;
       System.out.println("Enter the no of accounts you want to create");
        n=Integer.parseInt(br.readLine());
        Account [] accarr=new Account[n]; 
        for(int i=0;i<n;i++){
           System.out.println("Enter the ID/ACCNO:");
           id=br.readLine();
           System.out.println("Enter the Name");
           name=br.readLine();
           System.out.println("Enter the Balance");
           balance=Integer.parseInt(br.readLine());    
           acc=new Account (id,name,balance);
           accarr[i]=acc;
        }

    for(int i=0;i<n;i++)
{
 System.out.println(accarr[i]);
}  
 do{
    System.out.println("1)credit");
    System.out.println("2)debit");
    System.out.println("3)Transfer");
    System.out.println("Enter your choice");
    choice=Integer.parseInt(br.readLine());
    switch(choice){
        case 1: 
          System.out.println("Select the Account");
          display(accarr,n);
          accid=Integer.parseInt(br.readLine());
          acc=accarr[accid-1];
          System.out.println("Enter the amount to be added ");
          amount=Integer.parseInt(br.readLine());
          balance=acc.credit(amount);
          System.out.println(balance);
          System.out.println(acc.toString());
          break;

        case 2: 
        System.out.println("Select the Account");
        display(accarr,n);
        accid=Integer.parseInt(br.readLine());
        acc=accarr[accid-1];
        System.out.println("Enter the amount to be debited ");
        amount=Integer.parseInt(br.readLine());
        balance=acc.debit(amount);
        System.out.println(balance);
        System.out.println(acc.toString());

        case 3: 
          System.out.println("Select the account to transfer from:");
        display(accarr,n);
        accidf=Integer.parseInt(br.readLine());
         accf=accarr[accidf-1];
        System.out.printf("Select the account to transfer to:");
        display(accarr,n);
        accidt=Integer.parseInt(br.readLine());
        accct=accarr[accidt-1];        
        System.out.println("select the amount to transfer:");
        amount=Integer.parseInt(br.readLine());
        balance= accf.transferTo(accf,amount);
        
           
         }
      }
    
    
    while(choice>=1 && choice<=2);  

  }
    public static void display(Account [] accarr,Integer n){
         for(int i=0;i<n;i++){
            System.out.println((i+1)+". Name :"+accarr[i].getName());
            System.out.println("  Balance :"+accarr[i].getBalance());
         }
     }
  }



