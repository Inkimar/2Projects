/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zanz;

import javax.ejb.Remote;

/**
 *
 * @author ingimar
 */
@Remote
public interface AsyncRemote {

    String businessMethod();
    
}
