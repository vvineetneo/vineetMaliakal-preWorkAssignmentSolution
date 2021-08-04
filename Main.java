import java.util.Scanner;

 

public class Main {

	Scanner sc = new Scanner(System.in);

           //function to checkPalindrome
	public void checkPalindrome()  {
		Integer input,reverse,temp;
		System.out.println("Check Palindrome");
		System.out.print("Number : ");
		
		input = Integer.parseInt(sc.nextLine());
		temp = input;
		reverse = 0;
		
		while(temp>0) {

			reverse = (reverse*10) + (temp%10);
			temp = temp/10;

		}

		if (reverse.equals(input)) {
			System.out.println(input+" is a Palindrome");
		} else {
			System.out.println(input+" is Not a Palindrome");
		}
		
      }

            //function to printPattern

	public void printPattern() {
		Integer n;
		System.out.println("Print the Pattern");
		System.out.print("Number : ");
		n = Integer.parseInt(sc.nextLine());
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
      }

          //function to check no is prime or not
	public void checkPrimeNumber() {
		boolean flag=false;
		Integer n;
		System.out.println("Check Prime Number");
		System.out.print("Number : ");
		n = Integer.parseInt(sc.nextLine());
		
		for(int i=2;i<=(int)n/2;i++) {
			if(n%i==0) {
				flag = true;
				break;
			}
		}
		if(flag || n<2) {
			System.out.println(n+" is not a Prime");
		}
		else {
			System.out.println(n+" is a Prime");
		}
		

        }

          // function to print Fibonacci Series

	public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

            int first = 0, second = 1,n,third;
	   		System.out.println("Fibonacchi Series");
	   		System.out.print("Number : ");
	   		n = Integer.parseInt(sc.nextLine());
	   		
	   		if(n>0)
	   			System.out.print(first+" ");
	   		if(n>1)
	   			System.out.print(second+" ");
	   		for(int i = 2;i<n;i++) {
	   			third = first + second;
	   			first = second;
	   			second = third;
	   			System.out.print(third+" ");
	   		}

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

				do {
				
				System.out.println("Enter your choice from below list.\n" 
				+ "1. Find palindrome of number.\n"
				+ "2. Print Pattern for a given no.\n" 
				+ "3. Check whether the no is a  prime number.\n"
				+ "4. Print Fibonacci series.\n" 
				+ "--> Enter 0 to Exit.\n");
				System.out.println();
				 
				choice = Integer.parseInt(sc.nextLine());
				
				switch (choice) {
				
				 
				
				case 0:
				
					choice = 0;
				
					break;
				
				case 1: {
				
					obj.checkPalindrome();
				
					}
				
					break;
				
				case 2: { 
				
					obj.printPattern();
					
					}
					
					break; 
				
				case 3: {
				
					obj.checkPrimeNumber();
					
					}
					
					break;
				
				case 4: {
					obj.printFibonacciSeries();
					}
					
					break;
				
				 
				
				default:
				
					System.out.println("Invalid choice. Enter a valid no.\n");
					
				}
				
				 System.out.println("\n");
				
				} while (choice != 0);
				
				System.out.println("Exited Successfully!!!");
				
				sc.close();
				
				}

 

}

