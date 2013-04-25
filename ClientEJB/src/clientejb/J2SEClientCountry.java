/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientejb;

import business.CapitalBeanRemote;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import zanz.AsyncRemote;

/**
 * Lägg jarar i den ordningen:
 *  1) appserv-rt
 *  2) gf-client
 *  3) Java EE 6 API Library
 * @author ingimar
 */
public class J2SEClientCountry {

    public static void main(String[] args) {
        System.out.println("Heja världen .....  ");
        try {
            Properties jndiProps = new Properties();
            jndiProps.put("java.naming.factory.initial", "com.sun.enterprise.naming.impl.SerialInitContextFactory");
            jndiProps.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            jndiProps.put("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            jndiProps.setProperty("org.omg.CORBA.ORBInitialHost", "ingimar-HP"); // ingimar-HP // 127.0.0.1
            jndiProps.setProperty("org.omg.CORBA.ORBInitialPort", "1099"); // 3700
            Context ctx = new InitialContext(jndiProps);
            @SuppressWarnings("unused")
            CapitalBeanRemote bean = (CapitalBeanRemote) ctx.lookup("java:global/CountryEnterpriseEJB/CapitalBean");
            System.out.println("out from bean : "+bean.getCapital("Japan"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
