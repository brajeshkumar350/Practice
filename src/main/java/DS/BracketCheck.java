package DS;

import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {

          String str="[()]{}{[()()]()}}";
          boolean check=false;
          Stack<String> stack=new Stack<>();
          for (int i = 0; i <str.length(); i++)
          { String c=""+str.charAt(i); if(c.equals(")")
          ||c.equals("}") ||c.equals("]")) { String s=stack.pop(); if(c.equals(")")) {
          if(s.equals("(")) check=true;

          } if(c.equals("}")) { if(s.equals("{")) check=true;

          } if(c.equals("]")) { if(s.equals("[")) check=true;

          }

          } else { stack.push(c); } } System.out.println(check);

    }
}
