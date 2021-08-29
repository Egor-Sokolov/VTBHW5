package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	String [] array = new String[]{"Слово1", "Слово2","Слово3", "Слово4", "Value", "Word", "Word", "Word", "Word"};
        System.out.println(findTheNumberOfUniqueValues(array));
        System.out.println(findFrequency(array));
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Medvedev","88005553535");
        phoneBook.add("Medvedev","88005553536");
        phoneBook.add("Medvedev","88005553537");
        phoneBook.add("Sokolov","88005553538");
        phoneBook.add("Orlov","88005553538");
        phoneBook.add("Sidorov","88005553534");
        phoneBook.get("Medvedev");


    }
    //Задание 1
    public static Map findFrequency(String[] array){
        Map<String, Integer> nGram = new HashMap<>();
        for(int i = 0; i < array.length; i++)
        {
            String item = array[i];
            int itemCount = nGram.getOrDefault(item, 0);
            nGram.put(item, itemCount+1);
        }
        return nGram;
    }

    public static Set findTheNumberOfUniqueValues(String [] array){
        Set<String> strSet = Arrays.stream(array).collect(Collectors.toSet());
        return strSet;

    }
}



