package ru.danilov.oop.homework.hw3;

public class Controller {
    private StudentGroupService studentGroupService;

    public static void main(String[] args) {


        Student student1 = new Student(01, "Иван", "Иванов", "Иванович");
        Student student2 = new Student(02, "Петр", "Петров", "Петрович");
        Student student3 = new Student(03, "Олге", "Сидоров", "Михайлович");
        Student student4 = new Student(04, "Виктор", "Васильев", "Васильевич");
        Student student5 = new Student(05, "Никита", "Михайлов", "Владимирович");
        Student student6 = new Student(06, "Захар", "Харитонов", "Захарович");

        StudentsGroup stream1Group1 = new StudentsGroup();
        stream1Group1.addStudent(student1);
        stream1Group1.addStudent(student2);
        StudentsGroup stream1Group2 = new StudentsGroup();
        stream1Group2.addStudent(student3);
        stream1Group2.addStudent(student4);

        StudentsGroup stream2Group1 = new StudentsGroup();
        stream2Group1.addStudent(student5);
        stream2Group1.addStudent(student6);
        StudentsGroup stream2Group2 = new StudentsGroup();
        stream2Group2.addStudent(student1);
        stream2Group2.addStudent(student2);
        StudentsGroup stream2Group3 = new StudentsGroup();
        stream2Group3.addStudent(student3);
        stream2Group3.addStudent(student4);

        Stream stream1 = new Stream();
        stream1.addStudentsGroup(stream1Group1);
        stream1.addStudentsGroup(stream1Group2);
        //System.out.println(stream1);
        System.out.println("На первом потоке: " + stream1.returnSizeGroups() + " группы");


        Stream stream2 = new Stream();
        stream2.addStudentsGroup(stream2Group1);
        stream2.addStudentsGroup(stream2Group2);
        stream2.addStudentsGroup(stream2Group3);
        //System.out.println(stream2);
        System.out.println("На втором потоке: " + stream2.returnSizeGroups() + " группы");


        StreamComparator one = new StreamComparator(stream1);
        StreamComparator two = new StreamComparator(stream2);
        System.out.println(one.compareTo(stream2));
        System.out.println(two.compareTo(stream1));
    }
}
