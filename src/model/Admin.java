package model;

public class Admin {
  private int id;
  private String name;
  private int age;
  private String address;
  private int phoneNumber;
  private String email;
  private String account;

    public Admin() {}

    public Admin(int id, String name, int age, String address, int phoneNumber, String email, String account) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.account = account;
    }
}
