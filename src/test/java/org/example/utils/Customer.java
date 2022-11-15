package org.example.utils;

public class Customer {
    private  String number;
    private  String name;
    private  String birthdate;
    private  String address;
    private  String city;
    private  String state;
    private  String pin;
    private  String phone;
    private  String email;
    private  String password;

    public Customer() {
        super();
    }
public Customer(String number,String name,String birthdate,String address,String city,String state,String pin,
                String phone,String email,String password){
        this.number=number;
        this.name=name;
        this.birthdate=birthdate;
        this.address=address;
        this.city=city;
        this.state=state;
        this.pin=pin;
        this.phone=phone;
        this.email=email;
        this.password=password;
}
    public void setNumber(String number){
        this.number=number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
public  String getNumber(){
        return number;
}
    public  String getName() {
        return name;
    }

    public  String getBirthdate() {
        return birthdate;
    }

    public  String getAddress() {
        return address;
    }

    public  String getCity() {
        return city;
    }

    public  String getState() {
        return state;
    }

    public  String getPin() {
        return pin;
    }

    public  String getPhone() {
        return phone;
    }

    public  String getEmail() {
        return email;
    }

    public  String getPassword() {
        return password;
    }
}
