public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix ) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }

    void addTeacher(Teacher teacher){

        if (teacher.branch.equals(this.prefix)){
            System.out.println("Öğretmen eklendi : " + this.name);
            this.teacher = teacher;
            System.out.println("Öğretmen Bilgileri : ");
            printTeacher();
        }else {
            System.out.println("Hoca ders için uygun değil.");
        }



    }

    void printTeacher(){
        this.teacher.print();
    }
}
