package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje); //2021/11/05
		
		LocalDate natal2023 = LocalDate.of(2023, Month.DECEMBER, 25);
		
		int anos = natal2023.getYear() - hoje.getYear();
		
		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(4));
		System.out.println(hoje.minusDays(2));

		System.out.println(hoje.plusYears(1));
		System.out.println(hoje.plusMonths(4));
		System.out.println(hoje.plusDays(2));
		
		System.out.println(anos);//2 anos
		
		Period periodo = Period.between(hoje, natal2023);
		System.out.println(periodo.getYears()); //2 anos
		System.out.println(periodo.getMonths()); //20 meses
		System.out.println(periodo.getDays());//1 dia
		
		LocalDate natal2023Apos4Anos = natal2023.plusYears(4);
		System.out.println(natal2023Apos4Anos); //2027-12-25
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = natal2023Apos4Anos.format(formatador);
		System.out.println(valorFormatado);// 25/12/2027
		
		DateTimeFormatter formatadorHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorHoras)); //05/11/2021 08:48
		
		//agora.toLocalDate(); Mostra apenas a data
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo); //15:30
		
		
	}
}
