public class Employee {
    String name;
    int salary,workHours,hireYear;
    int taxDept;
    public Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.taxDept=0;
    }

    public int tax(){
        if(this.salary>1000){
            taxDept= (this.salary*3)/100;
        }
        return taxDept;
    }

    public int bonus(){
        int bonusMoney=0;
        if(this.workHours>40){
            bonusMoney=(this.workHours-40)*30;
        }
        return bonusMoney;
    }

    public int raiseSalary(){
        int year=2021;
        int workYear=year - this.hireYear;
        int raise =0;
        if(workYear>19){
             raise =(this.salary*15)/100;
        }

        else if(workYear<10){
            raise=(this.salary*5)/100;
        }

        else if(workYear>9 && workYear<20){
            raise=(this.salary*10)/100;
        }
        return raise;
    }

    public int net(){
       int net = brut()-tax();
       return  net;
    }

    public int brut(){
        int brut =this.salary + bonus() + raiseSalary();
        return brut;
    }

    public void toPrint(){
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş Artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+net());
        System.out.println("Toplam Maaş : "+brut());
    }

}
