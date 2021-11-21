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
public class factoryproducer {
    public static abstractfactory gettype(boolean rounded)
    {
        if(rounded)
        {
            return new Doctor();
        }
        else
        {
            return new Teachingassistants();
        }
    }
    
}
