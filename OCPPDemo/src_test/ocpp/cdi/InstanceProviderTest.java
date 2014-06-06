package ocpp.cdi;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeFactory;

import org.junit.Test;

/**
 * Tests the {@link InstanceProvider}
 * 
 * @author Patrick Reinhart
 */
public class InstanceProviderTest {

    @Test
    public void testNewDatatypeFactory() {
        DatatypeFactory datatypeFactory = InstanceProvider.newDatatypeFactory();
		assertNotNull(datatypeFactory);
    }

    @Test
    public void testNewGregorianCalendar() {
        GregorianCalendar calendar = InstanceProvider.newGregorianCalendar();
		assertNotNull(calendar);
		assertEquals(TimeZone.getTimeZone("GMT"), calendar.getTimeZone());
    }

}
