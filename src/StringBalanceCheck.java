import java.util.Scanner;
import java.util.Stack;

public class StringBalanceCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
	
		boolean res = checkBalance(str);
		System.out.println(res);
		
	}

	public static boolean checkBalance(String str) {
		if (str.length()%2==1)
		return false;
		
		Stack<Character> stk = new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='{'||ch=='['||ch=='(')
				stk.push(ch);
			else {
				if(stk.size()==0) return false;
				switch(ch) {
					case '}':if(stk.pop()!='{') return false;
								break;
					case ']':if(stk.pop()!='[') return false;
								break;
					case ')':if(stk.pop()!='(') return false;
								break;
					
			}
		}
	}
		return stk.size()==0;
}
}