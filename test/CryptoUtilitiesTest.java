import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * @author Rohan Patel
 *
 */
public class CryptoUtilitiesTest {

    /*
     * Tests of reduceToGCD
     */

    @Test
    public void testReduceToGCD_0_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals("0", n.toString());
        assertEquals("0", m.toString());
    }

    @Test
    public void testReduceToGCD_30_21() {
        NaturalNumber n = new NaturalNumber2(30);
        NaturalNumber m = new NaturalNumber2(21);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals("3", n.toString());
        assertEquals("0", m.toString());
    }

    @Test
    public void testReduceToGCD_12_13() {
        NaturalNumber n = new NaturalNumber2(12);
        NaturalNumber m = new NaturalNumber2(13);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals("1", n.toString());
        assertEquals("0", m.toString());
    }

    @Test
    public void testReduceToGCD_21_30() {
        NaturalNumber n = new NaturalNumber2(21);
        NaturalNumber m = new NaturalNumber2(30);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals("3", n.toString());
        assertEquals("0", m.toString());
    }

    /*
     * Tests of isEven
     */

    @Test
    public void testIsEven_0() {
        NaturalNumber n = new NaturalNumber2(0);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals("0", n.toString());
        assertTrue(result);
    }

    @Test
    public void testIsEven_1() {
        NaturalNumber n = new NaturalNumber2(1);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals("1", n.toString());
        assertTrue(!result);
    }

    @Test
    public void testIsEven_2() {
        NaturalNumber n = new NaturalNumber2(2);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals("2", n.toString());
        assertTrue(result);
    }

    @Test
    public void testIsEven_25() {
        NaturalNumber n = new NaturalNumber2(25);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals("25", n.toString());
        assertTrue(!result);
    }

    @Test
    public void testIsEven_26() {
        NaturalNumber n = new NaturalNumber2(26);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals("26", n.toString());
        assertTrue(result);
    }

    /*
     * Tests of powerMod
     */

    @Test
    public void testPowerMod_0_0_2() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber p = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals("1", n.toString());
        assertEquals("0", p.toString());
        assertEquals("2", m.toString());
    }

    @Test
    public void testPowerMod_17_18_19() {
        NaturalNumber n = new NaturalNumber2(17);
        NaturalNumber p = new NaturalNumber2(18);
        NaturalNumber m = new NaturalNumber2(19);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals("1", n.toString());
        assertEquals("18", p.toString());
        assertEquals("19", m.toString());
    }

    /*
     * Tests of isWitnessToCompositeness
     */
    @Test
    public void testIsWitnessToCompositeness_2_4() {
        NaturalNumber w = new NaturalNumber2(2);
        NaturalNumber n = new NaturalNumber2(4);
        boolean result = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals("2", w.toString());
        assertEquals("4", n.toString());
        assertTrue(result);
    }

    @Test
    public void testIsWitnessToCompositeness_2_19() {
        NaturalNumber w = new NaturalNumber2(2);
        NaturalNumber n = new NaturalNumber2(19);
        boolean result = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals("2", w.toString());
        assertEquals("19", n.toString());
        assertTrue(!result);
    }

    /*
     * Tests of isPrime2
     */
    @Test
    public void testIsPrime2_4() {
        NaturalNumber n = new NaturalNumber2(4);
        boolean result = CryptoUtilities.isPrime2(n);
        assertEquals("4", n.toString());
        assertTrue(!result);
    }

    @Test
    public void testIsPrime2_19() {
        NaturalNumber n = new NaturalNumber2(19);
        boolean result = CryptoUtilities.isPrime2(n);
        assertEquals("19", n.toString());
        assertTrue(result);
    }

    /*
     * Tests of generateNextLikelyPrime
     */
    @Test
    public void testGenerateNextLikelyPrime_4() {
        NaturalNumber n = new NaturalNumber2(4);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals("7", n.toString());
    }

    @Test
    public void testGenerateNextLikelyPrime_7() {
        NaturalNumber n = new NaturalNumber2(4);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals("7", n.toString());
    }
}
