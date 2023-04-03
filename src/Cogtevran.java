class Cogtevran extends Hogvards {
    private int intelligent;
    private int wise;
    private int witty;
    private int creativity;

    public Cogtevran(String studentName, int magiсPower, int transgression) {
        super(studentName, magiсPower, transgression);
    }

    public Cogtevran(String studentName, int magiсPower, int transgression, int intelligent, int wise, int witty, int creativity) {
        super(studentName, magiсPower, transgression);
        this.intelligent = intelligent;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
    public String toString() {
        return super.toString()+  " ум-" + getIntelligent()+ " мудрость-" + getWise()+
                " остроумие-" + getWitty()+ " творчество-" +getCreativity();

    }
    public static void bestCogtevranStudent(Cogtevran student1, Cogtevran student2){
        int totalValue1 = student1.intelligent+student1.wise+student1.witty+student1.creativity;
        int totalValue2 = student2.intelligent+student2.wise+student2.witty+student2.creativity;
        if (totalValue1 > totalValue2){
            System.out.println(student1.getStudentName()+ " лучший Когтевранец чем "+student2.getStudentName());
        }else{
            System.out.println(student2.getStudentName()+ " лучший Когтевранец чем "+student1.getStudentName());
        }
    }
    public int getIntelligent() {
        return intelligent;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setIntelligent(int intelligent) {
        this.intelligent = intelligent;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
