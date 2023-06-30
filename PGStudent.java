public class PGStudent extends Student {
    private String specialization;
    private String pgDegree;

    public PGStudent(String usn, String name, String special, String pgDeg){
        super(usn, name);
        specialization = special;
        pgDegree = pgDeg;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPgDegree() {
        return pgDegree;
    }

    public void setPgDegree(String pgDegree) {
        this.pgDegree = pgDegree;
    }
}
