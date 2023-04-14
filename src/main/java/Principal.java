import br.com.pc.connection.BDConexao;
import br.com.pc.exception.ConexaoFalhouException;
import br.com.pc.exception.ConsultaFalhouException;
import br.com.pc.gerador.GerarArquivo;
import util.ResourceUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Principal {


    public static void main(String[] args) throws Exception {



//        String caminho = "C:\\Unidade\\coisas\\";
//
////        System.out.println(resultado);
//
//        GerarArquivo gerarArquivo = new GerarArquivo();
//
//        Properties props = gerarArquivo.lerArquivoProperties();
//
//        String url = props.getProperty("connection.url");
//        String user = props.getProperty("connection.username");
//        String password = props.getProperty("connection.password");
//        String[] inputs = props.getProperty("resource.input").split(",");
//
//
//        for (String input : inputs){
//
//            String nome = input.substring(0,input.indexOf("."))+".csv";
//
//            String resultado = ResourceUtils.getContentFromResource("/input/"+input);
//
//            System.out.println(url + " " + user + " " + password);
//
//            BDConexao bdConexao = new BDConexao(url, user, password);
//            Connection conn = bdConexao.conexao();
//
//            System.out.println(conn.isClosed());
//
//            ResultSet resultSet = gerarArquivo.prepararConsultas(conn, resultado);
//
//            gerarArquivo.gerarAquivo(caminho+nome, resultSet);
//        }
//
//        System.out.println(url + " " + user + " " + password);
//
//        BDConexao bdConexao = new BDConexao(url, user, password);
//        Connection conn = bdConexao.conexao();
//
//        System.out.println(conn.isClosed());
//
//
//        ResultSet resultSet = gerarArquivo.prepararConsultas(conn, resultado);
//
//        gerarArquivo.gerarAquivo(fileCsv, resultSet);


    }
}
