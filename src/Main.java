import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Calc calcObj = new Calc();
        if (calcObj.position == Calc.Positions.On) {
            if (calcObj.chargeLevel < 2) { // It would be nice to recharge a little
                while (calcObj.chargeLevel < 10) {
                    calcObj.addCharge();}
            }
            calcObj.calcM();
        }
        else{
            calcObj.turnOn();
            calcObj.calcM();
        }
        fLevel();
    }

    public static void fLevel() {
        String inputString = "22((2(3)))";
        int depth = 0;
        int maxDepth = 0;
        int i=0;
        while (i<inputString.length()){
           if (inputString.charAt(i)=='('){depth++;}
           if (inputString.charAt(i)==')'){depth--;}
           if (depth<0){ System.out.println("Syntax error");return;}
           i++;
           if (depth>maxDepth){maxDepth=depth;}
        }
        if (depth!=0){ System.out.println("Syntax error");return;}
        System.out.println("Input string: " + inputString);
        System.out.println("Depth: " + maxDepth);
    }

}


