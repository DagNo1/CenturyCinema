/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mohammed
 */
public class CenturyModel {

    //Gets all the info about admin from Database
    public static Admin getAdmin() {
        Admin admin = new Admin();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ADMIN");
            while (rs.next()) {
                admin.setId(rs.getInt(1));
                admin.setFull_name(rs.getString(2));
                admin.setUser_name(rs.getString(3));
                admin.setPassword(rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return admin;
    }

    //Updates Admin information
    public static void updateAdmin(String full_name, String user_name, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "UPDATE ADMIN SET full_name = + " + "'" + full_name + "'" + ",";
            query += "user_name = " + "'" + user_name + "'" + ",";
            query += "password = " + "'" + password + "'" + ";";
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Gets all the Ticket Sellers
    public static ArrayList<TicketSeller> getAllTicketSellers() {
        ArrayList<TicketSeller> allTicketSellers = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TICKET_SELLER");
            while (rs.next()) {
                TicketSeller ticketSeller = new TicketSeller();
                ticketSeller.setId(rs.getInt(1));
                ticketSeller.setFull_name(rs.getString(2));
                ticketSeller.setUser_name(rs.getString(3));
                ticketSeller.setPassword(rs.getString(4));
                allTicketSellers.add(ticketSeller);
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return allTicketSellers;
    }

    //Gets a single Ticket Seller by their ID
    public static TicketSeller getTicketSellerById(int id) {
        TicketSeller ticketSeller = new TicketSeller();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM TICKET_SELLER WHERE id = " + id);

            while (rs.next()) {
                ticketSeller.setId(rs.getInt(1));
                ticketSeller.setFull_name(rs.getString(2));
                ticketSeller.setUser_name(rs.getString(3));
                ticketSeller.setPassword(rs.getString(4));
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ticketSeller;
    }

    //Updates the Ticket Seller Information by their id
    public static void updateTicketSeller(int id, String full_name, String user_name, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "UPDATE TICKET_SELLER SET full_name =" + "'" + full_name + "'" + ",";
            query += "user_name = " + "'" + user_name + "'" + ",";
            query += "password = " + "'" + password + "'";
            query += "WHERE id = " + id;
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Delete the Ticket Seller by their id
    public static void deleteTicketSeller(int id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "DELETE FROM TICKET_SELLER WHERE id = " + id;
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Creates a Ticket Seller
    public static void createTicketSeller(String full_name, String user_name, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "INSERT INTO  TICKET_SELLER(full_name,user_name,password) VALUES(";
            query += "'" + full_name + "'" + ",";
            query += "'" + user_name + "'" + ",";
            query += "'" + password + "'" + ");";
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Creates a room
    public static void createRoom(int room_number, int capacity, int num_rows, int num_columns) throws CapacityException {
        if (num_rows + num_columns > capacity) {
            throw new CapacityException();
        } else {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
                Statement st = conn.createStatement();
                String query = "INSERT INTO ROOM(room_number, capacity, num_rows, num_columns) VALUES(";
                query += "'" + room_number + "'" + ",";
                query += "'" + capacity + "'" + ",";
                query += "'" + num_rows + "'" + ",";
                query += "'" + num_columns + "'" + ");";
                int x = st.executeUpdate(query);
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    //Updates data of a room
    public static void updateRoom(int room_number, int capacity, int num_rows, int num_columns) throws CapacityException {
        if (num_rows + num_columns > capacity) {
            throw new CapacityException();
        } else {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
                Statement st = conn.createStatement();
                String query = "UPDATE ROOM SET capacity = " + capacity + ",";
                query += "num_rows = " + num_rows + ",";
                query += "num_columns = " + num_columns;
                query += " WHERE room_number = " + room_number;
                int x = st.executeUpdate(query);
                st.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    //Gets all Rooms Information
    public static ArrayList<Room> getAllRooms() {
        ArrayList<Room> allRooms = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ROOM");
            while (rs.next()) {
                Room room = new Room();
                room.setRoom_number(rs.getInt(1));
                room.setCapacity(rs.getInt(2));
                room.setNum_rows(rs.getInt(3));
                room.setNum_columns(rs.getInt(4));
                allRooms.add(room);
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return allRooms;
    }

    //Gets a single Room Information by id
    public static Room getRoomById(int room_number) {
        Room room = new Room();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ROOM WHERE room_number = " + room_number);

            while (rs.next()) {
                room.setRoom_number(rs.getInt(1));
                room.setCapacity(rs.getInt(2));
                room.setNum_rows(rs.getInt(3));
                room.setNum_columns(rs.getInt(4));
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return room;
    }

    //Deletes a Room by Id
    public static void deleteRoom(int room_number) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "DELETE FROM ROOM WHERE room_number = " + room_number;
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Create Movie
    public static void createMovie(String title, String genre, String synopsis, String release_date, int duration, String language, String poster) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "INSERT INTO  MOVIE(title,genre,synopsis,release_date,duration,language,poster) VALUES(";
            query += "'" + title + "'" + ",";
            query += "'" + genre + "'" + ",";
            query += "'" + synopsis + "'" + ",";
            query += "'" + release_date + "'" + ",";
            query += "'" + duration + "'" + ",";
            query += "'" + language + "'" + ",";
            query += "'" + poster + "'" + ");";
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Updates Movie by id
    public static void updateMovie(int id, String title, String genre, String synopsis, String release_date, String duration, String language, String poster) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "UPDATE MOVIE SET title = " + "'" + title + "'" + ",";
            query += "genre = " + "'" + genre + "'" + ",";
            query += "synopsis = " + "'" + synopsis + "'" + ",";
            query += "release_date = " + "'" + release_date + "'" + ",";
            query += "duration = " + "'" + duration + "'" + ",";
            query += "language = " + "'" + language + "'" + ",";
            query += "poster = " + "'" + poster + "'";
            query += " WHERE id = " + id;
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Gets all Movies Information
    public static ArrayList<Movie> getAllMovies() {
        ArrayList<Movie> allMovies = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM MOVIE");
            while (rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getInt(1));
                movie.setTitle(rs.getString(2));
                movie.setGenre(rs.getString(3));
                movie.setSynopsis(rs.getString(4));
                movie.setRelease_date(rs.getString(5));
                movie.setDuration(rs.getString(6));
                movie.setLanguage(rs.getString(7));
                movie.setPoster(rs.getString(8));
                allMovies.add(movie);
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return allMovies;
    }

    //Gets Movie Information by Id
    public static Movie getMovieById(int id) {
        Movie movie = new Movie();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM MOVIE WHERE id = " + id);

            while (rs.next()) {
                movie.setId(rs.getInt(1));
                movie.setTitle(rs.getString(2));
                movie.setGenre(rs.getString(3));
                movie.setSynopsis(rs.getString(4));
                movie.setRelease_date(rs.getString(5));
                movie.setDuration(rs.getString(6));
                movie.setLanguage(rs.getString(7));
                movie.setPoster(rs.getString(8));
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return movie;
    }

    //Delete Movie by Id
    public static void deleteMovie(int id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "DELETE FROM MOVIE WHERE id = " + id;
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Create Screening
    public static void createScreening(int room_number, int movie_id, String date, String period, double price) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "INSERT INTO  SCREENING(room_number,movie_id,date,period,price) VALUES(";
            query += "'" + room_number + "'" + ",";
            query += "'" + movie_id + "'" + ",";
            query += "'" + date + "'" + ",";
            query += "'" + period + "'" + ",";
            query += "'" + price + "'" + ");";
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Update Screening by Id
    public static void updateScreening(int id, int room_number, int movie_id, String date, String period, double price) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "UPDATE SCREENING SET room_number = " + "'" + room_number + "'" + ",";
            query += "movie_id = " + "'" + movie_id + "'" + ",";
            query += "date = " + "'" + date + "'" + ",";
            query += "period = " + "'" + period + "'" + ",";
            query += "price = " + "'" + price + "'" + ",";
            query += " WHERE id = " + id;
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Gets all Movies Information
    public static ArrayList<Screening> getAllScreening() {
        ArrayList<Screening> allScreenings = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SCREENING");
            while (rs.next()) {
                Screening screening = new Screening();
                screening.setId(rs.getInt(1));
                screening.setRoom_number(rs.getInt(2));
                screening.setMovie_id(rs.getInt(3));
                screening.setDate(rs.getString(4));
                screening.setPeriod(rs.getString(5));
                screening.setPrice(rs.getDouble(6));
                allScreenings.add(screening);
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return allScreenings;
    }

    //Gets Movie Information by Id
    public static Screening getScreeningById(int id) {
        Screening screening = new Screening();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SCREENING WHERE id = " + id);

            while (rs.next()) {
                screening.setRoom_number(rs.getInt(2));
                screening.setMovie_id(rs.getInt(3));
                screening.setDate(rs.getString(4));
                screening.setPeriod(rs.getString(5));
                screening.setPrice(rs.getDouble(6));
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return screening;
    }

    //Delete Movie by Id
    public static void deleteScreening(int id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "DELETE FROM SCREENING WHERE id = " + id;
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Create Screening
    public static void createReservation(int screening_id, int ticket_seller_id, ArrayList<Reservation> reserved_seats) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "INSERT INTO  RESERVATION(screening_id,ticket_seller_id,reserved_seats) VALUES(";
            query += "'" + screening_id + "'" + ",";
            query += "'" + ticket_seller_id + "'" + ",";
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Update Screening by Id
    public static void updateReservation(int id, int screening_id, int ticket_seller_id, ArrayList<Reservation> reserved_seats) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "UPDATE RESERVATION SET screening_id = " + screening_id + ",";
            query += "ticket_seller_id = " + ticket_seller_id + ",";
            query += " WHERE id = " + id;
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Gets all Movies Information
    public static ArrayList<Reservation> getAllReservation() {
        ArrayList<Reservation> allReservations = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SCREENING");
            while (rs.next()) {
                Reservation reservation = new Reservation();
                reservation.setScreening_id(rs.getInt(1));
                reservation.setTicket_seller_id(rs.getInt(2));
                allReservations.add(reservation);
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return allReservations;
    }

    //Gets Movie Information by Id
    public static Reservation getReservationById(int id) {
        Reservation reservation = new Reservation();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM SCREENING WHERE id = " + id);

            while (rs.next()) {
                reservation.setScreening_id(rs.getInt(1));
                reservation.setTicket_seller_id(rs.getInt(2));
            }
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return reservation;
    }

    //Delete Movie by Id
    public static void deleteReservation(int id) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/CENTURY_CINEMA", "mohammed", "Nebil1053");
            Statement st = conn.createStatement();
            String query = "DELETE FROM RESERVATION WHERE id = " + id;
            int x = st.executeUpdate(query);
            st.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
//        createScreening(1, 1, "2023/02/01", "lunch time", 20.00);
        ArrayList<Screening> screenings = getAllScreening();
        screenings.forEach(screen -> System.out.println(screen.getPeriod()));
        Screening sc = getScreeningById(3);
        System.out.println(sc.getDate());
//        deleteScreening(2);
    }
}