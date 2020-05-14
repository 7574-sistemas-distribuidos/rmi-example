package ar.uba.fi.distribuidos.rmi.server;

import ar.uba.fi.distribuidos.rmi.communication.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BankAccountImpl extends UnicastRemoteObject implements BankAccount {
  private Money balance;

  public BankAccountImpl(double initialBalance) throws RemoteException {
    this.balance = new MoneyImpl(initialBalance, "Pesos");
  }
  public void add(Money m) throws RemoteException {
    String currency = this.balance.getCurrency();
    if (!m.getCurrency().equals(currency))
      throw new RemoteException("Invalid currency type");
    double value = this.balance.getValue() + m.getValue();
    this.balance = new MoneyImpl(value, currency);
  }
  public void substract(Money m) throws RemoteException {
    String currency = this.balance.getCurrency();
    if (!m.getCurrency().equals(currency))
      throw new RemoteException("Invalid currency type");
    double value = this.balance.getValue() - m.getValue();
    if (value < 0)
      throw new RemoteException("Invalid operation. Account balance can't become negative");
    this.balance = new MoneyImpl(value, currency);
  }
  public Money getBalance() throws RemoteException {
    return new MoneyImpl(this.balance.getValue(), this.balance.getCurrency());
  }
}

