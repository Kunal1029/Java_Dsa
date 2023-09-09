// package studenttest;

class Student{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    
    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        if(average()>=60)
            return 'A';
        else
            return 'B';
    }
    public String details()
    {
        return "Roll num: "+roll+"\n"+"Name : "+name+"\n"+"Course : "+ course+"\n";
    }
}

public class StudentTest {

    public static void main(String[] args) {
        Student st = new Student();
        st.roll=2;
        st.name="kunal";
        st.course="Btech";
        st.m1=90;
        st.m2=95;
        st.m3=99;
        System.out.println("Total " + st.total());
        System.out.println("Total " + st.average());
        System.out.println("Total " + st.grade()); 
        System.out.println("Total " + st.details());

    }
    
}
