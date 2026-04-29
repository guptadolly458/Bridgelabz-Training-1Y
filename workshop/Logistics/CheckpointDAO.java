package com.gla.logistics;

import java.sql.Connection;
import java.sql.PreparedStatement;

    public class CheckpointDAO {

        public static void insertCheckpoint(Checkpoint cp, String driverId) {
            try {
                Connection con = DBConnection.getConnection();

                String query = "INSERT INTO checkpoint VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = con.prepareStatement(query);

                ps.setString(1, cp.checkpointId);
                ps.setString(2, cp.getType());
                ps.setString(3, cp.locationName);
                ps.setDouble(4, cp.distanceFromLast);
                ps.setInt(5, cp.expectedDuration);
                ps.setInt(6, cp.actualDuration);
                ps.setString(7, driverId);

                ps.executeUpdate();
                con.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
