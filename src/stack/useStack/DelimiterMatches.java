/*author:lxrm
 * date:2016/07/25
 * function:对于字符串进行检查，如果字符串中的分隔符不能够完全匹配，则报错
 * 			左分隔符有‘{’、‘[’、‘(’    右分隔符有 } ] )
 * 			例如  3*[tmp}   对这个字符串进行“分隔符匹配检查” 的结果就应该是“not matched separator”
 * 实现思路：对字符串中字符进行逐个检查，发现左分隔符时就压入栈中，发现右分隔符时就与栈顶元素相比较，
 * 			若匹配，则将栈顶元素删除，若不匹配，则报错
 * 			字符串检查完毕，若栈中还有元素剩余，也报错,说明有剩余的左分隔符没有匹配的对象*/
package stack.useStack;

import stack.array_to_stack.CharStack;

public class DelimiterMatches {
	public boolean check(String s){
		char[] stringArray=s.toCharArray();
		CharStack stack=new CharStack(s.length());//栈，用于存放字符串中的左分隔符
		for(int i=0;i<s.length();i++){
			switch(stringArray[i]){
				case '{':
				case '[':
				case '(':
					stack.push(stringArray[i]);
					break;
				case '}':
				case ']':
				case ')':
					if(this.matching(stack.peek(),stringArray[i])){
						stack.pop();
						break;
					}else{
						System.out.println("该字符串中的分隔符不匹配,error at string s["+i+"]:"+stringArray[i]+"没有匹配的符号");
						return false;
					}
				default:
					break;
			}
		}
		if(!stack.isEmpty()){
			System.out.println("该字符串中的分隔符不匹配");
			int l=stack.length();
			for(int j=0;j<l;j++){
				System.out.println("不匹配的符号"+stack.peek());
			}
			return false;
		}else{
			System.out.println("该字符串中的分隔符匹配正确");
			return true;
		}
	}
	public boolean matching(char a,char b){
		switch(a){
			case '{':
				return b=='}'?true:false;
			case '[':
				return b==']'?true:false;
			case '(':
				return b==')'?true:false;
			default:
				return false;
		}
	}
}
