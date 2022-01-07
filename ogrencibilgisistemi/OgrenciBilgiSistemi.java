package ogrencibilgisistemi;

public class OgrenciBilgiSistemi {

    public static void main(String[] args) {
    Course math = new Course("Mathematics","MAT101","MATH");
        Course econ = new Course ("Economy","ECON101","ECON");
        Course dataStruct = new Course("Data Structure","DT101","DT");

        Teacher mathInstructor = new Teacher("Archimedes", "..@math.com","MATH");
        Teacher econInstructor = new Teacher("W.Buffet","..@econ.com","ECON");
        Teacher dataStructInstructor = new Teacher("Alex","..@dt.com","DT");

        math.addTeacher(mathInstructor);
        econ.addTeacher(econInstructor);
        dataStruct.addTeacher(dataStructInstructor);

        Student s1 = new Student("Ziya",100,"188",math,econ,dataStruct);
        s1.addBulkExamNote(80,100,90);
        s1.isPass();

        Student  s2 = new Student ("Veli",100,"123",math,econ,dataStruct);
        s2.addBulkExamNote(80,90,80);
        s2.isPass();

        Student s3 = new Student("Sophia",100,"221",math,econ,dataStruct);
        s3.addBulkExamNote(10,41,12);
        s3.isPass();
    }

}
