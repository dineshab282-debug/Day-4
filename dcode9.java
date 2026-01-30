class Student {
    int id;
    String name;
    int age;
    Student(int a,String b,int c){
        id=a;
        name=b;
        age=c;
        System.out.println(id+name+age);
    }
    Student(int a,int b){
        id=a;
        age=b;
        System.out.println(id+age);
    }
    
}
class dcode9{
    public static void main(String[] args) {
        Student S1=new Student(1,"pari",20);
        Student S2=new Student(2,30);
    }
}

