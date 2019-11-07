package db;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import business.Actor;

public class ActorDB extends BaseDB {
	public List<Actor> list() {
		List<Actor> movieList = new ArrayList<>();
		String sql = "SELECT * from actor";
		try(PreparedStatement ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Actor a = getActorFromResultSet(rs);
				movieList.add(a);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return movieList;
	}
	
	public int add(Actor a) {
		int rowCount = 0;
		String sql = "INSERT into Actor (first name, last name, gender, birthday) VALUES" + "(?, ?, ?, ?)";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)){
			ps.setString(1,  a.getFirstName());
			ps.setString(2, a.getLastName());
			ps.setString(3, a.getGender());
			ps.setObject(4, a.getBirthDate());
			rowCount = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
		
	}

	private Actor getActorFromResultSet(ResultSet rs) throws SQLException {
		// get actor from the result set
		int id = rs.getInt(1);
		String firstName = rs.getString(2);
		String lastName = rs.getString(3);
		String gender = rs.getString(4);
		LocalDate ld =rs.getDate(5).toLocalDate();
		Actor a = new Actor(id, firstName, lastName, gender, ld);
		return a;
	}
	
	public int update(Actor a) {
		int rowCount = 0;
		String sql = "update Actor first name = ? where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)){
			ps.setString(1,  a.getFirstName());
			ps.setInt(2, a.getId());
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
		
	}

	public Actor get(int id) {
			Actor a = null;
			String sql = "SELECT * from actor "+ 
						"WHERE id = ?";
			try(PreparedStatement ps = getConnection().prepareStatement(sql)){
				ps.setInt(1,  id);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					a = getActorFromResultSet(rs);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return a;
	}

}
