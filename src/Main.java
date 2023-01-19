import student.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student(1999,"Asan ","Tairov ","asantairov@gmail.com");
        Student studen=new Student(2000,"Bakyt ","Latibov ","latibov@gmail.com");
        Student students=new Student(1997,"Kumar ","Kumarov ","kumar@gmail.com");
        Student stude=new Student(1998,"Sultan ","Aliev ","sultan@gmail.com");
        System.out.println(student.toString());
        System.out.println(studen.toString());
        System.out.println(students.toString());
        System.out.println(stude.toString());


        
        System.out.println();

        Gruoppa gruoppa=new Gruoppa(new String[]{"java5 "},"java ","05.12");
        Gruoppa gruopp2=new Gruoppa(new String[]{"java2 "},"java ","01.03");
        Gruoppa gruopp3=new Gruoppa(new String[]{"java3 "},"java ","01.06");
        Gruoppa gruopp4=new Gruoppa(new String[]{"java4 "},"java ","01.09");
        System.out.println(gruoppa.toString());
        System.out.println(gruopp2.toString());
        System.out.println(gruopp3.toString());
        System.out.println(gruopp4.toString());

        System.out.println();

        Kurs kurs = new Kurs("IT ",2023 ,"Meder ",new String[]{"java5"});
        Kurs kurs2 = new Kurs("IT",2022 ,"Timurlan ",new String[]{"java4"});
        System.out.println(kurs.toString());
        System.out.println(kurs2.toString());



    }
}