import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String[] kandid={"A","B","C","D","E","HICHI"};
        int[] emtiaz={0,0,0,0,0,0};
        System.out.println("A B C D E");

        for(int i=0;i<2;i++){

            System.out.println(i+1+" : RAYE SHOMA:");
            String r=scan.nextLine();
            String[] R=r.split(" ");

            for(int j=0;j<5;j++){

                String result=R[j];

                switch(result){
                    case "A":emtiaz[0]+=5-j;break;
                    case "B":emtiaz[1]+=5-j;break;
                    case "C":emtiaz[2]+=5-j;break;
                    case "D":emtiaz[3]+=5-j;break;
                    case "E":emtiaz[4]+=5-j;break;
                    case " ":emtiaz[5]+=1;break;
                    default:emtiaz[5]+=1;break;
                }
            }
        }
        for(int i=0;i<6;i++){
            System.out.println(kandid[i]+" = "+ emtiaz[i]);
        }
        scan.close();
    }
}
