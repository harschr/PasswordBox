package passwordbox.dao.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import passwordbox.dao.interf.PasswordRepository;
import passwordbox.model.Password;
import passwordbox.model.User;

public class PasswordRepositoryJBDCImpl implements PasswordRepository {

    private Connection conn;
    private PreparedStatement register;
    private PreparedStatement login;
    private PreparedStatement usernameCheck;
    private PreparedStatement insert;
    private PreparedStatement delete;
    private PreparedStatement listAll;
    private PreparedStatement findById;
    private PreparedStatement findLanguage;
    private PreparedStatement update;

    public PasswordRepositoryJBDCImpl() {
        Properties prop = new Properties();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            prop.load(PasswordRepositoryJBDCImpl.class.getResourceAsStream("/sql.ini"));
            String url = prop.getProperty("SQL_url");
            String username = prop.getProperty("SQL_username");
            String password = prop.getProperty("SQL_password");             
            conn = DriverManager.getConnection(url,username,password);         
        } catch (SQLException ex) {
            System.err.println("Error when creating database connection! Message: " + ex.getMessage());
        } catch (IOException exIO) {
            System.err.println(exIO.getMessage());           
        } catch (Exception exEx) {
            System.out.println(exEx.getMessage());
        }

        try {
            this.conn = conn;
            this.register = conn.prepareStatement("INSERT INTO felhasznalok (first_name, last_name, email, language, username, password) VALUES (?,?,?,?,?,?)");
            this.login = conn.prepareStatement("SELECT * FROM felhasznalok WHERE username = ?");
            this.usernameCheck = conn.prepareStatement("SELECT 1 FROM felhasznalok WHERE username = ?");
            this.insert = conn.prepareStatement("INSERT INTO data (user_id, title, username, password,website) VALUES (?,?,?,?,?)");
            this.delete = conn.prepareStatement("DELETE FROM data WHERE id = ?");
            this.listAll = conn.prepareStatement("SELECT * FROM data WHERE user_id = ?");
            this.findById = conn.prepareStatement("SELECT * FROM data WHERE id = ?");
            this.findLanguage = conn.prepareStatement("SELECT language FROM felhasznalok WHERE id = ?");
            this.update = conn.prepareStatement("UPDATE data SET title = ?, username = ?, password = ?, website = ? WHERE id = ?");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void register(User user) {
        try {
            this.register.setString(1, user.getFirst_name());
            this.register.setString(2, user.getLast_name());
            this.register.setString(3, user.getEmail());
            this.register.setString(4, user.getLanguage());
            this.register.setString(5, user.getUser());
            this.register.setString(6, user.getPassword());
            register.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String login(String username) {
        String passwordSQL = "minta";
        try {
            this.login.setString(1, username);
            ResultSet rs = login.executeQuery();
            while (rs.next()) {
                passwordSQL = rs.getString("password");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return passwordSQL;
    }

    @Override
    public boolean usernameCheck(String username) {
        boolean exists = false;
        int usernameSQL = 0;
        try {
            this.usernameCheck.setString(1, username);
            ResultSet rs = usernameCheck.executeQuery();
            while (rs.next()) {
                usernameSQL = rs.getInt("1");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if (usernameSQL == 1) {
            exists = true;
        }
        return exists;
    }

    @Override
    public int retrieveUserId(String username) {
        int userId = 0;
        try {
            this.login.setString(1, username);
            ResultSet rs = login.executeQuery();
            while (rs.next()) {
                userId = rs.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return userId;
    }

    @Override
    public void insert(Password pw) {
        try {
            this.insert.setInt(1, pw.getUserId());
            this.insert.setString(2, pw.getTitle());
            this.insert.setString(3, pw.getUsername());
            this.insert.setString(4, pw.getPassword());
            this.insert.setString(5, pw.getWebsite());
            this.insert.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void delete(String id) {
        try {
            this.delete.setString(1, id);
            this.delete.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<String[]> listAll(int userId) {
        ArrayList<String[]> passwordList = new ArrayList<String[]>();

        try {
            this.listAll.setInt(1, userId);
            ResultSet rs = listAll.executeQuery();

            while (rs.next()) {
                String[] tbData = new String[6];
                tbData[0] = String.valueOf(rs.getInt("id"));                
                tbData[1] = rs.getString("title");
                tbData[2] = rs.getString("username");
                tbData[3] = rs.getString("password");
                tbData[4] = rs.getString("website");
                passwordList.add(tbData);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return passwordList;
    }

    @Override
    public Password findById(int passwordId) {
        Password password = new Password();
        try {
            this.findById.setInt(1, passwordId);

            ResultSet rs = this.findById.executeQuery();
            password = makeOnePassword(rs);
            rs.close();
            return password;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return password;
    }

    @Override
    public String findLanguage(int userId) {
        String language = null;

        try {
            this.findLanguage.setInt(1, userId);
            ResultSet rs = this.findLanguage.executeQuery();
            while (rs.next()) {
                language = rs.getString("language");
                return language;
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return language;
    }

    @Override
    public void update(Password pw, int passwordId) {
        try {
            this.update.setString(1, pw.getTitle());
            this.update.setString(2, pw.getUsername());
            this.update.setString(3, pw.getPassword());
            this.update.setString(4, pw.getWebsite());
            this.update.setInt(5, passwordId);
            this.update.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public StringBuilder writeToCSV(int userId) {
        ArrayList<String[]> passwordList = new ArrayList<String[]>();
        StringBuilder sb = new StringBuilder();
        try {
            this.listAll.setInt(1, userId);
            ResultSet rs = listAll.executeQuery();

            while (rs.next()) {
                sb.append(rs.getString("user_id"));
                sb.append(", ");
                sb.append(rs.getString("title"));
                sb.append(", ");
                sb.append(rs.getString("username"));
                sb.append(", ");
                sb.append(rs.getString("password"));
                sb.append(", ");
                sb.append(rs.getString("website"));
                sb.append("\r\n");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return sb;
    }

    @Override
    public Password makeOnePassword(ResultSet rs
    ) {
        try {
            while (rs.next()) {
                Password pw = new Password();
                pw.setUserId(rs.getInt("user_id"));
                pw.setTitle(rs.getString("title"));
                pw.setUsername(rs.getString("username"));
                pw.setPassword(rs.getString("password"));
                pw.setWebsite(rs.getString("website"));
                return pw;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
