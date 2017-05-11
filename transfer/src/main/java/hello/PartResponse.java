package hello;

import java.io.Serializable;
import java.util.Date;

public class PartResponse implements Serializable{
        
    private String msg;
    private int amount;
    private Date date;
    
    public PartResponse() {
    }
    
    public PartResponse(String msg) {
        this.msg = msg;
    }    
    
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }    

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }    
    
}//EoM
