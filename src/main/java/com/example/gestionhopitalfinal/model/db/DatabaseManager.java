package com.example.gestionhopitalfinal.model.db;

import com.example.gestionhopitalfinal.HelloApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

    private final String url = "jdbc:mysql://82.180.172.103:3306/u627373639_hopital?enabledTLSProtocols=TLSv1.2";
    private final String user = "u627373639_formation";
    private final String password = "Kilungujacques0";
    private Connection cn = null;
    private String query;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public DatabaseManager() throws SQLException {
        openConnexion();
    }

    public Connection openConnexion() throws SQLException {
        /*this.cn = DriverManager.getConnection(this.url, this.user, this.password);*/
        return cn;
    }

    public void closeConnexion() throws SQLException {
        this.cn.close();
    }
}

