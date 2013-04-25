/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import javax.ejb.Remote;

@Remote
public interface CapitalBeanRemote {
    public String getCapital(String state);
}
