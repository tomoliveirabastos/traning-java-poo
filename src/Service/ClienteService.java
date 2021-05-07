package Service;
import java.util.ArrayList;
import java.util.List;

import Model.Cliente;

public class ClienteService extends Cliente{
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	private static ClienteService createCliente() {
		return new ClienteService();
	}
	
	public Cliente newCliente() {
		ClienteService cliente = ClienteService.createCliente();
		this.clientes.add(cliente);
		return cliente;
	}
	
	public List<Cliente> getClientes(){
		return this.clientes;
	}
}
