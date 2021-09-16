/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_work_2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Home_Work_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Введите значение температуры в градусах цельсия:");
        Scanner temp = new Scanner(System.in); //объявили Scanner temp
        double cels = temp.nextDouble(); //считали значение double cels
        double far = cels * 9 / 5 + 32; //высчитали значение double far
        
        System.out.println("Если температура в градусаз Цельсия равна: " + cels + ", то в градусах Фарингейта это будет: " + far );

        
    }
    
}

   