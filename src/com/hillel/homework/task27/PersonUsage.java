package homework.task27;

import java.util.Random;

public class PersonUsage {

    public static void main(String[] args) {

        Random random = new Random();

        String[] name = {"Jackalyn", "Ned", "Mo", "Talbot", "Sherlyn", "Allana", "Lucette"};
        String[] secondName = {"Fay", "Coburn", "Alesci", "Vico", "Havel", "Chamberlain", "Bret"};

        for (int i = 0; i < 100; i++) {
            int randWeight = 0;
            int randHeight = 0;
            int randName = (int) Math.floor(Math.random() * name.length);
            int randSecname = (int) Math.floor(Math.random() * secondName.length);
            int randAge = (int) (20 + Math.random() * 50);
            if (randAge >= 20 && randAge <= 29){
                randWeight = (int) (50 + Math.random() * 50);
                randHeight = (int) (150 + Math.random() * 50);
            } else if(randAge >= 30 && randAge <= 39){
                randWeight = (int) (52 + Math.random() * 48);
                randHeight = (int) (150 + Math.random() * 50);
            }else if(randAge >= 40 && randAge <= 49) {
                randWeight = (int) (54 + Math.random() * 46);
                randHeight = (int) (150 + Math.random() * 50);
            }else if(randAge >= 50 && randAge <= 59) {
                randWeight = (int) (54 + Math.random() * 46);
                randHeight = (int) (150 + Math.random() * 50);
            }else if(randAge >= 60 && randAge <= 69) {
                randWeight = (int) (52 + Math.random() * 43);
                randHeight = (int) (150 + Math.random() * 50);
            }
            Person persones = new Person(" " + name[randName]," " + secondName[randSecname],randAge, randWeight, randHeight);
            System.out.println(persones);
        }




    }






}
