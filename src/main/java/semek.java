
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class semek {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          
        int[] array = new int[10];
        int sum,min,max;
        array[0]=sc.nextInt();
        max=array[0];
        min=array[0];
        sum=array[0];
        
        for(int i=1;i<10;i++){
            array[i]=sc.nextInt();
            sum+=array[i];
            if(array[i]>max)
                max=array[i];
            if(array[i]<min)
                min=array[i];
        }
        System.out.println("sum= "+sum+"\n max= "+max+"\n min= "+min);
    }
}
