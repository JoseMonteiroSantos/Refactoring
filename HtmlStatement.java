import java.util.Enumeration;

public class HtmlStatement extends Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
        "</EM></H1><P>\n";
        result = "Rental Record for " + aCustomer.getName()+" ";
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for each rental
           result += each.getMovie().getTitle()+ ": " +
           String.valueOf(each.getCharge()) + "<BR>\n";
           //show figures for rental
           result += each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge())+ " ";
        }
        //add footer lines
        result += "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
        result += "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + " ";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
     }

} 