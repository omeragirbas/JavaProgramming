package day35_Encapsulation.encapsulation;

public class Person {
        private String name;
        private int age;

        public String getName(){
            return name;  //getter
        }
        public void setName(String name){
            this.name=name; //setter

        }

        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age=age;
        }

}

