public class Assign3Quest1{
   public static void main(String[] args){
      String s1 ="173167176531317";
      String s2 = "I am not happy";
      String s3 = "I am not happy and not glad";
      String s4 = "neither this nor that works!";
      
      String sub1 = "17";
      String sub2 = "not ";
      String sub3 = "neither this nor ";
      String tempString1 = "";
      String tempString2 = "";
      String tempString3 = "";
      String tempString4 = "";      
      
      tempString1 = s1.replaceAll(sub1, "" );
      tempString2 = s2.replaceAll(sub2, "");
      tempString3 = s3.replaceAll(sub2, "");
      tempString4 = s4.replaceAll(sub3, "");
      System.out.println("The string 173167176531317 without 17 is: " + tempString1);   
      System.out.println("The string I am not happy without not is: " + tempString2);
      System.out.println("TThe string I am not happy and not glad without not is: " + tempString3);
      System.out.println("The string neither this nor that works! without neither this nor is: " + tempString4);
   
   }
   
}