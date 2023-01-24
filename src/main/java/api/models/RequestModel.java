package api.models;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import api.payloads.RequestPayLoads;
import api.repositories.mysql.MysqlConection;


public class RequestModel {
    private int id; 
    private String name;
    private Date date;
    private String description;
    private String type;
    private MysqlConection repository=new MysqlConection();
    private String table= "request";
    public RequestModel() {
    }
    public RequestModel(int id, String name, Date date, String description, String type) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.description = description;
        this.type = type;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public List<Object> index(){
        try {
            Statement statement = repository.conn.createStatement();
            String mysqulString = String.format("SELECT * FROM %s;", table);
            ResultSet rs = statement.executeQuery( mysqulString);
            List<Object> requests = new ArrayList<>();
            while (rs.next()) {
                RequestPayLoads request = new RequestPayLoads();
                request.setId(rs.getInt("id_request"));
                request.setName(rs.getString("name_request"));
                request.setDate(rs.getString("date_request"));
                request.setType(rs.getString("type_request"));
                request.setDescription(rs.getString("description_request"));
                requests.add(request);
            } 
            
            return requests;
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            return null;
        }
        
    } 
}


