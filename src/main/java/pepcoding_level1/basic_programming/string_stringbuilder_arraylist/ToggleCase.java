package pepcoding_level1.basic_programming.string_stringbuilder_arraylist;

/**
 * I/P : SaGaR
 * O/P : sAgAr
 */
public class ToggleCase
{
    public static void main (String[] args)
    {
        StringBuilder output = convertCharacter("SaGaR");
        System.out.println(output);

    }

    /**
     *
     * ASCII value of uppercase alphabets – 65 to 90. ASCII value of lowercase alphabets – 97 to 122.
     *
     * @param word
     * @return
     */
    static StringBuilder convertCharacter (String word)
    {
        StringBuilder sb = new StringBuilder(word);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            //if character is small then we need to convert to caps
            if (ch >= 'a' && ch <= 'z') {
                //65 + 98(b) - 97 =  65+1 = 66 ==> B
                //so here small 'b' converted to Caps 'B'
                char upperCase = (char)('A' + ch - 'a');
                sb.setCharAt(i,
                             upperCase);
            }
            //if  character is in caps then we need to convert to Small
            else if (ch >= 'A' && ch <= 'Z') {
                char upperCase = (char)('a' + ch - 'A');
                sb.setCharAt(i,
                             upperCase);
            }
        }
        return sb;
    }
}
