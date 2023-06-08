import java.util.*;
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i,j,p=0,k;
        int n[]=new int[nums1.length];
        for(i=0;i<nums1.length;i++)
        {
            for(j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    k=j+1;
                    while(k<=(nums2.length-1))
                    {
                        if(nums2[k]>nums2[j])
                        {
                            nums1[i]=nums2[k];
                            break;

                        }
                        else
                        {
                            k++;
                        }
                        
                    }
                    if(k>(nums2.length-1))
                    {
                        nums1[i]=-1;
                    }
                    break;
                    
                }
            }
        }
        return nums1;

        
    }
    public static void main(String args[])
    {
        int n1,n2;
        
        Scanner in=new Scanner(System.in);
        n1=in.nextInt();
        n2=in.nextInt();
        int num1[]=new int[n1];
        int num2[]=new int[n2];
        int i;
        for(i=0;i<n1;i++)
        {
            num1[i]=in.nextInt();
        }
        for(i=0;i<n2;i++)
        {
            num2[i]=in.nextInt();
        }
        
        
        Solution ob=new Solution();
        int n[]=ob.nextGreaterElement(num1,num2);
        System.out.println(Arrays.toString(n));
        
        
        
    }
}