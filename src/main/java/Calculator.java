public class Calculator {
    public  int square(int a)
    {
        return a *a;
    }
    //count number of A occurs
    public int countA(String word)
    {
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i)=='a' ||word.charAt(i)=='A')//checking if that character is an A
            {
                count++; //increment count
            }
        }
        return count;
    }
}
