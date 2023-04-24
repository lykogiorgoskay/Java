/*
	Name: lykogeorgos Konstantinos
	Student Number:p3220260
*/


import java.util.Scanner;

class App6 {
	private static class  Coiner {

		Scanner sc = new Scanner(System.in);
		private int euro;
		private int cents;

		public int getEuro() {
			return euro;
		}

		public void setEuro(int euro) {
			this.euro = euro;
		}

		public int getCents() {
			return cents;
		}

		public void setCents(int cents) {
			this.cents = cents;
		}

		public Coiner() {
			Scanner sc = new Scanner(System.in);
			int number1, number2;

			System.out.print("\nInsert the euro> ");
			while(!sc.hasNextInt()){
				System.out.print("\nOnly positive integers numbers please, inert again (number>0)> ");
				sc.nextLine();
			}
			number1 = sc.nextInt();
			if(number1< 0)
				number1 *=-1;
			if(number1>20)
				number1 = 20;
			setEuro(number1);
			System.out.println("Insert the cents> ");
			sc.nextLine();
			while(!sc.hasNextInt()){

				System.out.println("Only positive integers numbers please, inert again (number>0)> ");
				sc.nextLine();
			}
			number2 = sc.nextInt();
			if(number2< 0)
				number2 *=-1;
			if(number2>99)
				number2 = 99;
			setCents(number2);
		}

		public int amount() {
			int amount = getEuro() * 100 + getCents() ;
			return amount;
		}

		public void coinCutter(int amount) {
			String s = "-- Parking Ticket Payment --\n" +
					"Fee: 5 euros and 24 cents\n" +
					"Payment...\n"+
					"euros = "+euro+
					"\ncents = "+cents;


			if (amount < 524) {
				s = s + "\nNot enough money!";
				System.out.print(s);
			}
			else {
					s= s+ "\n"+"Change:";
					amount = amount -= 524;
					int euros = amount /100 ;
					s = s+ "\neuros = "+ euros;
					int counter = 0;
					while (euros >= 10) {

						euros -= 10;
						counter++;

					}
					if(counter > 0){
						s = s +"\n"+ counter+ " (10 euros)";
						counter = 0;
					}
					while (euros >= 5) {

						euros -= 5;
						counter ++;
					}
				if(counter > 0){
					s = s +"\n"+ counter+  " (5 euros)";
					counter = 0;
				}
					while (euros >= 2) {
						euros -= 2;
						counter++;
					}
				if(counter > 0){
					s = s +"\n"+ counter + " (2 euros)";
					counter = 0;
				}
					while (euros >= 1) {
						euros -= 1;
						counter++;
					}
				if(counter > 0){
					s = s+"\n" + counter + " (1 euro)";
					counter = 0;
				}
					int cents = amount % 100;
				s = s+"\n" +"cents = " + cents;
					while (cents  >= 50) {
						cents -= 50;
						counter++;
					}
				if(counter > 0){
					s = s+"\n" + counter + " (50 cent)";
					counter = 0;
				}
					while (cents >= 20) {
						cents -= 20;
						counter++;
					}
				if(counter > 0){
					s = s+"\n" + counter +" (20 cents)";
					counter = 0;
				}
					while (cents >= 10) {
						cents -= 10;
						counter++;
					}
				if(counter > 0){
					s = s+"\n" + counter + " (10 cents)";
					counter = 0;
				}
					while (cents >= 5) {
						cents -= 5;
						counter++;
					}
				if(counter > 0){
					s = s+"\n" + counter +" (5 cents)";
					counter = 0;
				}
					while (cents >= 1) {
						cents -= 1;
						counter++;
					}
				if(counter > 0){
					s = s+"\n" + counter + " (1 cent)";
					counter = 0;
				}
				System.out.println(s);
					}

			}


	}



	public static void main (String args []) {

		Coiner c = new Coiner();
		c.coinCutter(c.amount());

	}
}



