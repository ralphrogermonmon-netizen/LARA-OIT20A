/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

/**
 *
 * @author Admin
 */
public class multiDimentional {
    public static void main (String [] args){
        int marks [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for (int i = 0; i <marks.length; i++){
            for (int j =0; j <marks[i].length;j++){
                System.out.print (marks[i][j]+ " ");
            }
                System.out.println ();
            }
        }
    }

