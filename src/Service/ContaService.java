package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Model.Cliente;
import Model.Conta;

public class ContaService{

	private List<Conta> contas = new ArrayList<Conta>();

	public static Conta createConta(Cliente cliente){
		
		return new Conta(cliente);
	}
	
	public List<Conta> getContas(){
		
		for(Conta conta : this.contas) {
			conta.depositar(5500);
			conta.sacar(600);
		}
		
		Collections.sort(this.contas);
		
		return this.contas;
	}
	
	public Conta newConta(Cliente cliente) {
		Conta conta = ContaService.createConta(cliente);
		this.contas.add(conta);
		return conta;
	}

}
