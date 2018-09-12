package lap02;

public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }
    public String getId() {
        return this.id;
    }

    public void setId(String ids) {
        this.id = ids;
    }
    public String getGroup() {
        return this.group;
    }

    public void setGroup(String gr) {
        this.group = gr;
    }
    public void setEmail(String em) {
        this.email = em;
    }
    public String getEmail() {
        return this.email;
    }


    Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";

    }

    Student(String n, String sid, String em) {
       setName(n);
       setId(sid);
       setGroup("INT22042");
       setEmail(em);

    }

    Student(Student s) {
       s.name = getName();
       s.id = getId();
       s.group = getGroup();
       s.email = getEmail();

    }

    String getInfo() {
        return (getName() + "\n" + getId() + "\n" + getGroup() + "\n" + getEmail() + "\n");
    }
}

