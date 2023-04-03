public class Main {
    static Gryffindor[] gryffindors=new Gryffindor[3];
    static Puffenduy[] puffenduys = new Puffenduy[3];
    static Cogtevran[] cogtevran = new Cogtevran[3];
    static Slizerin[] slizerins=new Slizerin[3];

    public static void main(String[] args) {
     Hogvards hermiona = new Gryffindor("Гермиона Грейнджер", 90, 80, 80, 90, 80);
     Hogvards garri = new Gryffindor("Гарри Поттер", 100, 100, 100, 100, 100);
     Hogvards ron = new Gryffindor("Рон Уизли", 70, 70, 70, 60, 80);
     Hogvards zaxary= new Puffenduy("Захария Смит", 90, 45, 30, 60, 20);
     Hogvards sedrik = new Puffenduy("Седрик Диггори", 50, 80, 70, 40, 40);
     Hogvards jastin = new Puffenduy("Джастин Финч-Флетчли.", 72, 45, 50, 23, 23);
     Hogvards chou= new Cogtevran("Чжоу Чанг", 90, 45, 30, 60, 20,21);
     Hogvards padma = new Cogtevran("Падма Патил", 56, 80, 70, 40, 40,45);
     Hogvards markus = new Cogtevran("Маркус Белби", 82, 55, 60, 33, 53,56);
     Hogvards drako= new Slizerin("Драко Малфой", 70, 45, 30, 60, 20,45,34);
     Hogvards grehem  = new Slizerin("Грэхэм Монтегю", 56, 80, 70, 40, 40,45,34);
     Hogvards gregori = new Slizerin("Грегори Гойл", 52, 55, 70, 33, 53,56,45);
        Hogvards.print(garri);
        Hogvards.print(padma);
        Hogvards.print(sedrik);
        Hogvards.print(drako);
        System.out.println("____________________________________________");
        Gryffindor.bestGryffindorStudent((Gryffindor) ron,(Gryffindor)hermiona);
        System.out.println("____________________________________________");
        Puffenduy.bestPuffenduyStudent((Puffenduy) sedrik,(Puffenduy)jastin);
        System.out.println("____________________________________________");
        Cogtevran.bestCogtevranStudent((Cogtevran) chou,(Cogtevran)markus);
        System.out.println("____________________________________________");
        Slizerin.bestSlizerinStudent((Slizerin) drako,(Slizerin)gregori);
        System.out.println("____________________________________________");
        Hogvards.bestHogvardsStudent(drako,garri);
    }


    }

