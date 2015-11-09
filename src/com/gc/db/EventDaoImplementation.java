package com.gc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.gc.model.Events;

public class EventDaoImplementation implements EventDao {
	private Connection connection;

	void connectToDb() {
		String dbUrl = "jdbc:mysql://localhost:3306/Events";
		String username = "root";
		String password = "Bro@dw@y#";

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Events> getEventList() {
		connectToDb();
		ArrayList<Events> eventList = new ArrayList<Events>();
		try {
			PreparedStatement preparedStatementForList = connection.prepareStatement("SELECT * FROM user");
			ResultSet eventResultSet = preparedStatementForList.executeQuery();
			while (eventResultSet.next()) {
				String date = eventResultSet.getString(1);
				String name = eventResultSet.getString(2);
				String type = eventResultSet.getString(3);
				String location = eventResultSet.getString(4);
				String description = eventResultSet.getString(5);
				String price = eventResultSet.getString(6);
				String link = eventResultSet.getString(7);

				Events event = new Events(date, name, type, location, description, price, link);
				eventList.add(event);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return eventList;
	}

	public void addEvents() {
		connectToDb();
		String preparedQuery = "INSERT INTO Events (date, name, type, location, description, price, link) "
				+ "Values (?,?,?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(preparedQuery);
		ps.setString(1, Events.getDate());
		ps.setString(2, Events.getName());
		ps.setString(3, Events.getType());
		ps.setString(4, Events.getLocation());
		ps.setString(5, Events.getDescription());
		ps.setString(6, Events.getPrice());
		ps.setString(7, Events.getLink());
		ps.executeUpdate();
	}

	public cleanEvents(){
		connectToDb();
		String preparedQuery = "DELETE FROM Events "+ "WHERE date = ?";
		PreparedStatement ps = connection.prepareStatement(preparedQuery);
		ps.setString(1, ?);
		ps.executeUpdate();
	//cleans out-dated events 	
	}

	public getEventByType(){
		connectToDb();
		//returns events with the same type
	}

	public getEventByDate(){
		connectToDb();
		//returns events with the same date
	}

	public getEventByLocation(){
		connectToDb();
		//returns events with the same location
	}

	public getEventByPrice(){
		connectToDb();
		//returns events with the same price range
	}
}
