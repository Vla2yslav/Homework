package module3.task3;

import java.util.Date;
public class Solution {
    Course Course1 = new Course("Jack", 32, "Ann");
    Course Course2 = new Course("Bob", 16, "Jenny");
    Course Course3 = new Course("Paul", 42, "Kenny");
    Course Course4 = new Course(new Date(), "Braid");
    Course Course5 = new Course(new Date(7428263382468L),"Sonya");
    Student Student1 = new Student("Vlad","Len'",2);
    Student Student2 = new Student("Oly",new Course[3]);
    CollegeStudent Student3 = new CollegeStudent("Bob", "Dealan", 3,"KKTE", 7, 975453);
    CollegeStudent Student4 = new CollegeStudent("Wein",new Course[3]);
    CollegeStudent Student5 = new CollegeStudent("Naoko","Oonishi",2);
    SpecialStudent Student6 = new SpecialStudent("Naoko","Oonishi",2,347235, "key@mail");
    SpecialStudent Student7 = new SpecialStudent("Creig",new Course[1]);
    SpecialStudent Student8 = new SpecialStudent("Diego", "Campos", 2);
}

