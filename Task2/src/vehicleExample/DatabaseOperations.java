package vehicleExample;
public class DatabaseOperations {
    private String url;
    private String username;
    private String password;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    void storeVehicleIntoDatabase(String vehicleNmae){
        System.out.println("connect to DataBase"+ "url : " + url+"password : "+ password +" username : " + username);
        System.out.println("Storing vehicle int database" + vehicleNmae);
    }
}
