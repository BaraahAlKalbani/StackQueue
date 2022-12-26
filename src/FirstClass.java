import java.util.*;

public class FirstClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Stack<String> aStack = new Stack<>();
//        aStack.add("first Plate");
//        aStack.add("second Plate");
//        aStack.add("third Plate");
//        aStack.add("forth Plate");
//        aStack.add("fifth Plate");
//        aStack.add("sixth Plate");
//
//        while (!aStack.empty()) {
//            System.out.println(aStack.pop());
//        }

        String expString = "}{int=2;}{}{";
        Stack<Character> stack1 = new Stack<>();
        boolean valid=scoop(expString, stack1);
        System.out.println( expString+" is valid:"+valid+"\n");
        
        if(valid)
        {
            while(!stack1.empty())
            System.out.print(stack1.pop());
        }
    }

    public static boolean scoop(String expString,Stack<Character> stack1) {
        char[] expArray = expString.toCharArray();
        int open = 0;
        int close = 0;
        for (char c : expArray) {
            if (c == ('{') && open >= close) {
                open++;
                stack1.push(c);
            } 
            
            
            if (c == '}') {
                close++;
                stack1.push(c);
            }
            else if (c != '}' && c != '{') {
                stack1.push(c);
            }
        }
        if (open == close) {
            return true;
        }
        return false;

    }
}
