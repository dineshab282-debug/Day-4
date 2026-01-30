 class Student {
    int id;
    String name;
    Student(int i,String name){
        id=i;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
class dcode8{
    public static void main(String[] args){
        Student S1=new Student(1,"mullah khan");
        Student S2=new Student(2,"karthikeyan");
        S1.display();
        S2.display();
    }
}
