public class WordWrapper {

    private String word;

    public WordWrapper(String input)
    {
        word = input;
    }

    public String sandwich()
    {
        String upperCase = word.toUpperCase();
        String lowerCase = word.toLowerCase();

        return upperCase + lowerCase + upperCase;
    }

    public Boolean isPal()
    {
        for(int i = 0; i < word.length()/2; i++)
        {
            if(word.charAt(i) != word.charAt(word.length() - i - 1))
            {
                return false;
            }
        }

        return true;
    }

    public String toString()
    {
        return word + word.length();
    }

    public static void main(String[] args)
    {
        WordWrapper test = new WordWrapper(args[0]);

        System.out.println(test);
        System.out.println(test.sandwich());
        System.out.println(test.isPal());
        

    }
}
