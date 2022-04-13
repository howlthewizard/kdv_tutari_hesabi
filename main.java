
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alper
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float para = input.nextFloat();
        double kdvOrani = para>1000 ? 0.08:0.18;
        double kdvliTutar = para + (para*kdvOrani);
        
        System.out.println("Kdv siz fiyat:"+para);
        System.out.println("Kdvli fiyat:"+kdvliTutar);
        System.out.println("Kdv tutar,"+(para*kdvOrani));
        
    }
    
    
}
