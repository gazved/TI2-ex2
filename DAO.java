import java.sql.*;
public class DAO {
	private Connection conexao;
	
	public DAO() {
		conexao = null;
	}
	
	public boolean conectar() {
		String driverName = "org.postgresql.Driver";
		String serverName = "localhost";
		String mydatabase = "teste";
		int porta = 5432;
		String url = "jdbc:postgresql://" + serverName + ":" + porta +"/"+mydatabase;
		String username = "ti2cc";
		String password = "ti@cc";
		boolean status = false;
		
		try {
			Class.forName(driverName);
			conexao = DriverManager.getConnection(url, username, password);
			status = (conexao ==null);
			System.out.println("Conexão efetuada com o Postgres!");
		}catch(ClassNotFoundException e) {
			System.err.println("Conexão NÃO efetuada com o postgres... Driver não encontrado" + e.getMessage());
		}catch(SQLException e) {
			System.err.println("Conexão não efetuada com o postgres..."+ e.getMessage());
		}
		return status;
		
		
	}
	
	public boolean close() {
		boolean status = false;
		try {
			conexao.close();
			status = true;
		}catch(SQLException e) {
			System.err.println(e.getMessage());
		}
		return status;
	}
	
	public boolean inserirUsuario(Clientes cliente) {
		boolean status = false;
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO cliente (id, name, phone, email, birthday)"+ "VALUES (" + cliente.getName() + "," + cliente.getPhone() + ", " +
			cliente.getEmail() + ", "+ cliente.getBirthday() + ");");
			st.close();
			status = true;
		}catch(SQLException u) {
			throw new RuntimeException(u);
		}
		return status;
	}
	public boolean atualizarUsuario(Clientes cliente) {
		boolean status = false;
		try {
			Statement st = conexao.createStatement();
			String sql = "UPDATE clientes SET nome = "+ cliente.getName()+", phone = "+ cliente.getPhone()+
					", email = " + cliente.getEmail()+", birthday = " + cliente.getBirthday() + "WHERE id = "+
					cliente.getId();
			st.executeUpdate(sql);
			st.close();
			status = true;
		}catch(SQLException u) {
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public boolean excluirUsuarios(int id) {
		boolean status = false;
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM clientes WHERE id = " + id);
			st.close();
			status = true;
		}catch(SQLException u) {
			throw new RuntimeException(u);
		}
		return status;
	}
	
	
}
