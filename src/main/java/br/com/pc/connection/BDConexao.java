package br.com.pc.connection;


import br.com.pc.exception.ConexaoFalhouException;
import br.com.pc.exception.ConsultaFalhouException;

import java.sql.*;

public class BDConexao {

    private String url;
    private String user;
    private String password;


    public BDConexao(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection conexao() throws ConexaoFalhouException{
        Connection connection = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e){
            throw new ConexaoFalhouException(e.getMessage(), e.getCause());
        }
        return connection;
    }


    public void fecharConexao(Connection conn){
        try {
            conn.close();
        }catch (SQLException e){

        }
    }


}
