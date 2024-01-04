public class Teacher {
    String name;
    String tel;
    String branch;

    Teacher(String name, String tel, String branch){
        this.name = name;
        this.tel = tel;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.tel);
        System.out.println("Bölümü : " + this.branch);
    }
}
