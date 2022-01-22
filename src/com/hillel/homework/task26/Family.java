package homework.task26;

public class Family {

   public String name;
   public String MomsName;
   public String DadsName;

    public Family(String name, String momsName, String dadsName) {
        this.name = name;
        this.MomsName = momsName;
        this.DadsName = dadsName;
    }

    @Override
    public String toString() {
        return  name + '\'' +
                ", MomsName= " + MomsName + '\'' +
                ", DadsName= " + DadsName + '\''
                ;
    }
}
