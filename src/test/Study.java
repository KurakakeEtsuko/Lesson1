package test;

public class Study {
    
    public static void main (String[] args) {
        
        String word[] = { "HelloWorld", "GoodMorning", "GoodNight" };
        
        for (int i = 0; i < word.length; i++) {
            if (word[i] == "HelloWorld") {
                System.out.println (word[i]);
            }
        }
    }
    
}