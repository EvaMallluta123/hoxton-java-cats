import java.text.Format;

public class Cat{
  
        public String name;
        public Integer age;
        public Boolean likesCuddles;


       public Cat (String name,Integer age, Boolean likeCuddles){
        this.name=name;
        this.age=age;
        this.likesCuddles=false;

       }
               // Integer age= 4;
        // Boolean likesCuddles= false;
   public String myMethod() {
       return String.format(format:"This is %s who is  year(s) old. Oliver like cuddles!", this.name, this.age, this.likesCuddles);
} 
public void Method(){
System.out.println(myMethod());
}
public String toString(){
    return String.format(format:"{name: \"%s\" ,age: \"%s\" , likesCuddles:\"%s\"} " , this.name, this.age ,this.likesCuddles);
}
}