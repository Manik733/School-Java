public class JavaWave
{
 public static void main (String[] args)
 throws Exception 
 {
 double c = 4 * Math.PI; 
 int freq = 100; 
 int y = 0; 
 double deg=0; 
 int amplitude=50; 
 int delay = 300; 

 while (true) 
 
 {
 for (int x=0; x<(freq/2); x++) 
 {
 deg = x * (c/freq); 
 y = (int) (amplitude * (1 + Math.sin(deg))); 
 System.out.print ( " ".repeat(y) ); 
 System.out.println ("Manik!"); 
Thread.sleep(delay); 
 }

 }

 }

}
    
