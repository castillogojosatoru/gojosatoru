/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jihyo;
/**
 *
 * @author Rhodz
 */
public class Jihyo {
    
    private String Name;
    private int Age;
    private String Gender;
    private String Birthdate;
    private String Course;
    
//    public Jihyo(String Name, int Age, String Gender, String Birthdate, String Course) {
//        this.Name = Name;
//        this.Age = Age;
//        this.Gender = Gender;
//        this.Birthdate = Birthdate;
//        this.Course = Course;
//    }
    
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public String getBirthdate() {
        return Birthdate;
    }
    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }
    public String getCourse() {
        return Course;
    }
    public void setCourse(String Course) {
        this.Course = Course;
    }
}
