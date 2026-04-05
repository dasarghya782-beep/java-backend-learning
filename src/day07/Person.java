package day07;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name,int age,String email){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    public void setName(String name){
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name=name.trim();
    }
    public void setAge(int age){
        if(age<0 || age>150){
            throw new IllegalArgumentException("Age must be between 0 and 150.Got: ");
        }
        this.age=age;
    }
    public void setEmail(String email){
        if(email==null || !email.contains("@") || !email.contains(".")){
            throw new IllegalArgumentException("Invalid email format: "+ email);
        }
        this.email=email.trim();
    }
    public String getInfo() {
        return "Name: " + name + " | Age: " + age + " | Email: " + email;
    }
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }

}

