package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
//		ABAIXO, ALGUNS FORMATOS PARA COLOCAR A DATA ATUAL: 
		
		SimpleDateFormat x = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat y = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat z = new SimpleDateFormat("HH:mm:ss");
//		ABAIXO, USAMOS A CLASSE Date PARA COLOCAR O TEMPO DE AGORA:
		
		Date agora = new Date();
		
		System.out.println(agora);
		
		System.out.println(x.format(agora));
		
		System.out.println(y.format(agora));
		
		System.out.println(z.format(agora));
	
//		ABAIXO, UMA DETERMINADA DATA, RETORNA EM MILISSEGUNDOS:
		System.out.println(Date.UTC(2021, 8, 10, 21, 31, 0));
		
//		ABAIXO,A DATA DE HOJE:
		System.out.println(agora.getYear()+1900 + ", " +((int) (int) agora.getMonth() + (int) 1) + ", " + (int) agora.getDate());
//		ABAIXO, DUAS VARIAVEIS, A DATA DE HOJE EM MILISSEG. E A UMA QUALQUER, EM MILISSEG.
		long agora_milis = (Date.UTC(agora.getYear()+1900, ((int) (int) agora.getMonth() + (int) 1), (int) agora.getDate(), 0, 0, 0));
		
		long futuro_milis = (Date.UTC(2021, 12, 25, 0, 0, 0));
		
		System.out.println((futuro_milis - agora_milis) / (1000 * 60 * 60 * 24)); 
//		ACIMA PARA CALCULAR OS DIAS CORRIDOS ENTRE HOJE E UMA DATA FUTURA QUALQUER
//		NO EXEMPLO ACIMA, RETORNOU OS DIAS CORRIDOS ENTRE A DATA DE HOJE E O FERIADO DE NATAL
	}

}
