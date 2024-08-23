
public class Principal {
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.conectar();
		//inserir
		Clientes cliente = new Clientes(5,"Gabriel", 8273673, "gazgaz@", 310120);
		if(dao.inserirUsuario(cliente)==true) {
			System.out.println("Inserção com sucesso "+ cliente.toString());
			
		}
		//Atualizar Uuario
		cliente.setName("novo nome");
		dao.atualizarUsuario(cliente);
		
		//excluir usuario
		
		dao.excluirUsuarios(cliente.getId());
		
		
	    
		
		
	}
}
