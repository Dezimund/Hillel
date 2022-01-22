package homework.task27;

import java.util.Random;

public class PersonUsage {

    public static void main(String[] args) {

        Random random = new Random();

        String[] Name = {"Jackalyn", "Ned", "Mo", "Talbot", "Sherlyn", "Allana", "Lucette"};
        String[] Second_Name = {"Fay", "Coburn", "Alesci", "Vico", "Havel", "Chamberlain", "Bret"};

        for (int i = 0; i < 100; i++) {
            int randname = (int) Math.floor(Math.random() * Name.length);
            int randsecname = (int) Math.floor(Math.random() * Second_Name.length);
            Person persones = new Person(" " + Name[randname]," " + Second_Name[randsecname]);
            System.out.println(persones);
        }




    }






}
