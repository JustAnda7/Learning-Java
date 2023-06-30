public class UGStudent extends Student {
    private int semester;
    private String branch;

    public UGStudent(String usn, String name, int sem, String bran){
        super(usn, name);
        semester = sem;
        branch = bran;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
