public class Student {
    String name;
    String studentNumber;
    int classes;
    double avg;
    boolean isPass;
    Course mat, fizik, kimya;

    Student(String name, int classes, String studentNumber, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.studentNumber = studentNumber;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat,int matvNote,int fizik,int fizikvNote,int kimya,int kimyavNote) {
        if (mat >= 0 && mat <= 100){
            this.mat.note = mat;
            this.mat.vNote =matvNote;
        }
        if (fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
            this.fizik.vNote =fizikvNote;
        }
        if (kimya >= 0 && kimya <= 100){
            this.kimya.note = kimya;
            this.kimya.vNote =kimyavNote;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.kimya.note == 0 || this.fizik.note == 0) {
            System.out.println("Notlar tam girilmemiş");
        } else
            this.isPass = isCheckPass();
        printNote();
        System.out.println("Ortalama : " + this.avg);
        if (this.isPass) {
            System.out.println("Sınıfı Geçti. ");
        } else {
            System.out.println("Sınıfta Kaldı.");
        }
    }
    public void calcAvarage(){
        this.avg = ((this.mat.note*0.80+this.mat.vNote*0.20)+(this.kimya.note*0.80+this.kimya.vNote*0.20)+(this.fizik.note*0.80+this.fizik.vNote*0.20)) / 3;

    }
    public boolean isCheckPass(){
        calcAvarage();
        return this.avg > 55;

    }
    public void printNote(){
        System.out.println("=======================");
        System.out.println("Öğrenci "+this.name);
        System.out.println("Matematik Notu : "+this.mat.note);
        System.out.println("Matematik Sözlü Notu : "+this.mat.vNote);
        System.out.println("Fizik Notu : "+this.fizik.note);
        System.out.println("Fizik Sözlü Notu : "+this.fizik.vNote);
        System.out.println("Kimya Notu : "+this.kimya.note);
        System.out.println("Kimya Sözlü Notu : "+this.kimya.vNote);
    }
}
