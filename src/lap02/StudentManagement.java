package lap02;

public class StudentManagement {


   /* Student[] students = new Student[100];

    public boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup() == s2.getGroup());
    }


    public void studentsByGroup() {
        String nameGroup1 = "INT22041";
        for (int i = 0; i <students.length ; i++) {
            if (students[i].getGroup() == nameGroup1 )
            {
                students[i].getInfo();
            }
            else
                remove(students[i].getId());

        }
    }

    public void remove(String id) {
        int dem = students.length ;
        int i;
        for (i = 0; i < dem; i++) {
            if (students[i].getId() == id)
            {
                break;
            }
        }
        if (i == dem) System.out.println("Không có sinh viên nào có trùng mã id");
        for (int j = i; j < dem - 1; j++)
        {
            students[j] = students[j + 1];
        }
        dem--;
    }
    */

    public static void main(String[] args) {
        Student sv1 = new Student("Long","17020869","17020869@vnu.edu.vn");
        Student sv2 = new Student(sv1);
        Student sv3 = new Student();

        System.out.println("Ten SV: Long");
        sv1.getInfo();
        sv2.getInfo();
        sv3.getInfo();


    }
}