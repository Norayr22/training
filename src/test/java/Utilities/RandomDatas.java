package Utilities;

import java.util.Random;

public class RandomDatas {
            public static String wrongEmail() {
            String wrongEmails[] = {"test.develandoo", "test.develandoo@", "test.develandoo@mailinator", "test.develandoo@mailinator."};

            int wrongEmailFormat = new Random().nextInt(wrongEmails.length);
            return wrongEmails[wrongEmailFormat];
        }


}
