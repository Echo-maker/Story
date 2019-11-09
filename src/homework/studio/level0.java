package homework.studio;
class Student{
    private String name;
    private int age;
    private String gender;
    private int number;

    public void introduce(){
        System.out.println("大家好，我的名字叫"+this.getName()+",我是一个活泼可爱的"+this.getAge()+"岁的"+this.getGender()+",我的学号是"+this.getNumber());
    }
    public Student(String name,int age,String gender,int number){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setNumber(number);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public int getNumber(){
        return number;
    }
    public void setName(String a){
        name = a;
    }
    public void setAge(int b){
        age = b;
    }
    public void setGender(String c){
        gender = c;
    }
    public void setNumber(int d){
        number = d;
    }
}


public class level0 {
    public static void main(String[] args){
        Student chj = new Student("陈泓静",18,"女生",2019210902);
        chj.introduce();
    }
}
