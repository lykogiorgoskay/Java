
/*
	Name: lykogeorgos Konstantinos
	Student Number:p3220260
*/

import java.io.*;

class App3 {

        public static void main(String args[]) throws IOException {

                System.out.print("Insert the text > ");

                int counter = 0;
                char [] letters = new char [2];

                while (true) {


                        int code = System.in.read();
                        if ((code >= 'a' && code <= 'z') || (code >= 'A' && code <= 'Z'))
                                counter++;
                        char input = (char) code;
                        letters[1] = input;
                        if ((letters[1] == '*') & (letters[0] == '\n'))
                                break;

                        letters[0] = letters[1];
                }
                System.out.println("The number of letters in your text is :" + counter);
        }
}
