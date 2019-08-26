public class Strings
{
   public static String uniqueLetters(String str)
   {
      String result = "";
      for(int i = 0; i < str.length(); i++)
      {
         String letter = str.substring(i,i+1);
         String others = str.substring(0,i)+str.substring(i+1,str.length());
         if(!others.contains(letter))
         {
            result +=letter;
         }
      }
      return result;
   }
}