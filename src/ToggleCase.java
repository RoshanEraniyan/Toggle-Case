import java.util.*;

class Solution
{
    public void toggle(String word)
    {
        String result="";
        for (int i=0;i<word.length();i++)
        {
            int a=word.charAt(i);
            if(a>64&&a<91)
            {
                int ascii=a+32;
                char temp=(char)ascii;
                result+=temp;
            }
            else
            {
                int ascii=a-32;
                char temp=(char)ascii;
                result+=temp;
            }
        }
        System.out.println(result);
    }

}

class ToggleCase
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        Solution solution =new Solution();
        solution.toggle(s);
    }
}