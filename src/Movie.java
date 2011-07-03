// From book: 'Refactoring' by Martin Fowler
// This is the original code before refactoring begins

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;
	
	private String _title;
	private int _priceCode;
	
	public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}
	
	public int getPriceCode() {
		return _priceCode;
	}

	public void setPriceCode(int arg) {
		_priceCode = arg;
	}
	public String getTitle() {
		return _title;
	}


    double getCharge(int daysRented) {
        double rentalAmount = 0;
        switch (getPriceCode()) {
        case REGULAR:
            rentalAmount += 2;
            if (daysRented > 2)
                rentalAmount += (daysRented - 2) * 1.5;
            break;
        case NEW_RELEASE:
            rentalAmount += daysRented * 3;
            break;
        case CHILDRENS:
            rentalAmount += 1.5;
            if (daysRented > 3)
                rentalAmount += (daysRented - 3) * 1.5;
            break;
        }
        return rentalAmount;
    }
}
