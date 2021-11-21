/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;

/**
 *
 * @author DELL
 */
public class Teachingassistants extends abstractfactory {
     public Staff gettype(String Stafftype)
    {
        if(Stafftype.equalsIgnoreCase("CS"))
        {
            return new CS();
        }
        else if(Stafftype.equalsIgnoreCase("IT"))
        {
            return new IT();
        }
        else if (Stafftype.equalsIgnoreCase("IS"))
        {
            return new IS();
        }
        return null;
    }
    public void getsalary(int salary)
    {
        System.out.println("the salary is:"+salary);
        
    }
    public void getyearofwork(int yearofwork)
    {
        System.out.println("yearofwork is:"+yearofwork);
    }
    
}
