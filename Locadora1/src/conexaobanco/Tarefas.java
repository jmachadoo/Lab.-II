package conexaobanco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Tarefas {

	public void criarCliente(String nome, Integer cpf) {
		Connection con = null;
		try {
			con = Conexaobanco.getConnection();
			String insertSql = "insert into cliente (nome, cpf) values (?, ?)";
			PreparedStatement pst;
			pst = con.prepareStatement(insertSql);
			pst.setString(1, nome);
			pst.setInt(2, cpf);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Erro ao cadastrar cliente!", e);
		}

	}
	
	
	}
	


