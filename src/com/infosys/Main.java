package com.infosys;
class Stud {
    private int studid;
    private String name;
    private int yearofenrollment;
    public static int counter;
    static{
        Stud.counter = 500;
    }
    public Stud(String name, int yearofenrollment){
        this.name = name;
        this.yearofenrollment = yearofenrollment;
        this.studid = ++Stud.counter;
    }

    public static int getNoOfStudents(){
        return (Stud.counter -500);
    }
}
class GFG {
    public static void main(String[] args){
        Stud student = new Stud("ravi", 2020);
        Stud student2 = new Stud("ravi", 2020);
        Stud student3 = new Stud("ravi", 2020);
        System.out.println(student.getNoOfStudents());
    }
    }