public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    int classes;
    boolean isPass;
    double avarage;

    public Student(Course c1, Course c2, Course c3, String name, String stuNo, int classes) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.isPass = false;
        this.avarage = 0.0;
    }

    void student(){
        System.out.println("Adı : " + this.name);
        System.out.println("Öğrenci No : " + this.stuNo);
        System.out.println("Sınıfı : " + this.classes);

    }
    void addBulkExamNote(int note1,int note2,int note3){
        if (note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
    }

    void printNote(){
        System.out.println(this.c1.name + "Notu : " + this.c1.note);
        System.out.println(this.c2.name + "Notu : " + this.c2.note);
        System.out.println(this.c3.name + "Notu : " + this.c3.note);

    }

    void avarageInfo(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        System.out.println( "Ortalaması : " + this.avarage);
    }

    void isPass(){
        avarageInfo();
        if (this.avarage >= 50){
            System.out.println("Sınıfı Geçti!");
        }else {
            System.out.println("Sınıfta kaldı!");
        }
        student();
        printNote();

    }
}
