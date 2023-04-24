/*
	Name: lykogeorgos Konstantinos
	Student Number:p3220260
*/

import java.util.Scanner;

class App2 {
    public static void isPrime(){




				Scanner input = new Scanner(System.in);
				System.out.print("Enter a positive integer: ");
				int number = input.nextInt();
				boolean isPrime = true;

				if (number <= 1) {
					isPrime = false;
				} else {
					for (int i = 2; i <= Math.sqrt(number); i++) {
						if (number % i == 0) {
							isPrime = false;
							break;
						}
					}
				}

				if (isPrime) {
					System.out.println("The number:"+number + " is a prime.");
				} else {
					System.out.println("The number:"+number + " is not a prime.");
				}
			}



		
  	
	public static void main(String args[]){
		
		isPrime();
     	
   	}

}





