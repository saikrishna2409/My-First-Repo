package javaapp.date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateModels {

	private static LocalDate today;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date date =new Date(0);
//		LocalDate date=LocalDate.now();
//		System.out.println("today's date is :"+date);
//		int day=date.getDayOfMonth();
//		int month=date.getMonthValue();
//		int year=date.getYear();
//		
//		System.out.printf("Year : %d , Month : %d , Day : %d \t %n",year,month,day);
//
//		LocalDate birthday=LocalDate.of(1997, 9, 24);
//		
//		System.out.println("Your birthday is :"+birthday);
//		LocalDate today=LocalDate.now();
//		LocalDate birthday=LocalDate.of(1997, 9, 24);
//		
//		if(birthday.equals(today))
//		{
//			System.out.printf("Today %s and birthday %s are same dates %n",today,birthday);
//		}
//		else
//		{
//			System.out.println("Dates are not Equal");
//		}
//		LocalDate today=LocalDate.now();
//		LocalDate birthday=LocalDate.of(1997, 9, 24);
//		MonthDay birth=MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());
//		MonthDay current=MonthDay.from(today);
//		if(birth.equals(current))
//		{
//			System.out.printf("Today %s and birthday %s are same dates %n",today,birthday);
//		}
//		else
//		{
//			System.out.println("Dates are not Equal");
//		}
		//LocalTime current=LocalTime.now();
	
		//	System.out.println("Current time is :"+current);
//		LocalTime newTime=current.plusHours(2);
//		System.out.println("New  time is :"+newTime);
//		LocalDate today=LocalDate.now();
//		LocalDate next=today.plus(1, ChronoUnit.WEEKS);
//		System.out.println("Today's date is :"+today);
//		System.out.println("1 week Later date is :"+next);
		//LocalDate today=LocalDate.now();
//		LocalDate previous=today.minus(1, ChronoUnit.YEARS);
//		LocalDate next=today.plus(1, ChronoUnit.YEARS);
//		System.out.println("previous Years' date is :"+previous);
//		System.out.println("Today's date is :"+today);
//		System.out.println("1 Year Later date is :"+next);
//		Clock clock=Clock.systemUTC();
//		System.out.println("Clock :"+clock);
//		Clock defaultClock=Clock.systemDefaultZone();
//		System.out.println("Clock :"+defaultClock);
//		LocalDate tommorow=LocalDate.of(2016, 8, 20);
//		if(today.isBefore(tommorow))
//		{
//			System.out.println("TRUE");
//		}
//		if(today.isAfter(tommorow))
//		{
//			System.out.println("TRUE");
//		}

//		ZoneId zoneId=ZoneId.of("Asia/Calcutta");
//		
//		LocalDateTime localDateTime=LocalDateTime.now();
//		ZonedDateTime zonedDateTime=ZonedDateTime.of(localDateTime, zoneId);
//		System.out.println("Date and Time in delhi :"+zonedDateTime);
//		YearMonth today=YearMonth.now();
//		
//		System.out.printf("The current %s : %d \t %n",today,today.getMonthValue());
//		
//		YearMonth creditExpiry=YearMonth.of(2020, Month.OCTOBER);
//		System.out.println("Your Creadit Card Expiry is :"+creditExpiry);
//		LocalDate today=LocalDate.now();
//		
//		if(today.isLeapYear())
//		{
//			System.out.printf("The Year %s is a Leap Year %n",today);
//		}
//		else
//		{
//			System.out.printf("The Year %s is not a Leap year %n",today);
//		}
		
//			LocalDate myMarriage=LocalDate.of(2016, Month.FEBRUARY, 03);
//			
//			LocalDate today=LocalDate.now();
//			
//			Period months=Period.between(myMarriage, today);
//			System.out.println("Months between My Marriage and today :"+months.getMonths());
//LocalDateTime localDateTime=LocalDateTime.of(2016, Month.JANUARY, 10, 11, 30);
//		
//		ZoneOffset zoneOffset=ZoneOffset.of("+05:30");
//		OffsetDateTime offsetDateTime=OffsetDateTime.of(localDateTime, zoneOffset);
//		System.out.println("Local DateTime Zone :"+offsetDateTime);
//		Instant instant=Instant.now();
//		System.out.println("The Current timestamp is :"+instant);
//		String date="20160819";
//		LocalDate formatted=LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
//		System.out.printf("The format of %s is %s \t%n",date,formatted);
//		String birthday="Jan 14 1997";
//		try
//		{
//			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
//			LocalDate birth=LocalDate.parse(birthday, formatter);
//			System.out.printf("The Date %s is formatted in %s %n",birthday,birth);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}

		LocalDate arrival=LocalDate.now();
		try
		{
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
			String comming=arrival.format(formatter);
			System.out.printf("The Date %s is formatted in %s %n",arrival,comming);
		}
		catch (Exception e) {
			e.printStackTrace();
		}


	}

}
