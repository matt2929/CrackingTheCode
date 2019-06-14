import Problems.ArraysProblem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayTests {
    ArraysProblem arraysProblem = new ArraysProblem();

    @Test
    public void shouldBeTrue() {
        assertEquals(0, 0);
    }

    @Test
    public void tacoCatTrue() {
        assertEquals(true, arraysProblem.OneAway("pale", "ple"));
    }

    @Test
    public void oneEditGoodRemove() {
        assertEquals(true, arraysProblem.OneAway("pales", "pale"));
    }


    @Test
    public void oneEditGoodAdd() {
        assertEquals(true, arraysProblem.OneAway("pale", "bale"));
    }


    @Test
    public void oneEditGoodSwitch() {
        assertEquals(false, arraysProblem.OneAway("pale", "bake"));
    }


    @Test
    public void oneEditBadSameSize() {
        assertEquals(true, arraysProblem.PalindromePermutation("Tact Coa"));
    }

    @Test
    public void compressionGood() {
        assertEquals("a2b1c5a3", arraysProblem.StringCompression("aabcccccaaa"));
    }


    @Test
    public void compressionEmpty() {
        assertEquals("", arraysProblem.StringCompression(""));
    }

    @Test
    public void compressionOneChar() {
        assertEquals("a", arraysProblem.StringCompression("a"));
    }

    @Test
    public void compressionWeirdChar() {
        assertEquals("˚3", arraysProblem.StringCompression("˚˚˚"));
    }

    @Test
    public void compressionBigGood() {
        assertEquals("a20b1", arraysProblem.StringCompression("aaaaaaaaaaaaaaaaaaaab"));
    }

    @Test
    public void compressionBad() {
        assertEquals("abcdefg", arraysProblem.StringCompression("abcdefg"));
    }


}
