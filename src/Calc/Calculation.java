package Calc;

import java.util.Scanner;

public class Calculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int size;
    Calculator calc = new Calculator();
    
    boolean exit=false;
    double num[];
    int n;
    while(!exit){
        System.out.println("---------------------Calculator------------------------");
        System.out.println("1. Addtion");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication-");
        System.out.println("4. Division");
        System.out.println("5. Exponential");
        System.out.println("6. Exit");
        System.out.println("Enter your selection: ");
        n=sc.nextInt();
    	switch(n){
    	case 1:
    		System.out.println("Addition");
    		System.out.println("Enter the total number of arguments for addition: ");
    		size=sc.nextInt();
    		num= new double[size];
    		System.out.println("Enter the "+ size +" numbers :");
    		for(int i=0;i<size;i++){
    			if (sc.hasNextInt()) {
                    num[i] = sc.nextInt();
                } else {
                    System.out.println("Unmatched inputs");
                    break;
                }
    		}
    		System.out.println(calc.Sum(num));
    		break;
    		
    	case 2:
    		System.out.println("Subtraction");
    		System.out.println("Enter the total number of arguments for Subtraction: ");
    		size=sc.nextInt();
    		num= new double[size];
    		System.out.println("Enter the "+ size +" numbers :");
    		for(int i=0;i<size;i++){
    			if (sc.hasNextInt()) {
                    num[i] = sc.nextInt();
                } else {
                    System.out.println("Unmatched inputs");
                    break;
                }
    		}
    		System.out.println(calc.Sub(num));
    		break;
    		
    	case 3:
    		System.out.println("Multiplication");
    		System.out.println("Enter the total number of arguments for Multiplication: ");
    		size=sc.nextInt();
    		num= new double[size];
    		System.out.println("Enter the "+ size +" numbers :");
    		for(int i=0;i<size;i++){
    			if (sc.hasNextInt()) {
                    num[i] = sc.nextInt();
                } else {
                    System.out.println("Unmatched inputs");
                    break;
                }
    		}
    		System.out.println(calc.Multiply(num));
    		break;
    		
    	case 4:
    		System.out.println("Division");
    		System.out.println("Enter the total number of arguments for Division: ");
    		size=sc.nextInt();
    		num= new double[size];
    		System.out.println("Enter the "+ size +" numbers :");
    		for(int i=0;i<size;i++){
    			if (sc.hasNextInt()) {
                    num[i] = sc.nextInt();
                } else {
                    System.out.println("Unmatched inputs");
                    break;
                }
    		}
    		System.out.println(calc.Divide(num));
    		break;
    		
    	case 5:
    		System.out.println("Exponential");;
    		System.out.println("Enter the total number of arguments for Exponential: ");
    		size=sc.nextInt();
    		num= new double[size];
    		System.out.println("Enter the "+ size +" numbers :");
    		for(int i=0;i<size;i++){
    			if (sc.hasNextInt()) {
                    num[i] = sc.nextInt();
                } else {
                    System.out.println("Unmatched inputs");
                    break;
                }
    		}
    		System.out.println(calc.Exponential(num));
    		break;
    		
    	case 6:
    		System.out.println("Have a Great Day!!!");
    		exit=true;
    		break;
    		
    	default:
    		System.out.println("Invalid Entry. Please try again");
    		break;
    	}
    }
	}

}
