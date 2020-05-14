package ar.uba.fi.distribuidos.rmi.client;

import ar.uba.fi.distribuidos.rmi.communication.*;
import java.rmi.Naming;

public class ClientApp {
  public static void main(String[] args) {
    try {
      String registryRoot = args[0];
      BankAccount a = (BankAccount) 
          Naming.lookup(registryRoot + "/BankAccount");
      Money m0 = a.getBalance();

      a.add(m0);
      Money m1 = a.getBalance();
      System.out.format("Original: %.2f - New: %.2f",
          m0.getValue(), m1.getValue());
    } catch (Exception e) {
      System.err.format("Error detected: %s.", e);
    }
  }
}

