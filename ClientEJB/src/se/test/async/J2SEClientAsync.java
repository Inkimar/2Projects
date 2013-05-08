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

    /**
     * (1) Kan enbart köra med properties-fil på vissa ( därav kommenterat bort Properties här )
     * (2) Måste använda Properties på vissa ( går ej med properties-fil )
     * 
     * @param args 
     */
    public static void main(String[] args) {
        System.out.println("Start: Hej världen!");
        try {
//            Properties jndiProps = new Properties();
//            jndiProps.put("java.naming.factory.initial", "com.sun.enterprise.naming.impl.SerialInitContextFactory");
//            jndiProps.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
//            jndiProps.put("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            //jndiProps.setProperty("org.omg.CORBA.ORBInitialHost", "172.16.34.31"); // 172.16.34.31 , 192.168.10.163 , 127.0.0.1
            //Context ctx = new InitialContext(jndiProps);
            Context ctx = new InitialContext();
            @SuppressWarnings("unused")
            AsyncRemote bean = (AsyncRemote) ctx.lookup("java:global/Async/AsyncBean");
            System.out.println("Response coming from bean :"+bean.businessMethod());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("END: Hej världen!");
    }
}
