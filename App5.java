/*
	Name: lykogeorgos Konstantinos
	Student Number:p3220260
*/
import java.util.Scanner;
public class App5 {

	static class  Calc {

		private int num1;
		private int num2;

		private int counter;

		public Calc() {
			this.counter = 1;
			this.num1 = input();
			this.num2 = input();
		}

		public void print() {
			System.out.println("Input:");
			System.out.println("1st = " + num1);
			System.out.println("2nd = : " + num2);
		}

		public void setNum1(int num1) {
			this.num1 = num1;
		}

		public void setNum2(int num2) {
			this.num2 = num2;
		}

		public void multiply() {
			String s = "";
			s = s +"product is  = "+ (num1 * num2);
			System.out.println(s);

		}

		public void sum() {
			String s = "";
			s = s +"sum = " +(num1 + num2);
			System.out.println(s);
		}
		int input() {
			System.out.print("Insert the "+counter++ + " number> ");
			Scanner sc = new Scanner(System.in);
			while (!sc.hasNextInt()) {
				counter = counter-1;
				System.out.print("\nerror: i take only numbers for input \nInsert the " +counter++ +  " number>");
				sc.nextLine();

			}
			int num = sc.nextInt();
			return num;
		}
	}


	public static void main(String args[]) {



		Calc c1 = new Calc();
		c1.print();
		c1.sum();
		c1 = new Calc();
		c1.print();
		c1.sum();
		c1.multiply();
			}

		}





