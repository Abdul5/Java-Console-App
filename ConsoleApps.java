import java.math.BigInteger;
import java.util.Scanner;
class ConsoleApps
{
  public static void main(String args[])
   {
     Scanner f = new Scanner(System.in);
     int opt = '\0';
     do
      {
     System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
     System.out.println("welcome to the software world of ABDUL QUADIR");
     System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
     System.out.println("\n");
     System.out.println("1. Arithmetic operation");
     System.out.println("2. Greatest and Least value");
     System.out.println("3. Banking Transaction");
     System.out.println("4. Even and Odd Number");
     System.out.println("5. Exit");
     System.out.println("\n");
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("Enter Your Option in MAIN MENU");
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			//opt = f.next().charAt(0);
                        opt = f.nextInt();
			System.out.println("\n");
      switch(opt)
      { 
        case 1:int b = '\0';
               do
                {
               System.out.println("\n");
               System.out.println("1. BigInteger ");
               System.out.println("2. without BigInteger ");
               System.out.println("3. Exit ");
               System.out.println("\n");
               System.out.println("enter your choice"); 
               b = f.nextInt();
               System.out.println("\n");
               switch(b)
                 {
                    case 1:String s1,s2;
                           Scanner sc = new Scanner(System.in);
                           System.out.println("Enter first BigInteger");
                           s1=sc.next();
                           System.out.println("Enter Second BigInteger");
                           s2=sc.next();
                           BigInteger b1=new BigInteger(s1);
                           BigInteger b2=new BigInteger(s2);
                           BigInteger result;
                           result = b1.add(b2);
                           System.out.println("Addition is = " +result);
                           break;
                    case 2:Scanner op = new Scanner(System.in);
                           System.out.println("Enter First Number");
                           double number1=op.nextDouble();
                           System.out.println("Enter Operator(+,-,*,/)");
                           char operator=op.next().charAt(0);
                           System.out.println("Enter Second Number");
                           double number2=op.nextDouble();
                           double sum=0.0;
                           switch(operator)
                             {
                               case '+':sum=number1+number2;
                                        System.out.println("Addition: " +sum);
                                        break;
                               case '-':sum=number1-number2;
                                        System.out.println("Substraction: "+sum);
                                        break;
                               case '*':sum=number1*number2;
                                        System.out.println("Multiplication: "+sum);
                                        break;
                               case '/':sum=number1/number2;
                                        System.out.println("Devide: "+sum);
                                        break;
                                default:System.out.println("invilid operator");
                                        break;
                              }
                            break;
                    case 3:break;
                   default:System.out.println("incorrect option");
                           break;
                      }
                   }
                   while(b != 3);
               break;     
        case 2:int j = '\0';
               do
                {
               System.out.println("\n");
               System.out.println("1. Check No. is max & min");
               System.out.println("2. Exit");
               System.out.println("\n");
               System.out.println("enter your option"); 
               j=f.nextInt();
               switch(j)
                {
                  case 1:int count,max,min;   
                         int[] arr=new int[500];
                         Scanner in = new Scanner(System.in);
                         System.out.println("Enter no. of elements");
                         count=in.nextInt();
                         System.out.println("Enter"+count+" elements");
                         for(int i=0;i<count;i++)
                         {
                           arr[i]=in.nextInt();
                         }
                         max=min=arr[0];
                        for(int i=1;i<count;i++)
                        {
                           if(arr[i] > max)
                            
                               max = arr[i];
                            
                           else if(arr[i]<min)
                            
                               min = arr[i];
                         }
                        System.out.println("maximum : " + max);
                        System.out.println("minimum : " + min);
                        break;
                   case 2:break;
                 default:System.out.println("in-correct value");
                         break;
                   }
                 }
                 while(j != 2);
                  break;
        case 3: 
                Scanner keyboard = new Scanner(System.in);
                int pin=12345;
                System.out.println("Enter your PIN for BANKING\n");
                int entry = keyboard.nextInt();
                while(entry != pin)
                           {
                             System.out.println("\n INCORRECT PIN. TRY AGAIN.");
                             System.out.println("Enter your PIN : ");
                             entry = keyboard.nextInt();
                           }
                System.out.println("\n PIN ACCEPTED. YOU NOW HAVE BANKING ");                           
                System.out.print("\n");


		int balance = 0, withdraw, deposit;
                int n='\0';
        
                do
                {
                  System.out.println("********************************");
                  System.out.println("Welcome ABDUL");
                  System.out.println("Saving Acc no. : 20BLCS005HY");
                  System.out.println("********************************");
                  System.out.println("\n");
                  System.out.println("1. Current Balance");
                  System.out.println("2. Deposit Amount");
                  System.out.println("3. Withdraw Amount");
                  System.out.println("4. EXIT");
                  System.out.print("Choose your option:");
                  Scanner sc = new Scanner(System.in);
                  n = sc.nextInt();
                  switch(n)
                  {
                    case 1:
			   System.out.println("Your Current Balance is : "+balance);

                           System.out.println("\n");

                           break;

                    case 2:

                           System.out.print("Enter money to be deposited : ");

                           deposit = sc.nextInt();

                           balance = balance + deposit;

                           System.out.println("Your balance deposited is : "+deposit);

                           System.out.println("\n");

                           break;
 
                    case 3:
                           System.out.print("Enter money to be withdrawn : ");

                           withdraw = sc.nextInt();

                           if(balance >= withdraw)
                            {
                              balance = balance - withdraw;

                              System.out.println("Your withdraw Balance is : "+withdraw);
                            }

                           else
                            {
                              System.out.println("In-sufficient Balance");
                            }

                              System.out.println("");
                              break;
 
                     case 4:
                              break;
	            default:
			      System.out.println("Invalid option!! please enter valid option");
			      break;
                        }
			
                      }
                        while( n != 4);
                        System.out.println("Thank You for Using our Banking Services.....!!");
                        System.out.println("\n");
                        break;
        case 4:char options = '\0';
                 do {  
                 System.out.println("\n");
                 System.out.println("A. Check Even & Odd");
                 System.out.println("B. Exit");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			System.out.println("Enter Your Option");
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			options = f.next().charAt(0);
			System.out.println("\n");
               switch(options)
                 {
                   case 'A':Scanner c = new Scanner(System.in);
                          System.out.println("enter any number to check even & odd");
                          int q=c.nextInt();
                          if(q%2==0)
                            {
                              System.out.println("no is even");
                            }
                          else
                            {
                              System.out.println("no is odd");
                            }
                            break;
                   case 'B':break; 
                  default:System.out.println("in-correct option");
                          break;
                  } 
                }
                while(options != 'B');
                break;
        case 5:break;
       default:System.out.println("invilid choice");
               break;
       }
     }
    while (opt != 5);
    System.out.println("Thanks For Using My Console App 'Abdul Quadir-20BLCS005HY' ");
    System.out.print("\n");
   }
}
