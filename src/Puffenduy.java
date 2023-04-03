class Puffenduy extends Hogvards {
    private int hardworking;
    private int loyal;
    private int honest;
    public Puffenduy(String studentName, int magiсPower, int transgression) {
        super(studentName, magiсPower, transgression);
    }

    public Puffenduy(String studentName, int magiсPower, int transgression, int hardworking, int loyal, int honest) {
        super(studentName, magiсPower, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public String toString() {
        return super.toString()+  " трудолюбие-" + getHardworking()+
                " верность-" + getLoyal()+ " честность-" + getHonest();

    }
    public static void bestPuffenduyStudent(Puffenduy student1, Puffenduy student2){
        int totalValue1 = student1.hardworking+student1.loyal+student1.honest;
        int totalValue2 = student2.hardworking+student2.loyal+student2.honest;
        if (totalValue1 > totalValue2){
            System.out.println(student1.getStudentName()+ " лучший Пуффендуец чем "+student2.getStudentName());
        }else{
            System.out.println(student2.getStudentName()+ " лучший Пуффендуец чем "+student1.getStudentName());
        }
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

}
