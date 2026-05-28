/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author naled
 */
public class ARRAY {

    /**
     * @param args the command line arguments
     */
    static String name[] = new String[10];
    static  int age[] = new int[10];
    static String IdNum[] = new String[10];
    
    public static void studentnames(){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter 10 student names ");
        for(int i =0; i<name.length;i++){
         name[i] = S.nextLine();
        }
    }
        public static void studentage(){
        Scanner S= new Scanner(System.in);
            System.out.println("Enter 10 student ages");
        for( int k= 0; k<age.length; k++){
            age[k] = S.nextInt();
        }
        }
        public static void studentIdNum(){
         Scanner S =new Scanner(System.in);
            System.out.println("Enter 10 student ID numbers");
         for( int z=0; z<IdNum.length; z++)
         IdNum[z] = S.nextLine();
    } 
    public static void main(String[] args) {
        // TODO code application logic here
        studentnames();
        studentIdNum();
        studentage();
        
    }
    
}
