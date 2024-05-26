import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countingwords {

    public static void main(String[] args) {
        String str="Betty bought a bitter butter then she bought a better butter to make bitter butter better";
        String[] s=str.split(" ");
        HashMap<String,Integer> feq=new HashMap<String, Integer> ();
        for(String i: s)
        {
           if (feq.containsKey(i)) 
            feq.put(i,feq.get(i)+1);
           else
            feq.put(i, 1);
        }
        
        int value =0;
        Set<Map.Entry<String, Integer> > set=feq.entrySet();
        String k="";
        for(Map.Entry<String, Integer> m: set)
        {
            if(m.getValue() > value)
            {
                value=m.getValue();
                k=m.getKey();
            }
        }

        System.out.println(k);
    }

}
