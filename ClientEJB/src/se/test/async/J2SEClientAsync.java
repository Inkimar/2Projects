/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.test.async;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import se.test.async.AsyncRemote;

/**
 * Lägg jarar i den ordningen:
 *  1) appserv-rt
 *  2) gf-client
 *  3) Java EE 6 API Library
 * @author ingimar
 */
public class J2SEClientAsync {

    public static void main(String[] args) {
        System.out.println("Hej världen, hur mår du idag! ");
        try {
            Properties jndiProps = new Properties();
            jndiProps.put("java.naming.factory.initial", "com.sun.enterprise.naming.impl.SerialInitContextFactory");
            jndiProps.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            jndiProps.put("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            jndiProps.setProperty("org.omg.CORBA.ORBInitialHost", "192.168.10.163"); // 192.168.10.163 , 127.0.0.1
            Context ctx = new InitialContext(jndiProps);
            @SuppressWarnings("unused")
            AsyncRemote bean = (AsyncRemote) ctx.lookup("java:global/Async/AsyncBean");
            System.out.println("Response coming from bean :"+bean.businessMethod());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
