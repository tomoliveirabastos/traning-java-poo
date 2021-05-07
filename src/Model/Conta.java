package Model;

import Interface.ContaInterface;

public class Conta implements ContaInterface, Comparable{
	
	protected double saldo;
	protected int agencia;
	protected int numero;
	protected Cliente titular;

	public Conta(Cliente titular){
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public Conta setSaldo(double saldo) {
		this.saldo = saldo;
		return this;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public Conta setAgencia(int agencia) {
		this.agencia = agencia;
		return this;
	}

	public int getNumero() {
		return this.numero;
	}

	public Conta setNumero(int numero) {
		this.numero = numero;

		return this;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public Conta setTitular(Cliente titular) {
		this.titular = titular;
		return this;
	}

	@Override
	public boolean sacar(int valor) {
		if(this.saldo < valor) return false;
		
		this.saldo -= valor;
	
		return true;
	}

	@Override
	public boolean depositar(int valor) {
		this.saldo += valor;
		return false;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Conta a = (Conta) o;
		return this.getNumero() - a.getNumero();
	}


}