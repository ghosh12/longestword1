import Longestword_length.Int_String;
import Longestword_length.NumberWord;
import org.junit.Test;
import org.testng.Assert;

/**
 * Created by dipak on 12/31/2018.
 */
public class NumberWordTest {
    @Test
    public void firstTest(){
        String sentence = "The cow jumped over the moon";
        String longestWord = "jumped";
         Int_String string = NumberWord.getLongestWordAndLength(sentence);
        Assert.assertEquals(
                string.getWord(), longestWord);
        Assert.assertEquals(
                string.getCount(), longestWord.length());
    }

    @Test
    public void secondTest(){
        String sentence = "the the the the";
        String longestWord = "the";
        Int_String string = NumberWord.getLongestWordAndLength(sentence);
        Assert.assertEquals(
                //NumberWord.getLongestWordAndLength(sentence).getWord(), longestWord);
                string.getWord(), longestWord);
        Assert.assertEquals(
                //NumberWord.getLongestWordAndLength(sentence).getCount(), longestWord.length());
                string.getCount(), longestWord.length());
    }

    @Test
    public void thirdTest(){
        String sentence = "The";
        String longestWord = "The";
        Int_String string = NumberWord.getLongestWordAndLength(sentence);
        Assert.assertEquals(
                string.getWord(), longestWord);
        Assert.assertEquals(
               string.getCount (), longestWord.length());
    }

    @Test
    public void fourthTest(){
        String sentence = "";
        String longestWord = "";
        Int_String string = NumberWord.getLongestWordAndLength(sentence);
        Assert.assertEquals(
                string.getWord(), longestWord);
        Assert.assertEquals(
                string.getCount(), longestWord.length());
    }
}

