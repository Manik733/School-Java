public class arrayNames {
    public static void main(String[] args) {

        String[] names = new String[] { "Bob", "Alice", "Zait", "Sar", "Kimberly" };
        for (int i = 0; i < names.length; i++) // loop through all names in array
        {
            System.out.println(names[i]); // display name @ i
        }

        for (int i = names.length - 1; i >= 0; i--) // loop thru all names in array, in reverse
        {
            System.out.printf("%s ", names[i].toUpperCase()); // display name @ i, uppercase
        }

        for (int i = names.length - 1; i >= 0; i--) // loop thru all names in array, in reverse
        {
            System.out.println(reverse(names[i]) + " "); // each name in reverse
        }
    }

    public static String reverse(String str) {
        String ret = "";
        for (int i = 0; i < str.length(); i++)
            ret = str.charAt(i) + ret;

        return ret;
    }
}
