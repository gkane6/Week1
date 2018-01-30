package com.guethiekane.week_2;

public class Main {
    public static void main(String[] args)
    {
        int j=0;
        String[] snowDay=new String[7];
        String[] days={"Monday","Tuesday","Wenesday","Thursday","Friday","Saturday","Sunday"};
        int[] temperature={45,29,10,22,41,28,33};
        double[] precipitation={95,60,25,5,0,75,90};
        for(int i=0;i<7;i++)
        {
            if(temperature[i]<=33 && precipitation[i]>=50)
            {
                snowDay[j]=days[i];
                j++;
            }
        }

        System.out.println("   ***Snowy Day!***");
        for(int i=0;i<7;i++)
        {
            if(snowDay[i]!=null)
            { System.out.println(snowDay[i]);}
        }
    }
}
