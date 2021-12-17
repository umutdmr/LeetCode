
//https://leetcode.com/problems/add-two-numbers/
package LeetCode;
import java.util.ArrayList;
class ListNode
{
    ArrayList<Integer> arr;
    public ListNode(String str)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        String[] resList = str.split("");
        for(int j = 1; j < resList.length - 1; j += 2)
        {
            int add = Integer.parseInt(resList[j]);
            arr.add(add);
        }
        this.arr = arr;
    }
    public ListNode(Integer num)
    {
        String[] str = num.toString().split("");
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = str.length - 1; i >= 0; i--)
        {
            res.add(Integer.parseInt(str[i]));
        }
        this.arr = res;
    }
    public int toInt()
    {
        String res = "";
        for(int i = arr.size() - 1; i >= 0; --i)
        {
            Integer intt = arr.get(i);   
            res = res + intt.toString();
            
            
        }
        if(res.length() == 0)
            return 0;
        return Integer.parseInt(res);
    }

    public String toString()
    {
        return arr.toString();
    }
}
public class AddTwoNumbers 
{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int n1 = l1.toInt();
        int n2 = l2.toInt();
        int resNum = n1 + n2;
        ListNode res = new ListNode(resNum);
        return res;
    }
    public static void main(String[] args) 
    {
        
        ListNode l = new ListNode(9999999);
        ListNode m = new ListNode(9999);
        System.out.println(addTwoNumbers(l, m));        
        
    }
}
