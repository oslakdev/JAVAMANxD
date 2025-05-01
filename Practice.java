import java.util.ArrayList; //
import java.util.Scanner; 

public class Main{ public static void main (String[] args)
				  { System.out.println(); System.out.println("TESTTTTTTTTTTTTTINGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
				   System.out.println();
				   ArrayList<String> names = new ArrayList<String>(); 
				   names.add("tes1"); names.add("tes2"); 
				   System.out.println(names.get(1)); // print value of index for(String i: names){ System.out.println(i); } String[] tae = {"tae", "etyas", "sabalay", "wawa", "lala"}; System.out.println(tae.length); System.out.println(tae[4]); /*for(int i=0; i<tae.length; i++){ System.out.println(i + ": " + tae[i]); }*///end for loop for( String i : tae ){ System.out.println( i); } String pangalan[] = new String[2]; pangalan[0] = "index 0"; pangalan[1] = "index 1"; System.out.println(pangalan[0] + pangalan[1]); for (int i=0; i<pangalan.length; i++){ System.out.println(i + ": " + pangalan[i]); }//end for loop }//end main }//end class main
