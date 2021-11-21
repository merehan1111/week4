/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterndesign;

/**
 *
 * @author DELL
 */
public class StaffFactory {
    public Staff getStaff(String StaffType)
    {
        if(StaffType==null)
        {
            return null;
        }
        if(StaffType=="TeachingAssigstant")
        {
            return new TeachingAssigstant();
        }
        else if(StaffType=="Doctor")
        {
            return new Doctor();
        }
        return null;
        
    }

    
    
}
