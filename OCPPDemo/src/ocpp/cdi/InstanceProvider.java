package ocpp.cdi;

import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.enterprise.inject.Produces;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

/**
 * Instance provider class used for CDI injection instead of <code>XX.newInstance()</code> calls.
 *  
 * @author pr
 */
public class InstanceProvider {

    /**
     * Returns new XML data type factory instances
     * 
     * @return a new XML data type factory
     */
    @Produces
    public static DatatypeFactory newDatatypeFactory() {
        try {
            return DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns a calendar instance for GMT time zone.
     * 
     * @return gregorian calendar instance for GMT time zone
     */
    @Produces
    public static GregorianCalendar newGregorianCalendar() {
        return (GregorianCalendar)GregorianCalendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
