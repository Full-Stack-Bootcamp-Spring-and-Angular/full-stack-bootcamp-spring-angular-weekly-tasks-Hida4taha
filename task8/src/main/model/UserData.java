package main.model;

import org.jetbrains.annotations.NotNull;

public class UserData {
    @NotNull
    @Size(min=1,max="the min value is 1 char")
    private String name;
    private String password;
    private String country;
    private String programmingLanguage;
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
