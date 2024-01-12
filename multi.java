

public class multi{
    public static void main(String[] args) {
        String repeat;
    repeat = multiConcat("Hello World ", 5); // repeat "Hello World " 5 times
    System.out.println (repeat);
System.out.println();

repeat = multiConcat ('o', 25); // repeat 'o' 25 times
System.out.println (repeat);

for (int i=1; i<=10; i++) // loop i from 1..10
{
 System.out.println ( multiConcat('+', i) ); // display '+' repeated i times
}
    }
    
    public static String multiConcat (String str, int n){
        String ret = "";
    for(int i = 1; i <= n ; i++){
      ret = ret + "\n" + str;
    }
    return(ret);
}

public static String multiConcat (char c, int n) {
    return ( multiConcat (""+c, n) );
}
}
