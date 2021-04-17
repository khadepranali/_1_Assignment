package _1_Assignments;

public class EducationSystem {
    public static void main(String arg[])
    {
        Graduaction gd=new Graduaction();
        gd.streams();
        gd.ageCritera();
        gd.hscPercentage();

        Engineering eg=new Engineering();
        eg.streams();
        eg.typeOfEngineering();

        ComputerScienceEngg cse=new ComputerScienceEngg();
        cse.hscPercentage();
        cse.subjects();
    }
}
