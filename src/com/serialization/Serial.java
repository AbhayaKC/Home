package com.serialization;

import java.io.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Serial {

    public static void main(String[] args) throws IOException {

        Student student = new Student();

        student.setId(1l);
        student.setName("uchit");
        Student student1 = new Student( 2l , "bee" );
        Student student2 = new Student( 3l , "ov" );


        List<Student> arraylist = new ArrayList<>();

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/ovkc/Desktop/text.rtf");

        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        arraylist.add(student);
        arraylist.add(student1);
        arraylist.add(student2);
        outputStream.writeObject(arraylist);
        outputStream.close();
        fileOutputStream.close();
        System.out.println("data saved");
    }
}
