package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        AdditionImpl addition = new AdditionImpl();
        LocateRegistry.createRegistry(1099);
        Naming.rebind("service", addition);
        System.out.println("Server running......");
    }
}