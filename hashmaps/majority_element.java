import java.util.*;
public class majority_element {

    static int findMajorityElement(int [] num)
    {
        int l=num.length/2;
        int ele=-1;
        HashMap<Integer, Integer> m=new HashMap<Integer,Integer>();
        for(int i:num){
            if(m.containsKey(i))
             m.put(i,m.get(i)+1);
            else
             m.put(i,1);
        }
        Set<Map.Entry<Integer,Integer>> s=m.entrySet();
        for(Map.Entry<Integer,Integer> j: s)
        {
            if(j.getValue()>l)
            {
                ele=j.getValue();
                break;
            }
             
        }
        return ele;
    }

    public static void main()
{
    int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
    int result = findMajorityElement(nums);
    if(result !=-1)
     System.out.println("The majority number is= "+ result);
    else
     System.out.println("No majority number found");
    

}

}

    


