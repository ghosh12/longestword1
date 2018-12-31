package Longestword_length;

/**
 * Created by dipak on 12/31/2018.
 */
public class NumberWord {
    public static void main(String[] args) {
        Int_String string= getLongestWordAndLength("The cow jumped over the moon");
        System.out.println("word="+string.getWord());
        System.out.println("count"+string.getCount());


    }

    public static Int_String getLongestWordAndLength(String sentents){
        int count = -1;
        String word = "";
        Int_String string = new Int_String();
        String [] words= sentents.split(" ");
        for (String word1 : words){
            if(word1.length()> count){
                count= word1.length();
                word=word1;
            }
        }
        string.setWord(word);
        string.setCount(count);
        return string;


    }
}
