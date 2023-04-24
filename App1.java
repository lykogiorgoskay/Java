/*
	Name: lykogeorgos Konstantinos
	Student Number:p3220260
*/

import java.util.Scanner;

class App1 {
	
		
    // Fill your code here (Method)
		
  	public static class isPrime {
		public int number;
		Scanner sc;
		public isPrime() {
			this.sc = new Scanner(System.in);
			System.out.print("Give the number> ");
			this.number = sc.nextInt();
		}

		public void isPrime() {
			boolean isPrime = true;

			if (this.number <= 1) {
				isPrime = false;
			} else {
				for (int i = 2; i <= Math.sqrt(this.number); i++) {
					if (this.number % i == 0) {
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
	}



	public static void main(String args[]){
		  isPrime num = new isPrime();
		  num.isPrime();


     	
   	}

}

