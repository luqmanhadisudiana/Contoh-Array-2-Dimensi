/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Windows 10
 */
public class ARRAY2DIMENSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int matrixA[][] = {{1,2},{3,4},{5,6}};
        int transpose[][]=new int[2][3];
        
        
        for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            transpose[i][j] = matrixA[j][i];
        }
        }
        System.out.println("Sebelum Transpose :");
        for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            System.out.print(matrixA[i][j]+" ");
        }
        System.out.println();
        }
        System.out.println();
        System.out.println();
        
        System.out.println("Sesudah Transpose:");  
        for(int i=0;i<2;i++){    
        for(int j=0;j<3;j++){    
        System.out.print(transpose[i][j]+" ");    
        }
        System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Soal Nomer 2");
        System.out.println();
        System.out.println();
        
        int[][] SoalKedua = new int[10][10];
        int x,y,z,q,p,data;
        x = 0;
        y = 0;
        z = 0;
        q = 0;
        p = 2;
        data = 0;
        for(int i = 0;i <= 10; i++){
        for(int j = 0;j <= 10; j++){
            if(i <= 0 && j <= 2){
            x = x + 5;
            SoalKedua[i][j] = x;
            System.out.print(SoalKedua[i][j]+" ");
            }
            }
        }
        System.out.println(" ");
        for(int i=0; i<=10; i++){
        for(int j=0; j<=10; j++){
            if(i <= 0 && j <= 3){
            y = y + 2;
            SoalKedua[i][j] = y;
            System.out.print(SoalKedua[i][j]+" ");
            }            
        }
        }
        System.out.println(" ");
        for(int i=0; i<=10; i++){
        for(int j=0; j<=10; j++){
            if(i <= 0 && j <= 4){
            z = z + 1;
            q = z * z;
            SoalKedua[i][j] = q;
            System.out.print(SoalKedua[i][j]+" ");
            }            
        }
        }
        System.out.println(" ");
        for(int i=0; i<=10; i++){
        for(int j=0; j<=10; j++){
            if(i <= 0 && j <= 5){
            p = p + 1;
            SoalKedua[i][j] = p;
            System.out.print(SoalKedua[i][j]+" ");
            }            
        }
        }
    }
}
