/*
 * HelloServer.java
 *
 * Created on 30. März 2007, 14:12
 *
 */

package com.bensmann.rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author rb
 */
public class HelloServer {
    
    /** Creates a new instance of HelloServer */
    public HelloServer() {
    }
    
    public static void main(String[] args) {
            
        try {
            Naming.rebind("rmi://localhost/Hello", new HelloImpl());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
