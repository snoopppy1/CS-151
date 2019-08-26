
import java.util.*;

public class Encoding 
{
   
   public static Set<String> morseCodes(int m, int n) 
   {
      Set<String> result = new TreeSet<>();
      String dot = ".";
      String dash = "-";
      
      if(m == 0 && n == 0)
      {
         result.add("");
      }
      else if (n == 0)
      {
         String temp ="";
         for(int i = 0 ; i < m ; i++)
         {
            temp += dot;
         }
         result.add(temp);
      }
      else if (m == 0 )
      {
         String temp2 = "";
         for(int i = 0; i < n ; i ++)
         {
            temp2 += dash;
         }
         result.add(temp2);
      }
      else
      {
         Set<String> situation1 = morseCodes(m-1, n);
         Set<String> situation2 = morseCodes(m, n-1);

         for(String s : situation1)
         {
            result.add(s+dot);
         }
         for(String s : situation2)
         {
            result.add(s+dash);
         }  
      }
      return result;
   }
}

