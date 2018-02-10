/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnections;

import Models.CSPostgreSQL;

/**
 *
 * @author Cemmy
 */
public class staticValues {

    public static int isDB = 0;

    private static CSPostgreSQL pgSQL = new CSPostgreSQL();

    public static CSPostgreSQL getPgSQL() {
        pgSQL.setDriverName("org.postgresql.Driver");
        pgSQL.setIpAdress("10.0.8.100");
        pgSQL.setPort("5432");
        pgSQL.setDateBase("DBSporSalonu");
        pgSQL.setUserName("postgres");
        pgSQL.setPassword("root");
        return pgSQL;
    }
}
