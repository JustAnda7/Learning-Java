public class PGStudent extends Student {
    private String specialization;
    private final String ugDegree;

    public PGStudent(String usn, String name, String special, String pgDeg){
        super(usn, name);
        specialization = special;
        ugDegree = pgDeg;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getugDegree() {
        return ugDegree;
    }

    public void setugDegree(String pgDegree) {
        System.out.println("UG Degree can only be set once!!");
    }
}
