package test;

import javax.xml.stream.events.StartDocument;

public class Student {
    private String name;
    private int age;
    private Double average;

    public Student( String name, int age,Double average){
        this.age = age;
        this.name = name;
        this.average = average;
    }
    public Student(int age, String name){
        this.age = age;
        this.name = name;
        this.average = 0.0;
    }
    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.average = other.average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }
    public String toString(){
        String output = "Student name: " + this.name + "\n" + "Student age: " + this.age + "\n" + "Student average: " +this.average;
        return output;
    }
    public  boolean  equals( Student b){
        if(this.getAge() == b.getAge() && this.getAverage() == b.getAverage())
            return true;
        else{
            return false;
        }
    }
}
