package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat y = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat z = new SimpleDateFormat("HH:mm:ss");
		
		Date agora = new Date();
		
		Date futuro = new Date(2021, 12, 25);
		
		System.out.println(agora);
		
		System.out.println(x.format(agora));
		
		System.out.println(y.format(agora));
		
		System.out.println(z.format(agora));

	}

}
