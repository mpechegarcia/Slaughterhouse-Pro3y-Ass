package dk.via.slaughterhousepro3yass.database;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TraceabilityRepository {

  public List<Integer> getAnimalsForProduct(int productId) {

    List<Integer> animalIds = new ArrayList<>();

    String sql = """
                SELECT DISTINCT a.animal_id
                FROM animal a
                JOIN part p ON a.animal_id = p.animal_id
                JOIN product_tray pt ON p.tray_id = pt.tray_id
                WHERE pt.product_id = ?
                """;

    try (
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)
    ) {

      statement.setInt(1, productId);

      try (ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
          animalIds.add(resultSet.getInt("animal_id"));
        }
      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return animalIds;
  }

  public List<Integer> getProductsForAnimal(int animalId) {

    List<Integer> productIds = new ArrayList<>();

    String sql = """
                SELECT DISTINCT pr.product_id
                FROM product pr
                JOIN product_tray pt ON pr.product_id = pt.product_id
                JOIN part p ON pt.tray_id = p.tray_id
                WHERE p.animal_id = ?
                """;

    try (
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)
    ) {

      statement.setInt(1, animalId);

      try (ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
          productIds.add(resultSet.getInt("product_id"));
        }
      }

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }

    return productIds;
  }
}
