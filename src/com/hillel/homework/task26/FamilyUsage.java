package homework.task26;



public class FamilyUsage {


    public static void main(String[] args){


        String[] Name = {"Jackalyn", "Ned", "Mo", "Talbot", "Sherlyn", "Allana", "Lucette","Vasya","Anya","Alex","Miranda","Fiona","Richard","Chris","Artur","Lylah", "Marion", "Mitchell", "Sadia", "Linda","Rebecca"};
        String[] femaleName = {"Allana","Anya","Miranda","Fiona","Sadia", "Linda","Rebecca"};
        String[] maleName = {"Jackalyn", "Ned", "Mo", "Talbot","Alex","Richard","Chris","Artur","Mitchell",};

        for (int i = 0; i < 2; i++) {

            int randName = (int) Math.floor(Math.random() * Name.length);
            int randMom = (int) Math.floor(Math.random() * femaleName.length);
            int randDad = (int) Math.floor(Math.random() * maleName.length);
            int randGrandDad = (int) Math.floor(Math.random() * maleName.length);
            int randGrandMom = (int) Math.floor(Math.random() * femaleName.length);
            int randGreatGrandDad = (int) Math.floor(Math.random() * maleName.length);
            int randGreatGrandMom = (int) Math.floor(Math.random() * femaleName.length);
            FamilyMember firstGeneration = new FamilyMember(" " + Name[randName]," " + femaleName[randMom], " " + maleName[randDad]," " + maleName[randGrandDad]," " + femaleName[randGrandMom]," " + maleName[randGreatGrandDad]," " + femaleName[randGreatGrandMom]);

            System.out.println("First Generation is : " + firstGeneration);
            System.out.println();


            int randName1 = (int) Math.floor(Math.random() * Name.length);
            int randMom1 = (int) Math.floor(Math.random() * femaleName.length);
            int randDad1 = (int) Math.floor(Math.random() * maleName.length);
            int randGrandDad1 = (int) Math.floor(Math.random() * maleName.length);
            int randGrandMom1 = (int) Math.floor(Math.random() * femaleName.length);
            int randGreatGrandDad1 = (int) Math.floor(Math.random() * maleName.length);
            int randGreatGrandMom1 = (int) Math.floor(Math.random() * femaleName.length);
            FamilyMember secondGeneration = new FamilyMember(" " + Name[randName1]," " + femaleName[randMom1], " " + maleName[randDad1]," " + maleName[randGrandDad1]," " + femaleName[randGrandMom1]," " + maleName[randGreatGrandDad1]," " + femaleName[randGreatGrandMom1]);

            System.out.println("Second Generation is : " + secondGeneration);
            System.out.println();

        }





    }

}
