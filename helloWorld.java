public class helloWorld
{
    public static void main(String[] args)
    {
        System.out.println(palindrome("Bob bob"));
    
    }

    public static boolean palindrome(String s)
    {
        for(int i = 0; i < s.length()/2; i++)
        {
            if (Character.isSpaceChar(s.charAt(i)))
            {
                i++;
            }
            if (s.toLowerCase().charAt(i) != s.toLowerCase().charAt(s.length() - 1 - i))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean anagram(String s1, String s2)
    {
        for(int i = 0; i < s1.length(); i++)
        {
            if(s2.indexOf(s1.charAt(i)) == -1)
            {
                return false;
            }
        }

        return true;
    }
}
