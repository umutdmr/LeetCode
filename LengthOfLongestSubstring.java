//https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/?currentPage=1&orderBy=hot&query=
package LeetCode;
import java.util.TreeSet;

public class LengthOfLongestSubstring 
{
    public static int lengthOfLongestSubstring(String s) 
    {
        if(s == "")
        {
            return 0;
        }
        String[] arr = s.split("");
        int res = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(res >= arr.length - i)
            {
                return res;
            }
            int resTmp = 0;
            TreeSet<String> strSet = new TreeSet<>();
            for(int j = i; j < arr.length; j++)
            {
                strSet.add(arr[j]);
                if(resTmp == strSet.size())
                {
                    break;
                }
                resTmp++;
                if(resTmp > res)
                {
                    res = resTmp;
                }
            }
        }


        return res;
    }

    public static void main(String[] args) 
    {
        System.out.println(lengthOfLongestSubstring("" ));
    }
    
}
