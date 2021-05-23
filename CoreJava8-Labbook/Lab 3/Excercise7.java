import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Excercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Enter the date in format(dd/mm/yyyy): ");
		String date = sc.nextLine();
		LocalDate setDate = LocalDate.parse(date, df);

		LocalDate now = LocalDate.now();

		Period diff = Period.between(setDate, now);
		System.out.println("The difference is " + diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days.");

		sc.close();

	}

}
