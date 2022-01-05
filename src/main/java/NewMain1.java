import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author admin
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        String strRev = "";
        for(int i=0;i<str.length();i++){
            strRev+= str.charAt(str.length()-1-i);
        }
        System.out.println(strRev);
    }
}
