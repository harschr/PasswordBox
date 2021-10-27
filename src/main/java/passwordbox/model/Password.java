package passwordbox.model;

public class Password {

    private int userId;
    private String title;
    private String username;
    private String password;
    private String website;

    public Password(int userId, String title, String username, String password, String website) {
        this.userId = userId;
        this.title = title;
        this.username = username;
        this.password = password;
        this.website = website;
    }

    public Password() {
    }   

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
