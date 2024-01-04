
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("İlber Ortaylı","555","TRH");
        Teacher t2 = new Teacher("Newton","552","FZK");
        Teacher t3 = new Teacher("Darwin","531","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        Course fizik = new Course("Fizik","101","FZK");
        Course biyoloji = new Course("Biyoloji","101","BIO");


        Student s1 = new Student(tarih,fizik,biyoloji,"Ali Paşa","123",3);
        s1.addBulkExamNote(100,100,40);
        s1.isPass();

        Student s2 = new Student(tarih,fizik,biyoloji,"Ali","1234",3);
        s2.addBulkExamNote(20,30,50);
        s2.isPass();


    }
}