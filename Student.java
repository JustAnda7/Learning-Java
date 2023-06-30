public class Student {
    private String USN;
    private String Name;

    public Student(String usn, String name) {
        this.USN = usn;
        this.Name = name;
    }

    public String getUSN(){
        return this.USN;
    }

    public void setUSN(String USN) {
        this.USN = USN;
    }

    public String getName(){
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
