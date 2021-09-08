package ru.mirea.taskSecond;

public class Authors {
    private String name;
    private String  email;
    private char gender;
    private boolean male;


    public Authors(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }



    public void setterName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setGender(char gender){
        this.gender = gender;
    }



    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public void setAll(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString(){
        return ""+name+" ("+gender+") "+email+"";
    }


}
