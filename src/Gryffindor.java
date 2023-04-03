 public class Gryffindor extends Hogvards {
     private int nobility;
     private int honor;
     private int bravery;

     public Gryffindor(String studentName, int magiсPower, int transgression, int nobility, int honor, int bravery) {
         super(studentName, magiсPower, transgression);
         this.nobility = nobility;
         this.honor = honor;
         this.bravery = bravery;
     }
         public String toString() {
         return super.toString()+  " благородство-" + getBravery()+
                 " честь-" + getHonor()+ " храбрость-" + getNobility();
     }
     public static void bestGryffindorStudent(Gryffindor student1, Gryffindor student2){
         int totalValue1 = student1.nobility+student1.honor+student1.bravery;
         int totalValue2 = student2.nobility+student2.honor+student2.bravery;
         if (totalValue1 > totalValue2){
             System.out.println(student1.getStudentName()+ " лучший Гриффиндорец чем "+student2.getStudentName());
         }else{
             System.out.println(student2.getStudentName()+ " лучший Гриффиндорец чем "+student1.getStudentName());
         }
     }
     public int getNobility() {
         return nobility;
     }

     public int getHonor() {
         return honor;
     }

     public int getBravery() {
         return bravery;
     }

     public void setNobility(int nobility) {
         this.nobility = nobility;
     }

     public void setHonor(int honor) {
         this.honor = honor;
     }

     public void setBravery(int bravery) {
         this.bravery = bravery;
     }


 }

