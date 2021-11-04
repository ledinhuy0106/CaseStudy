package model;

import java.util.Date;

public class Receipt {
    private String receiptID;
    private String customerName;
    private String staffName;
    private Date checkin;
    private Date checkOut;
    private double totalPrice;


    public Receipt() {
    }

    public Receipt(String receiptID, String customerName, String staffName, Date checkin, Date checkOut, double totalPrice) {
        this.receiptID = receiptID;
        this.customerName = customerName;
        this.staffName = staffName;
        this.checkin = checkin;
        this.checkOut = checkOut;
        this.totalPrice = totalPrice;
    }

    public String getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "receiptID='" + receiptID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", staffName='" + staffName + '\'' +
                ", checkin=" + checkin +
                ", checkOut=" + checkOut +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
