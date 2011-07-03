public abstract class Price {
    abstract int getPriceCode();

    public double getCharge(int daysRented) {
        double rentalAmount = 0;
        switch (getPriceCode()) {
        case Movie.REGULAR:
            rentalAmount += 2;
            if (daysRented > 2)
                rentalAmount += (daysRented - 2) * 1.5;
            break;
        case Movie.NEW_RELEASE:
            rentalAmount += daysRented * 3;
            break;
        case Movie.CHILDRENS:
            rentalAmount += 1.5;
            if (daysRented > 3)
                rentalAmount += (daysRented - 3) * 1.5;
            break;
        }
        return rentalAmount;
    }
}
