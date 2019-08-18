public class Array{

    public static void main(String[] args){
        Student [] student = new Student[3];
        student[0] = new Student(1, "Abdelaziz");
        student[1] = new Student(2, "Hakim");
        student[2] = new Student(3, "Bilal");
        for (Student var : student)
            System.out.println(var.name+" "+var.id);
    }
}