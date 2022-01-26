import java.util.Stack;
class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        int n = S.length();
        for(int i=0; i<n; i++){
            char ch = S.charAt(i);
            if(ch=='+' || ch == '-' || ch == '/' || ch == '*'){
                int val2 = st.pop();
                int val1 = st.pop();
                int ans = operate(val1, val2, ch);
                st.push(ans);
            }else{
                int val = ch - '0';
                st.push(val);
            }
        }
        return st.pop();
    }
    public static int operate(int a, int b, char op){
        if(op == '+'){
            return a+b;
        }else if(op == '-'){
            return a-b;
        }else if(op == '*'){
            return a*b;
        }
        
        return a/b;
    }
}