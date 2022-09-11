import java.util.Enumeration;

public class TemplateStatement {  

	public TemplateStatement() {

	
	}

	public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
		String result = "Rental Record for " + aCustomer.getName()+" ";
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();

		   //show figures for rental
           result += each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge())+ " ";
        }
        //add footer lines
		result += "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + " ";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
	}
}	