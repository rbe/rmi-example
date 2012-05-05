/*
 * HelloImpl.java
 *
 * Created on 30. März 2007, 14:05
 *
 */

package com.bensmann.rmi.server;

import com.bensmann.rmi.Hello;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author rb
 */
public class HelloImpl extends UnicastRemoteObject implements Hello {
    
    /** Creates a new instance of HelloImpl */
    public HelloImpl() throws RemoteException {
    }

    public String sayGoodMorning() {
        return "Guten Morgen!";
    }
    
}
