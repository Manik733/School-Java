public class petTester{

    public static void main(String[] args) {
        
    
Pet genericPet = new Pet(); // generic pet, default: "noname", 0 (unknown)
Pet snuffles = new Pet("snuffles",1); // "snuffles", 1 (dog)
Pet mittens = new Pet("mittens",2); // "mittens", 2 (cat)
Pet captkirk = new Pet("capt.kirk",3); // "capt.kirk", 3 (bird)
genericPet.setName("rover"); // set name (rover)
genericPet.setType(1); // set as dog (1)
genericPet.setType(5); // invalid, do not set
System.out.println ( mittens.getName() ); // gets & show name (mittens)
System.out.println ( captkirk.getType() ); // get & show pet type number (3)
System.out.println ( captkirk.getTypeStr() ); // get & show pet type word (bird)
System.out.println ( snuffles ); // show "My name is snuffles. I am a dog."
System.out.println ( mittens.equals(mittens) ); // of course, should be true
if ( genericPet.equals(snuffles) ) // if the dogs are equal, should be true
{
 System.out.println ("generic and snuffles are equal.");
}
else
{
 System.out.println ("generic and snuffles are not equal.");
}

}
}