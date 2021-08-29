package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;

import java.util.HashSet;
import java.util.TreeSet;

public class PhoneBook {
  private HashMap<String, HashSet<String>> phonebook;
  public PhoneBook(){
      phonebook = new HashMap<>();
  }

  public void add(String surname, String phoneNumber){
      if(!phonebook.containsKey(surname)){
          phonebook.put(surname, new HashSet<>());

      }
      phonebook.get(surname).add(phoneNumber);
  }
  public void get(String surname){
      System.out.println(phonebook.get(surname));
  }

}
