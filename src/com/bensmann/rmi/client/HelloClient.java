/*
 * HelloClient.java
 *
 * Created on 30. März 2007, 14:15
 *
 */

package com.bensmann.rmi.client;

import com.bensmann.rmi.Hello;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author rb
 */
public class HelloClient {
    
    /** Creates a new instance of HelloClient */
    public HelloClient() {
    }
    
    public static void main(String[] args) {
            
        try {
            Hello hello = (Hello) Naming.lookup("rmi://localhost/Hello");
            System.out.println(hello.sayGoodMorning());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
