/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.som.dal;

import java.sql.*;

/**
 *
 * @author vickb
 */
public class ModuloConexao {
    // Metodo para conexão com o BD
    public static Connection conectar(){
        java.sql.Connection conexao = null; // Variável para receber string de conexão
        // Chamar o driver importado \/
        //String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenar informaçoes sobre o BD
        String url= "jdbc:mysql://127.0.0.1:3306/dbinfo";
        String user= "root";
        String password = "909050";
        //Estabelecer conexão
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
