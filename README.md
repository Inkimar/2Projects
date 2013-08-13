Ant-project.
No Database-connection.
Using Ubuntu 13.

Bean Implementing remote-interface.
Project Async is the bean ( Stateless, one method ) , depends on Domain ( AsyncRemote ).
Deploy!

On which port is my JNDI running ?
Could test with ' telnet 172.16.23.18 3700' I don't know if it is on 3700.

Test with EJB and J2SE-Client on the same machine :
	Test-1, With properties-file.
	Content of property-file
	org.omg.CORBA.ORBInitialHost=172.16.23.18
	org.omg.CORBA.ORBInitialPort=3700

	Verification :
	- Works

?? Did I change something in the /etc/hosts file

Test with EJB on 'Big Lenovo' and J2SE-Client on 'Little Lenovo'

Test-2, With properties-file.
	Content of property-file
	org.omg.CORBA.ORBInitialHost=172.16.23.18
	org.omg.CORBA.ORBInitialPort=3700

