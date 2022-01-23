package homework.task26;

public class FamilyMember {

    public String name;
    public String momsName;
    public String dadsName;
    public String grandDadName;
    public String grandMomName;
    public String greatGranddadName;
    public String greatGrandmomName;


    public FamilyMember(String name, String momsName, String dadsName, String grandDadName, String grandMomName, String greatGranddadName, String greatGrandmomName) {
        this.name = name;
        this.momsName = momsName;
        this.dadsName = dadsName;
        this.grandDadName = grandDadName;
        this.grandMomName = grandMomName;
        this.greatGranddadName = greatGranddadName;
        this.greatGrandmomName = greatGrandmomName;
    }


    @Override
    public String toString() {
        return "name= " + name +
                ", momsName= " + momsName +
                ", dadsName='" + dadsName +
                ", grandDadName= " + grandDadName +
                ", grandMomName= " + grandMomName +
                ", greatGranddadName= " + greatGranddadName +
                ", greatGrandmomName= " + greatGrandmomName;
    }
}
