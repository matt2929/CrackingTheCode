import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    Problems1 problems1 =  new Problems1();
    @Test
    public void shouldBeTrue() {

        assertEquals(0, 0);
    }

    @Test
    public void tacoCatTrue(){
        assertEquals(true, problems1.OneAway("pale","ple"));
    }

    @Test
    public void oneEditGoodRemove(){
        assertEquals(true, problems1.OneAway("pales","pale"));
    }


    @Test
    public void oneEditGoodAdd(){
        assertEquals(true, problems1.OneAway("pale","bale"));
    }


    @Test
    public void oneEditGoodSwitch(){
        assertEquals(false, problems1.OneAway("pale","bake"));
    }


    @Test
    public void oneEditBadSameSize(){
        assertEquals(true, problems1.PalindromePermutation("Tact Coa"));
    }

    @Test
    public void compressionGood(){
        assertEquals("a2b1c5a3", problems1.StringCompression("aabcccccaaa"));
    }


    @Test
    public void compressionEmpty(){
        assertEquals("", problems1.StringCompression(""));
    }

    @Test
    public void compressionOneChar(){
        assertEquals("a", problems1.StringCompression("a"));
    }

    @Test
    public void compressionWeirdChar(){
        assertEquals("˚3", problems1.StringCompression("˚˚˚"));
    }

    @Test
    public void compressionBigGood(){
        assertEquals("a20b1", problems1.StringCompression("aaaaaaaaaaaaaaaaaaaab"));
    }

    @Test
    public void compressionBad(){
        assertEquals("abcdefg", problems1.StringCompression("abcdefg"));
    }


}
