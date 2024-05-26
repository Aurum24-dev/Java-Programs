
public class max_consec_one
{
    public static void main(String[] args) {
        int [] arr=new int[]{1,1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int l=0,r=0,zc=0,max=0,len;
        while(r<arr.length)
        {
            if(arr[r]==0)
            zc++ ;
            if(zc>k)
            {
                if(arr[l]==0)
                zc --;
                l++ ;

            }
            if(zc<=k)
            {
                len=r-l+1;
                max=Math.max(max, len);
                
            }
            r++;
        }
        System.out.println("Maximum length of subarray of cosecutive 1's obtained by filping "+k+ "zeroes atmost is "+max);
    }
}