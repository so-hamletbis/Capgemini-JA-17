package excercise3;

public class Journal extends WrittenItem{
	private int publicationYear;
    Journal(int id, String title, int nC, String author, int publicationYear) {
    	super(id, title, nC, author);
        this.publicationYear = publicationYear;
    }

    //   To String methods
    public String toString() { 
    	return super.toString() + publicationYear; 
    }

    //   Getters
    public int getYear() { 
    	return publicationYear; 
    }
    public int getIdentificationYear() { 
    	return super.getIdentificationNumber(); 
    }

}
