package ar.uba.fi.distribuidos.rmi.server;

import ar.uba.fi.distribuidos.rmi.communication.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MoneyImpl extends UnicastRemoteObject implements Money {
  private double value;
  private String currency;

  public MoneyImpl(double v, String c) throws RemoteException {
    this.value = v;
    this.currency = c;
  }
  public MoneyImpl() throws RemoteException {
    this(0, "Pesos");
  }
  public double getValue() throws RemoteException {
    return this.value;
  }
  public String getCurrency() throws RemoteException {
    return this.currency;
  }
  public void setValue(double v) throws RemoteException {
    this.value = v;
  }
  public void setCurrency(String c) throws RemoteException {
    this.currency = c;
  }
}

