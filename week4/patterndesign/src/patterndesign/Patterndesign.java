/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterndesign;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Patterndesign {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter stafftype");
        String type=input.nextLine();
        StaffFactory sf=new StaffFactory();
        Staff s1=sf.getStaff(type);
       s1.getsalary(5000);
       s1.getyearofwork(10);
       
    }
    
}
