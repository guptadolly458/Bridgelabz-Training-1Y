package com.gla.logistics;

import java.sql.Connection;
import java.sql.DriverManager;

    public class DBConnection {

        private static final String URL = "jdbc:mysql://localhost:3306/logistics_db";
        private static final String USER = "root";
        private static final String PASSWORD = "tanjiro";

        public static Connection getConnection() throws Exception {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }
