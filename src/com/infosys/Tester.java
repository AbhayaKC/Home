package com.infosys;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Trainee{
    int traineeId;
    String traineeName;

    public int getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    Trainee(int cId, String name){
        this.traineeId = cId;
        this.traineeName = name;


    }
}
public class Tester{


    public static void main(String[] args) {
        List<Trainee> list = new ArrayList<>();
        Trainee c1 = new Trainee(110, "Patrick");
        Trainee c2 = new Trainee(112, "Chandler");
        Trainee c3 = new Trainee(113, "Darbie");
        Trainee c4 = new Trainee(114,  "Kelly");
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        if (list.contains(c3)){
            list.set(1, list.get(3));
        }
        Stream<Trainee> stream = list.stream().filter(trainee -> trainee.getTraineeName().length() > 5);
        stream.forEach(trainee -> System.out.println(trainee.getTraineeId() + " "));




    }

}