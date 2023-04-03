import org.jetbrains.annotations.NotNull;

public class Hogvards {
    private String studentName;
    private int magiсPower;
    private int transgression;

    public Hogvards(String studentName, int magiсPower, int transgression) {
        this.studentName = studentName;
        this.magiсPower = magiсPower;
        this.transgression = transgression;
    }
    public static void bestHogvardsStudent(Hogvards student1, Hogvards student2){
        int totalValue1 = student1.magiсPower+student1.transgression;
        int totalValue2 = student2.magiсPower+student2.transgression;
        if (totalValue1 > totalValue2){
            System.out.println(student1.getStudentName()+ " лучший Хогвардец чем "+student2.getStudentName());
        }else{
            System.out.println(student2.getStudentName()+ " лучший Хогвардец чем "+student1.getStudentName());
        }
    }
    public static void print(Hogvards students) {
        System.out.println(students);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMagiсPower() {
        return magiсPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public String toString(){
        return getStudentName()+" мощьность колдовства-"+ getMagiсPower()+" трансгрессия-"+ getTransgression();
  }
}