package lk.ijse.dep8.db;

public class DBConnection {
    private  static DBConnection dbconnection;


    private DBConnection(){

    }

    public  static DBConnection getInstance(){
        return (dbconnection==null) ? dbconnection=new DBConnection():dbconnection;

    }
}
