package ar.uba.fi.distribuidos.rmi.server;

import ar.uba.fi.distribuidos.rmi.communication.*;
import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

public class ServerApp {
  public static void main(String[] args){
    try {
      String registryRoot = args[0];
      BankAccount account = new BankAccountImpl(1000);
      Naming.rebind(registryRoot + "/BankAccount", account);
      System.out.println("Server ready...");
    } catch (Exception e) {
      System.err.format("Error detected: %s", e);
      e.printStackTrace();
    }
  }
}

