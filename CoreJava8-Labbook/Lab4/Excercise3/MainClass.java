package excercise3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Books b = new Books(1234, "Laugable Loves", 3, "Milan Kundera");
	    b.addItems();
	    b.print();
	    System.out.println("After checkout, number of copies left: ");
	    b.checkOut();
	    b.print();
	    System.out.println("After adding one element, number of copies left: ");
	    b.addItems();
	    b.print();

	    System.out.println();

	    Video v = new Video(4567, "Harlem Shake", 7, 126, "Pink Guy", "Comedy", 2012);
	    v.addItems();
	    v.print();
	    System.out.println("After checking in, number of copies left: ");
	    v.checkIn();
	    v.print();

	    System.out.println();

	    CD c = new CD(1090, "Abbey Road", 5, 26, "The Beatles", "Rock");
	    c.addItems();
	    c.print();
	    System.out.println("After checking out, number of copies left: ");
	    c.checkOut();
	    c.print();

	}

}
