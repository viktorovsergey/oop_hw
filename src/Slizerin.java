class Slizerin extends Hogvards{
    private int cunning;
    private int determination;
    private int ambition;
    private int inventiveness;
    private int lustForPower;
    public Slizerin(String studentName, int magiсPower, int transgression) {
        super(studentName, magiсPower, transgression);
    }

    public Slizerin(String studentName, int magiсPower, int transgression, int cunning, int determination, int ambition, int inventiveness, int lustForPower) {
        super(studentName, magiсPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }
    public String toString() {
        return super.toString()+  " хитрость-" + getCunning()+ " решительность-" + getDetermination()+
                " амбициозность-" + getAmbition()+ " находчивость-" +getInventiveness()+ " жажда власти-"
                +getLustForPower();

    }
    public static void bestSlizerinStudent(Slizerin student1, Slizerin student2){
        int totalValue1 = student1.cunning+student1.determination+student1.ambition+student1.inventiveness+student1.lustForPower;
        int totalValue2 = student2.cunning + student2.determination + student2.ambition + student2.inventiveness + student2.lustForPower;
        if (totalValue1 > totalValue2){
            System.out.println(student1.getStudentName()+ " лучший Слизеринец чем "+student2.getStudentName());
        }else{
            System.out.println(student2.getStudentName()+ " лучший Слизеринец чем "+student1.getStudentName());
        }
    }
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setInventiveness(int inventiveness) {
        this.inventiveness = inventiveness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
