package br.com.pc.gerador;

import br.com.pc.exception.ConsultaFalhouException;


import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class GerarArquivo {

    public ResultSet prepararConsultas(Connection conn , String sql) throws ConsultaFalhouException, SQLException {
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            return resultSet;
        }catch (SQLException e){
            throw new ConsultaFalhouException(e.getMessage(), e.getCause());
        }
    }


    public void gerarAquivo(String csvFileName, ResultSet resultSet) {
        java.io.BufferedWriter writer = null;

        try {
            writer = new java.io.BufferedWriter(
                    new java.io.OutputStreamWriter(
                            new java.io.FileOutputStream(csvFileName, false),"ISO_8859_1" ));

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // escreve os nomes das colunas no arquivo CSV
            for (int i = 1; i <= columnCount; i++) {
                writer.write(metaData.getColumnName(i));
                if (i < columnCount) {
                    writer.write(";");
                }
            }
            writer.newLine();

            // escreve os dados das linhas no arquivo CSV
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    Object value = resultSet.getObject(i);
                    writer.write(value == null ? "" : value.toString());
                    if (i < columnCount) {
                        writer.write(";");
                    }
                }
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public Properties lerArquivoProperties() throws IOException {
        Properties props = new Properties();
        try (InputStream inputStream = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("application.properties")) {
            props.load(inputStream);
        }
        return props;
    }


    public void fecharConexao(PreparedStatement ps){
        try {
            ps.close();
        }catch (SQLException e){

        }
    }

    public void fecharConexao(ResultSet rs){
        try {
            rs.close();
        }catch (SQLException e){

        }
    }

    public void fecharConexao(PreparedStatement ps, ResultSet rs){
        fecharConexao(ps);
        fecharConexao(rs);
    }

}
