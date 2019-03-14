package love.programming;

public class MethodOverloading {

    public static void main(String[] args) {


        MethodOverloading mymethod = new MethodOverloading();

        System.out.println(mymethod.addition(2,3));
        System.out.println(mymethod.addition(3,5,7));
        System.out.println(mymethod.multiply(5,6,7,9));
        System.out.println(mymethod.addition1(4,5));
        System.out.println(mymethod.addition2(3,6,9,12));
        System.out.println(mymethod.add("Kaly",6));


    }
        public String add(String a, int b){
            return(a+b);
        }


        public int addition ( int a, int b){
            return (a + b);

        }


        public int addition ( int a, int b, int c){

            return (a + b + c);

        }

        public int multiply ( int a, int b, int c, int d){

            return (a * b * c * d);

        }

        public int addition1 ( int a, int d){
            return (a / d);
        }

        public int addition2 ( int a, int b, int c, int d){
            return (a * b + c / d);


        }

    }


