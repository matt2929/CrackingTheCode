import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    Problems problems =  new Problems();
    @Test
    public void shouldBeTrue() {

        assertEquals(0, 0);
    }

    @Test
    public void tacoCatTrue(){
        assertEquals(true,problems.OneAway("pale","ple"));
    }

    @Test
    public void oneEditGoodRemove(){
        assertEquals(true,problems.OneAway("pales","pale"));
    }


    @Test
    public void oneEditGoodAdd(){
        assertEquals(true,problems.OneAway("pale","bale"));
    }


    @Test
    public void oneEditGoodSwitch(){
        assertEquals(false,problems.OneAway("pale","bake"));
    }


    @Test
    public void oneEditBadSameSize(){
        assertEquals(true,problems.PalindromePermutation("Tact Coa"));
    }

    @Test
    public void compressionGood(){
        assertEquals("a2b1c5a3",problems.StringCompression("aabcccccaaa"));
    }


    @Test
    public void compressionEmpty(){
        assertEquals("",problems.StringCompression(""));
    }

    @Test
    public void compressionOneChar(){
        assertEquals("a",problems.StringCompression("a"));
    }

    @Test
    public void compressionWeirdChar(){
        assertEquals("˚3",problems.StringCompression("˚˚˚"));
    }

    @Test
    public void compressionBigGood(){
        assertEquals("a20b1",problems.StringCompression("aaaaaaaaaaaaaaaaaaaab"));
    }

    @Test
    public void compressionBad(){
        assertEquals("abcdefg",problems.StringCompression("abcdefg"));
    }
}
