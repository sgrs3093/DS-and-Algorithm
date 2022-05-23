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

    static StringBuilder convertCharacter (String word)
    {
        StringBuilder sb = new StringBuilder(word);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            //if character is small then we need to convert to caps
            if (ch >= 'a' && ch <= 'z') {
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
