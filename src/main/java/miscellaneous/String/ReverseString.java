package miscellaneous.String;

public class ReverseString
{
    public static void main (String[] args)
    {
        String s = "sagar";

        //1st way
        char[] ch = s.toCharArray();
        int si = 0;
        int li = ch.length - 1;
        while (si < li) {
            char temp = ch[si];
            ch[si] = ch[li];
            ch[li] = temp;
            si++;
            li--;
        }
        for (char c : ch) {
            System.out.println(c);
        }
        System.out.println();
        String name = String.valueOf(ch);
        System.out.println(name);

        //2nd way O(N) revering from last index to till 1st index
        String temp = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            temp = temp + c;
        }
        System.out.println(temp);

        //3rd way need to fix this
        char[] c = s.toCharArray();
        for (int i = c.length - 1, j = 0; i >= 0 && j < i; i--, j++) {
            char temp1 = ch[i];
            c[i] = ch[j];
            c[j] = temp1;
        }
        for (char p : c) {
            System.out.print(p);
        }
        System.out.println();

    }
}
