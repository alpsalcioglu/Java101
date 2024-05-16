public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Prof. Mahmut","555","HST");
        Teacher t2 = new Teacher("Prof. Graham","0000","PHYS");
        Teacher t3 = new Teacher("Prof. Alp","2566","BIO");

        Course history = new Course("History","101","HST");
        history.addTeacher(t1);

        Course physics = new Course("Physics","102","PHYS");
        physics.addTeacher(t2);

        Course biology = new Course("Biology","101","BIO");
        biology.addTeacher(t3);

        Student s1 = new Student("Jack","123","4",history,physics,biology);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Mark","223","4",history,physics,biology);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();

    }
}