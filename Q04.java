import java.util.Random;

public class Q04 
{
    public static void main(String[] args) 
    {
        int shir = 0;  
        int khat = 0;  
        int kool = 1000;  
        
        Random random = new Random();

       
        for (int i = 0; i < kool; i++)
            {
            if (random.nextBoolean()) 
            { 
                shir++;
            } else {  
                khat++;
            }
        }

        double shirha = (shir / (double) kool) * 100;
        double khatha = (khat / (double) kool) * 100;


        System.out.println("teadad shir ha :" + shir);
        System.out.println("teadad khat ha : " + khat);
        System.out.println("darsad shir ha :" + shirha + "%");
        System.out.println("darsad khat ha:" + khatha + "%");
    }
}
