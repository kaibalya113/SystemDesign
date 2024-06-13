package design_patterns.parking_lot;

import java.util.Date;

public class Ticket {
    private String id;
    private String price;
    private Date entryTime;
    private Date exitTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket(String id, String price, Date entryTime, Date exitTime) {
        this.id = id;
        this.price = price;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public Ticket() {
    }
}
