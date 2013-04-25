/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zanz;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ingimar
 */
@Stateless
@EJB(name=" ", beanInterface=AsyncRemote .class)  
public class AsyncBean implements AsyncRemote {

    @Override
    public String businessMethod() {
        return "Hello, Hello";
    }

}
