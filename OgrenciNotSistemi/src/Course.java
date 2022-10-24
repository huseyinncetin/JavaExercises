public class Course {
    Teacher courseTeacher;
    String name,code,prefix,Teacher;
    int note =0;
    int vNote=0;

    public Course(String name,String code,String prefix){
        this.name =name;
        this.code =code;
        this.prefix =prefix;
        this.note =0;
        this.vNote=0;
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher=t;
            System.out.println("İşlem Başarılı");
        }
        else
            System.out.println(t.name+"bu dersi veremez!!!");

    }
    public void printTeacher(){
        if(courseTeacher!=null)
            System.out.println(this.name+"dersinin akademisyeni"+courseTeacher.name);
        else
            System.out.println(this.name+"Derse akademisyen atanmamıştır.");

    }
}
