package lesson2;

import java.sql.*;

public class DB {
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement ps;

    public static void main(String[] args) {
        try {
            connect();
            dropAndCreate();
            prepareStatement();
//            deleteExample();
//            insertExample();
//            updateExample();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            disconnect();
        }
    }

    public static void prepareStatement() throws SQLException {
        ps = connection.prepareStatement("insert into students (name, score) values (?, ?);");
    }

    private static void deleteExample() throws SQLException {
        statement.execute("delete from students where identity = 1;");
    }

    private static void updateExample() throws SQLException {
        statement.executeUpdate("update student set name = 'Petya' where name = 'Vasya';");
    }

    private static void insertExample() throws SQLException {
        statement.executeUpdate("insert into students (name, score) values ('Vasya', 500);");
    }

    private static void dropAndCreate() throws SQLException {
        statement.executeUpdate("drop table if exists students;");
        statement.executeUpdate("create table if not exists students(id integer primary key autoincrement, name text, score integer);");
    }

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:somedb.db");
        statement = connection.createStatement();
    }
    private static void disconnect() {
        try {
            if (statement != null) statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            if (connection != null) connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
