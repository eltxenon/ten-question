import java.util.*;
public class Q2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your word");
        String word1 = input.nextLine();
        String temp = "";
        for (int i = 0; i < word1.length(); i++) 
        {
            char ch = word1.charAt(i);
            if(temp.indexOf(ch) == -1) 
            {
                temp += ch;
            }
        }
        System.out.println(temp);
    }
}

