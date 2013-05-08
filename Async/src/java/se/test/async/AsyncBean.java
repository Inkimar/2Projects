/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.test.async;

import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author ingimar
 */
@Stateless
public class AsyncBean implements AsyncRemote {

    @Override
    public String businessMethod() {
        Date date = new Date();
        return "EJB-bean says Hello. Servertime is "+date;
    }

}
