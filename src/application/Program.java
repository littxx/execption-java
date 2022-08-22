package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat fmd = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Room number");
		int number = sc.nextInt();
		
		System.out.print("Checkin date (dd/mm/yyyy): ");
		Date checkIn = fmd.parse(sc.next());
		System.out.print("CheckOut date (dd/mm/yyyy): ");
		Date checkOut = fmd.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("error in reservation");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("reservation: " + reservation);
		}
		
		
		sc.close();
	}

}
