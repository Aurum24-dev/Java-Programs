import java.util.HashMap;

public class longest_nonrep_substring {

    public static void main(String[] args) {
        String s="cadbzabcd";
        HashMap <Character,Integer> h=new HashMap<Character, Integer> ();
        int l=0,r=0,max=0,len;
        while(r< s.length())
        {
            if(!h.containsKey(s.charAt(r)))
             h.put(s.charAt(r), r);
            else
            {
                if(h.get(s.charAt(r))>=l)
                 l=h.get(s.charAt(r))+1;

            }
            len=r-l+1;
            max=Math.max(max,len);
            r=r+1;
        }
        System.out.println("Length of longest substring without repeating characters= "+max);
    }
    
}
