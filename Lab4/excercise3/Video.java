package excercise3;

public class Video extends MediaItem {
    private String director;
    private String genre;
    private int year;
    
    Video(int id, String title, int nC, int runtime, String director, String genre, int year) {
        super(id, title, nC, runtime);
        this.director = director;
        this.genre = genre;
        this.year = year;
    }

    //   Getters
    public String getDirector() { 
    	return director; 
    }
    public String getGenre() {
    	return genre; 
    }
    public int getYear() { 
    	return year; 
    }
    public int getIdentificationNumber() { 
    	return super.getIdentificationNumber(); 
    }
    public String getTitle() { 
    	return super.getTitle(); 
    }
    public int getNumberOfCopies() { 
    	return super.getNumberOfCopies(); 
    }

    //   Methods
    public void print() {
        System.out.println("Information about video:");
        super.print();
        System.out.println("Runtime is: " + super.getRunTime());
        System.out.println("Director is: " + director);
        System.out.println("Year is: " + year);
    }

    //   toString
    public String toString() { 
    	return super.toString() + director + genre + year; 
    }

}
