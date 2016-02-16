package console_chat.main;

import java.util.Scanner;

import console_chat.server.Server;
import console_chat.client.Client;


public class Main {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Run this program as a server or client? (S(erver) / C(lient))");
		while (true) {
			char answer = Character.toLowerCase(in.nextLine().charAt(0));
			if (answer == 's') {
				new Server();
				break;
			} else if (answer == 'c') {
				new Client();
				break;
			} else {
				System.out.println("Invalid input. Repeat.");
			}
		}
	}

}
