import Service.ClienteService;
import Service.ContaService;

public class Main {
	
	public static void main(String[] args) {
		ClienteService clienteService = new ClienteService();

		clienteService.newCliente().setCpf("55555555555").setNome("Washington Oliveira").setProfissao("Programador Python");
		clienteService.newCliente().setCpf("88888855555").setNome("Washington Oliveira").setProfissao("Programador C++");
		clienteService.newCliente().setCpf("44444444444").setNome("Washington Oliveira wewqeqweq").setProfissao("Programador PHP");
		clienteService.newCliente().setCpf("66666666666").setNome("Washington Oliveira asdasda").setProfissao("Programador JS");
		clienteService.newCliente().setCpf("77777777777").setNome("Washington Oliveira asdasdaaaaaaaaaa").setProfissao("Programador JAVA");
		
		ContaService contaService = new ContaService();
		
		contaService.newConta(clienteService.getClientes().get(0)).setNumero(131213).setSaldo(155).setAgencia(1515441);
		contaService.newConta(clienteService.getClientes().get(1)).setNumero(121713).setSaldo(145).setAgencia(154454);
		contaService.newConta(clienteService.getClientes().get(2)).setNumero(146466).setSaldo(135).setAgencia(155451);
		contaService.newConta(clienteService.getClientes().get(3)).setNumero(223333).setSaldo(165).setAgencia(1515121);
		contaService.newConta(clienteService.getClientes().get(4)).setNumero(562233).setSaldo(166).setAgencia(14848121);
		
		System.out.println("Conta");

		contaService.getContas().forEach(item -> {
			System.out.println(
				item.getSaldo() +" - "+
				item.getNumero()+" - "+
				item.getAgencia() + " - "+
				item.getTitular().getNome()+" - "+
				item.getTitular().getProfissao()+" - "+
				item.getTitular().getCpf()
			);
		});
		
		
	}
}
