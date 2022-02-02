

public class AssignmentString {

	public static void main(String[] args) {
	 //Assignments on String Class//
	/**........................... **/
	//(1)length of the String
    String str = "Hello World"; 
    System.out.println(str.length());
    //(2)join the two Strings
    String str1= "Hello";
    String str2= " How are you";
    System.out.println(str1.concat(str2));
    //(3)Answer
    String str3="Java String pool refers to collection of Strings which are stored in heap memory";
    //LowerCase
    System.out.println(str3.toLowerCase());
    //UpperCase
    System.out.println(str3.toUpperCase());
    //Replace a-$
    System.out.println(str3.replace('a', '$'));
    //Contain word "collection"
    String strM="Java String pool refers to collection of Strings which are stored in heap memory";
    System.out.println(str3.contentEquals(strM));
    //Check it is equal to String4...
    //str4="java string pool refers to collection of strings which are stored in heap memory"
    String str4="java string pool refers to collection of strings which are stored in heap memory";
    System.out.println(str3.equals(str4));
    // Another method of comparing..
    String compare= str3.toLowerCase(); 
    System.out.println(str3.equals(compare));
    
      //Assignments on StringBuffer Class//
    /***................................***/
    //1)Answer
    StringBuffer sb=new StringBuffer("StringBuffer");
    sb.append(" is a peer class of String");
    sb.append(" that provides much of");
    sb.append(" the functionality of strings");
    System.out.println(sb);
    //2)Answer
    StringBuffer  sb2= new StringBuffer("It is used to at the specified index position");
    sb2.insert(10," Insert text");
    System.out.println(sb2);
    //3) Reverse
    StringBuffer sb1 = new StringBuffer("This method returns the reversed object on which it was called");
	System.out.println(sb1.reverse());
	
	//Assignments on StringBuilder Class//
    /***................................***/
    //1)Answer
	 StringBuilder sb3=new StringBuilder("StringBuilder");
	    sb3.append(" is a peer class of String");
	    sb3.append(" that provides much of");
	    sb3.append(" the functionality of strings");
	    System.out.println(sb3);
	    //2)Answer
	    StringBuilder  sb4= new StringBuilder("It is used to at the specified index position");
	    sb4.insert(10," Insert text");
	    System.out.println(sb4);
	    //3) Reverse
	    StringBuilder sb5 = new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println(sb5.reverse());
	
    
	}

}
