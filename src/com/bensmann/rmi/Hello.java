/*
 * Hello.java
 *
 * Created on 30. März 2007, 14:03
 *
 */

package com.bensmann.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author rb
 */
public interface Hello extends Remote {
    
    public String sayGoodMorning() throws RemoteException;
    
}
