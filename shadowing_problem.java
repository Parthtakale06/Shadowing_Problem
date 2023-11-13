class Student {
    
    int age;
    String name;
    
    public void setdata(int age ){
        this.age=age;     
    }
    
   
    public void show(){
        System.out.println(age);
    }
    
}



public class shadow  {
    public static void main(String[] args) {
        
        Student obj=new Student();
        Student obj1 =new Student();
     

    obj.setdata(age:19);
        obj1.setdata(age:15);
        obj.show();
        obj1.show();
        
        
        
        
        
    }
}