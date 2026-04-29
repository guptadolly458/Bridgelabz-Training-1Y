package com.gla.logistics;

import java.sql.Connection;
import java.sql.PreparedStatement;

    public class DriverDAO {

        public static void insertDriver(Driver d) {
            try {
                Connection con = DBConnection.getConnection();

                String query = "INSERT INTO driver (driver_id, name) VALUES (?, ?)";
                PreparedStatement ps = con.prepareStatement(query);

                ps.setString(1, d.driverId);
                ps.setString(2, d.name);

                ps.executeUpdate();

                con.close();
                System.out.println("Driver inserted successfully!");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
