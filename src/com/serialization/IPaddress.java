package com.serialization;

public class IPaddress {
  static String defangIPaddr(String address) {

        String value =address.replace(".", "[.]");

        return value;
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";

        System.out.println(defangIPaddr(address));
    }
}
