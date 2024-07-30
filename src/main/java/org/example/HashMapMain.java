package org.example;
import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        // Create a new HashMap object
        HashMap<String, String> nicknames = new HashMap<>();

        // Store names and nicknames in the hashmap
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        // Get Matthew's nickname from the hashmap
        String matthewsNickname = nicknames.get("matthew");

        // Print Matthew's nickname
        System.out.println("Matthew's nickname is: " + matthewsNickname);

        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");
        abbreviations.addAbbreviation("lol", "lough out loud");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();


    }
    }

