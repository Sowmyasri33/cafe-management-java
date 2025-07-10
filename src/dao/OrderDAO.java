package dao;

import db.DBConnection;

import java.sql.*;

public class OrderDAO {
    public void placeOrder(int itemId, int quantity) {
        String query = "INSERT INTO orders (item_id, quantity) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, itemId);
            stmt.setInt(2, quantity);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewOrders() {
        String query = "SELECT orders.id, menu.name, orders.quantity FROM orders JOIN menu ON orders.item_id = menu.id";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("Order #" + rs.getInt("id") + " - " + rs.getString("name") + " x " + rs.getInt("quantity"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
