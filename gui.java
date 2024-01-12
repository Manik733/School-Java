import java.awt.*;
import java.awt.event.*;
/* This program class is essentially a "canvas" on which graphics are drawn,
* and the canvas is added to a frame which is the main screen window.
*/
class GraphicsProgram extends Canvas
{
 // default constructor, that sets the basics of the canvas
 public GraphicsProgram()
 {
 setSize(200, 200);
 setBackground(Color.white);
 }

 // paint() method that controls the items "drawn" on the canvas
 public void paint(Graphics g)
 {
 g.setColor(Color.blue); // set current pen color to BLUE
 g.drawLine(30, 30, 80, 80); // draw a simple line
 g.drawRect(20, 150, 40, 100); // draw a non-filled rectangle

 g.setColor(Color.red); // set color to RED
 g.fillRect(65, 150, 40, 100); // draw filled rectangle

 g.setColor(Color.GREEN); // set color to GREEN
 g.fillOval(150, 20, 100, 100); // draw a filled oval of equal dimensions: a circle
 g.setColor(Color.black); // set color to BLACK
 g.setFont(new Font("Arial",Font.BOLD,25)); // set the drawing font to Arial Bold, 25 point
 g.drawString("Blah blah", 150, 190); // draw a phrase to the screen
 }

 // main() method that creates everything: creates canvas
 public static void main(String[] argS)
 {
 //GraphicsProgram class is now a type of canvas, so create an instance (object) of it
 GraphicsProgram GP = new GraphicsProgram(); // create canvas with default constructor

 Frame aFrame = new Frame(); // create a new frame (window) on the main screen

 // add listener that exits/stops the program when user closes the window
 aFrame.addWindowListener( new WindowAdapter() {
 @Override
 public void windowClosing(WindowEvent we)
 {
 System.out.println ("Bye bye");
System.exit(0);
 }
 }
 );

 aFrame.setSize(300, 300); // set the size of the frame

 aFrame.setTitle("My first java graphic!"); // give the frame a title

 aFrame.add(GP); // add the canvas with the images to the frame

 aFrame.setVisible(true); // finally, make the frame visible
 } // end of main()
}// end of class
