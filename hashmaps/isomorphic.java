import java.util.HashMap;

public class isomorphic {

    static boolean findIsomorphic(String s1, String s2)
    {
        boolean result=false;
        HashMap<Character,Character> map=new HashMap<Character, Character>();
        for(int i=0; i< s1.length(); i++)
        {
            if(!map.containsKey(s1.charAt(i)))
            {
                map.put(s1.charAt(i),s2.charAt(i));
            }
            else
            {
                if(s2.charAt(i)==map.get(s1.charAt(i)))
                 result=true;
                else
                 result= false;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s1="aac";
        String s2="xby" ;
        if(s1.length()==s2.length() && findIsomorphic(s1,s2))
          System.out.println("Is isomorphic");
        else
          System.out.println("not isomorphic");
    }

}
