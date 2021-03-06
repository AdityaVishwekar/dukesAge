package firstcup.dukesage.resource;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 */
@Path("dukesAge")
public class DukesAgeResource {

    /** Creates a new instance of DukesAgeResource */
    public DukesAgeResource() {
    }

    /**
     * Retrieves representation of an instance of DukesAgeResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
                // Create a new Calendar for Duke's birthday
                Calendar dukesBirthday = new GregorianCalendar(1995, Calendar.MAY, 23);
                // cREATE A NEW Calendar FOR TODAY
                Calendar now = GregorianCalendar.getInstance();

                // Subtract today's year from Duke's birthyear, 1995
                int dukesAge = now.get(Calendar.YEAR) - dukesBirthday.get(Calendar.YEAR);
                dukesBirthday.add(Calendar.YEAR, dukesAge);

                // If today's date is before May 23, SUBTRACT a year from Duke's age
                if (now.before(dukesBirthday)) {
                    dukesAge--;
                }
                
                // Return a String representation of Duke's Age
                return "" + dukesAge;
    }
}

