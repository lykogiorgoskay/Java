
/*
	Name: lykogeorgos Konstantinos
	Student Number:p3220260
*/


class App4 {

	public static int recursive_function(int num) {
		if (num == 0) {
			return 0;
		} else {
			return num % 10 + recursive_function(num / 10);
		}
	}

	public static void main (String args[]){

		System.out.println(recursive_function(1234));
	}
}