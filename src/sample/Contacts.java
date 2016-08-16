package sample;

public class Contacts {

    String name;
    String phone;
    String email;

    public Contacts (String name, String phone, String email) {

        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString(){
        return String.format("%s, %s, %s", name, phone, email);
    }
}
