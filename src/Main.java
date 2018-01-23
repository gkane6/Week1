/*    Base on the example The variable average is declared as a floating point
*     if it was a integer we wont have a decimal point.
 */
import java.util.Scanner;
public class Main
{

    public static void main (String[] args)
    {
        String city;
        int zipCode;
        int[] tamperature=new int[5];
        float average;
        //int average;
        int sum=0;

        Scanner sc =new Scanner(System.in);

        System.out.println("Highs average tempertur calculation?");
        System.out.println();
        System.out.println("Enter a city?");
        city=sc.nextLine();
        System.out.println("Enter the zip code?");
        zipCode=sc.nextInt();
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter temperature "+(i+1)+"?");
            tamperature[i]=sc.nextInt();
            sum+=tamperature[i];
        }

        average=sum/5;

        System.out.println("City: "+city+" Zip Code "+zipCode+" Average Highs Temperatur "+average);






    }
}
