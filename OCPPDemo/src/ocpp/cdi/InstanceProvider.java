package ocpp.cdi;

import java.util.GregorianCalendar;

import javax.enterprise.inject.Produces;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

/**
 * Instance provider class used for CDI injection instead of <code>XX.newInstance()</code> calls.
 *  
 * @author pr
 */
public class InstanceProvider {

    @Produces
    public static DatatypeFactory newDatatypeFactory() {
        try {
            return DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Produces
    public static GregorianCalendar newGregorianCalendar() {
        return (GregorianCalendar)GregorianCalendar.getInstance();
    }
}
