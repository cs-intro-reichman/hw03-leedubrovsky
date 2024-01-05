/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        String sentence = ""; //+ (char) + (str.charAt(0) + 32);
        int i = 0;

        while (i < s.length()){
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' ){ // maybe i can switch it too - instead of 48 i will write '0'
                sentence += s.charAt(i);
            }else if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ){
                sentence += (char) (s.charAt(i) + 32 );
            }else {
             sentence += (char) (s.charAt(i) );

            }
            i++;
        }

        return sentence;
    }
}
