package javamaster.six;

public class Shape {
        int a;
        public static int b=0;
        public static String name;

        public Shape(){}
        public Shape(String name){
            Shape.name = name;
        }

        public void printStaticName(){
            System.out.println("name = " + name);
        }

        public void setA(int a){
            this.a = a;
        }

}

