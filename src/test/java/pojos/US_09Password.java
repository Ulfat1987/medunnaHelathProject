package pojos;

public class US_09Password {

    private String password;
    private String newpassword;

    @Override
    public String toString() {
        return "US_09Password{" +
                "password='" + password + '\'' +
                ", newpassword='" + newpassword + '\'' +
                '}';
    }

    public US_09Password(){
    }
    public US_09Password(String password,String newpassword){
        this.password=password;
        this.newpassword=newpassword;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }






}
