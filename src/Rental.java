//From book: 'Refactoring' by Martin Fowler
//This is the original code before refactoring begins

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Movie getMovie() {
		return _movie;
	}


    double getCharge() {
        double rentalAmount = 0;
        switch (getMovie().getPriceCode()) {
        case Movie.REGULAR:
            rentalAmount += 2;
            if (getDaysRented() > 2)
                rentalAmount += (getDaysRented() - 2) * 1.5;
            break;
        case Movie.NEW_RELEASE:
            rentalAmount += getDaysRented() * 3;
            break;
        case Movie.CHILDRENS:
            rentalAmount += 1.5;
            if (getDaysRented() > 3)
                rentalAmount += (getDaysRented() - 3) * 1.5;
            break;
        }
        return rentalAmount;
    }
}
