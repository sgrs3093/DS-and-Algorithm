package pepcoding_level1.basic_programming.getting_started;

/**
 * this program is use for printing Z format
 */
public class PrintZ
{

    byte b = 127;

    public char ch = 97;

    public static void main (String[] args)
    {
        PrintZ printZ = new PrintZ();

        printZ.printZ();

    }

    /**
     * This method will print the Z
     */

    void printZ ()
    {
        System.out.println("*****");//1st line
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*****");//last line

    }

    void m1 ()
    {

    }

    int m2 ()
    {

        return 1212;
    }

}
