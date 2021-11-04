package model;

public class Room {
    private int RoomID;
    private double price;
    private boolean status;
    private int sleepRoomNumber;
    private int numberOfToilets;

    public Room() {
    }

    public Room(int roomID, double price, boolean status, int sleepRoomNumber, int numberOfToilets) {
        RoomID = roomID;
        this.price = price;
        this.status = status;
        this.sleepRoomNumber = sleepRoomNumber;
        this.numberOfToilets = numberOfToilets;
    }

    public int getRoomID() {
        return RoomID;
    }

    public void setRoomID(int roomID) {
        RoomID = roomID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSleepRoomNumber() {
        return sleepRoomNumber;
    }

    public void setSleepRoomNumber(int sleepRoomNumber) {
        this.sleepRoomNumber = sleepRoomNumber;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    @Override
    public String toString() {
        return "Room{" +
                "RoomID=" + RoomID +
                ", price=" + price +
                ", status=" + status +
                ", sleepRoomNumber=" + sleepRoomNumber +
                ", numberOfToilets=" + numberOfToilets +
                '}';
    }
}
