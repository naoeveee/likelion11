public class ex2 {
    public static void main(String[]args){
        final int NUM_1 = 169;
        final int NUM_2 = 4;
        char op = '/';

        switch(op){
            case '+':
                System.out.println(NUM_1 + " + " +NUM_2 + " = " +(NUM_1+NUM_2));
                break;
            case '-':
                System.out.println(NUM_1 + " - " +NUM_2 + " = " +(NUM_1-NUM_2));
                break;
            case '*':
                System.out.println(NUM_1 + " * " +NUM_2 + " = " +(NUM_1*NUM_2));
                break;
            case '%':
                System.out.println(NUM_1 + " % " +NUM_2 + " = " +(NUM_1%NUM_2));
                break;
            case '/':
                System.out.println(NUM_1 + " 나누기 " +NUM_2 + "는 " +((double)NUM_1/NUM_2));
        }

    }
}
