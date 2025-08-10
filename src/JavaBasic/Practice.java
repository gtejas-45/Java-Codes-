package JavaBasic;

public class Practice {
        public static void main(String[] args) {
            int num = 12;//local variable declartion
            System.out.println(num);// calling local
            System.out.println(Variable.num);//calling static by class name
            Variable obj = new Variable();//calling instance variable by creating obj
            System.out.println(obj.name);
        }
    }

