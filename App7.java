/*
	Name: lykogeorgos Konstantinos
	Student Number:p3220260
*/

import java.util.Scanner;
public class App7 {
	public static class Product {
		private String pr_code;
		private String pr_manufacturer;
		private String pr_model;
		private float pr_price;
		private int pr_stock;
		public Product(String pr_code, String pr_manufacturer, String pr_model) { //1st dot
			this.pr_code = pr_code;
			this.pr_manufacturer = pr_manufacturer;
			this.pr_model = pr_model;
			this.pr_price = 0;
			this.pr_stock = 0;
		}

		public Product(String pr_code, String pr_manufacturer, String pr_model, float pr_price, int pr_in_stock) { //2nd dot
			this.pr_code = pr_code;
			this.pr_manufacturer = pr_manufacturer;
			this.pr_model = pr_model;
			this.pr_price = pr_price;
			this.pr_stock = pr_in_stock;
		}

		public void setPr_price(float pr_price) {
			this.pr_price = pr_price;
		} //3rd dot

		public void setPr_stock(int pr_in_stock) {
			this.pr_stock = pr_stock;
		} //3rd dot

		public float getPr_price() {
			return pr_price;
		} //4rth dot

		public int supply(int quantity) { //5th dot
			this.pr_stock += quantity;
			return this.pr_stock;
		}

		public int sell(int quantity) { //6th dot
			if (this.pr_stock >= quantity) {
				setPr_stock(this.pr_stock - quantity);
				return pr_stock;
			}
			return -1;
		}

		public String ToString() {  //7th dot
			return "Product\n" +
					"------------------------------\n"+
					"code: " + this.pr_code + "\n" +
					"factory: " + this.pr_manufacturer + "\n" +
					"model: " + this.pr_model + "\n" +
					"price: " + getPr_price() + "\n" +
					"stock: " + this.pr_stock + "\n" +
					"-------------------------------" ;
		}

	}


	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		Product pr1 = new Product("Prod_X", "A-W", "x-1");
		System.out.println(pr1.ToString());  //B 1st dot


		System.out.print("Insert the product price with code: " + pr1.pr_code + "> ");  //B 2nd dot
		while(!sc.hasNextInt()){
			System.out.print("\nOnly positive integers numbers please, inert again (number>0)> ");
			sc.nextLine();
		}
		int number1 = sc.nextInt();
		if(number1< 0)
			number1 *=-1;
		pr1.setPr_price(number1); //B 3rd dot

		System.out.print("Give me the number of the stock of the product " + pr1.pr_code + "> "); //  B 4rth dot
		while(!sc.hasNextInt()){
			System.out.print("\nOnly positive integers numbers please, inert again (number>0)> ");
			sc.nextLine();
		}
		int number2 = sc.nextInt();
		if(number1< 0)
			number1 *=-1;
		pr1.supply(number2); //B 5th dot
		System.out.println("price = "+pr1.getPr_price());
		System.out.println("stock = "+pr1.pr_stock);
		System.out.println(pr1.ToString()); //B 6th dot

		//B dot 7th make a sale
		System.out.print("Insert the multitude of products fos sale > "); // 1st dot
		while(!sc.hasNextInt()){
			System.out.print("\nOnly positive integers numbers please, inert again (number>0)> ");
			sc.nextLine();
		}
		int number3 = sc.nextInt();
		if(number3< 0)
			number3 *=-1;
		if (pr1.sell(number3)!=-1) //2nd dot
		{
			double money = number3 * pr1.getPr_price();
			System.out.println("sale = "+ number3);
			System.out.println("New stock = "+ (pr1.pr_stock-number3));
			System.out.println("Amount to pay = "+money); //3rd dot
		}
		else
			System.out.println("Not enough stock to complete sale");
		System.out.println(pr1.ToString());// 8th dot
		System.out.print("Insert multitude of products to add > "); // 9th-1st dot
		while(!sc.hasNextInt()){
			System.out.print("\nOnly positive integers numbers please, inert again (number>0)> ");
			sc.nextLine();
		}
		int number4 = sc.nextInt();
		if(number4< 0)
			number4 *=-1;
		pr1.supply(number4);
		System.out.println("supply = "+number4);
		System.out.println("New stock = "+pr1.pr_stock);
		Product pr2 = new Product("Px-224","PONY","p-23",4,100);
		System.out.println(pr2.ToString());
	}

}