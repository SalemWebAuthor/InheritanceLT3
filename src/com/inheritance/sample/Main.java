package com.inheritance.sample;

public class Main extends College{
    protected Main() {
        super("A","B","C", "D");
    }
    public static void main(String[] args) {
        College obj = new College ("Teacher","CET","Programming", "University of St. La Salle");
        //accessing the fields of parent class
        System.out.println(obj.collegeName);
        System.out.println(obj.getDesignation());
        System.out.println(obj.getSubjectName());
        System.out.println(obj.getCollege());

        obj.setDesignation("Lecturer");
        System.out.println(obj.getDesignation());

        System.out.println(obj.getSubjectName());

        obj.does();

    }
}