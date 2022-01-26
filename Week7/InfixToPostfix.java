// { Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    class GFG {
        
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0){
                System.out.println(new Solution().infixToPostfix(br.readLine().trim()));
            }
        }
    }// } Driver Code Ends
    
    
    class Solution
    {
        //Function to convert an infix expression to a postfix expression.
        public static String infixToPostfix(String exp) 
        {
            // Your code here
            Stack<String> post = new Stack<>();
            Stack<Character> op = new Stack<>();
            
            int n = exp.length();
            for(int i=0; i<n; i++){
                char ch = exp.charAt(i);
                if(ch == '('){
                    op.push(ch);
                }else if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')){
                    post.push(ch+"");
                }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^'){
                    while(op.size() > 0 && op.peek()!='(' && precedence(ch) <= precedence(op.peek())){
                        String v2 = post.pop();
                        String v1 = post.pop();
                        char opr = op.pop();
                        String postv = v1+v2+opr;
                        post.push(postv);
                        
                    }
                    op.push(ch);
                }else if(ch == ')'){
                    while(op.peek()!='('){
                        String v2 = post.pop();
                        String v1 = post.pop();
                        char opr = op.pop();
                        String postv = v1+v2+opr;
                        post.push(postv);
                    }
                    op.pop();
                }
            }
            while(op.size()>0){
                String v2 = post.pop();
                String v1 = post.pop();
                char opr = op.pop();
                String postv = v1+v2+opr;
                post.push(postv);
            }
            
            return post.pop();
            
        } 
        public static int precedence(char ch){
            if(ch == '+' || ch == '-'){
                return 1;
            }else if(ch == '*' || ch == '/'){
                return 2;
            }else{
                return 3;
            }
        }
    
    }