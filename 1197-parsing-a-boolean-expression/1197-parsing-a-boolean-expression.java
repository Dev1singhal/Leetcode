class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == ',') {
                continue;
            }
            if (ch != ')') {
                st.push(ch); 
            } else {
                Stack<Character> word = new Stack<>();
                while (st.peek() != '(') {
                    word.push(st.pop());
                }
                st.pop();
                char operator = st.pop();
                char result = evaluateExpression(operator, word);
                
                st.push(result);
            }
        }
        
        return st.pop() == 't';
    }
    
    private char evaluateExpression(char operator, Stack<Character> word) {
        if (operator == '!') {
            return word.pop() == 't' ? 'f' : 't';
        } else if (operator == '&') {
            while (!word.isEmpty()) {
                if (word.pop() == 'f') {
                    return 'f';
                }
            }
            return 't'; // All are true
        } else { // operator == '|'
            while (!word.isEmpty()) {
                if (word.pop() == 't') {
                    return 't';
                }
            }
            return 'f';
        }
    }
}
