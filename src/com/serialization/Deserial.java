package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deserial {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        FileInputStream fileInputStream = new FileInputStream("/Users/ovkc/Desktop/text.rtf");
        ObjectInputStream in =new ObjectInputStream(fileInputStream);
        List<Student> arrayList=new ArrayList<>();
        arrayList=(ArrayList<Student>)in.readObject();

        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i).getId()+ " " + arrayList.get(i).getName());
        }
        System.out.println("data retrived");
        in.close();

    }
}
