package ocpp.cdi;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests the {@link InstanceProvider}
 * 
 * @author Patrick Reinhart
 */
public class InstanceProviderTest {

    @Test
    public void testNewDatatypeFactory() {
        assertNotNull(InstanceProvider.newDatatypeFactory());
    }

    @Test
    public void testNewGregorianCalendar() {
        assertNotNull(InstanceProvider.newGregorianCalendar());
    }

}
