/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        String sentence = "" ; 

        for (int i = 0; i < s.length(); i++){

            char current = s.charAt(i);
            if ((current != ' ') && (sentence.indexOf(current) == -1)){
                sentence += current;
            }else if (current == ' '){
                sentence += current;
            }
        }

        return sentence;
    }
}