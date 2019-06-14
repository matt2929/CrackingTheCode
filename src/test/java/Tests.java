import Problems.Arrays;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    Arrays arrays =  new Arrays();
    @Test
    public void shouldBeTrue() {

        assertEquals(0, 0);
    }

    @Test
    public void tacoCatTrue(){
        assertEquals(true, arrays.OneAway("pale","ple"));
    }

    @Test
    public void oneEditGoodRemove(){
        assertEquals(true, arrays.OneAway("pales","pale"));
    }


    @Test
    public void oneEditGoodAdd(){
        assertEquals(true, arrays.OneAway("pale","bale"));
    }


    @Test
    public void oneEditGoodSwitch(){
        assertEquals(false, arrays.OneAway("pale","bake"));
    }


    @Test
    public void oneEditBadSameSize(){
        assertEquals(true, arrays.PalindromePermutation("Tact Coa"));
    }

    @Test
    public void compressionGood(){
        assertEquals("a2b1c5a3", arrays.StringCompression("aabcccccaaa"));
    }


    @Test
    public void compressionEmpty(){
        assertEquals("", arrays.StringCompression(""));
    }

    @Test
    public void compressionOneChar(){
        assertEquals("a", arrays.StringCompression("a"));
    }

    @Test
    public void compressionWeirdChar(){
        assertEquals("˚3", arrays.StringCompression("˚˚˚"));
    }

    @Test
    public void compressionBigGood(){
        assertEquals("a20b1", arrays.StringCompression("aaaaaaaaaaaaaaaaaaaab"));
    }

    @Test
    public void compressionBad(){
        assertEquals("abcdefg", arrays.StringCompression("abcdefg"));
    }


}
