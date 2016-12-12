/*author:lxrm
 * date:2016/07/25
 * function:�����ַ������м�飬����ַ����еķָ������ܹ���ȫƥ�䣬�򱨴�
 * 			��ָ����С�{������[������(��    �ҷָ����� } ] )
 * 			����  3*[tmp}   ������ַ������С��ָ���ƥ���顱 �Ľ����Ӧ���ǡ�not matched separator��
 * ʵ��˼·�����ַ������ַ����������飬������ָ���ʱ��ѹ��ջ�У������ҷָ���ʱ����ջ��Ԫ����Ƚϣ�
 * 			��ƥ�䣬��ջ��Ԫ��ɾ��������ƥ�䣬�򱨴�
 * 			�ַ��������ϣ���ջ�л���Ԫ��ʣ�࣬Ҳ����,˵����ʣ�����ָ���û��ƥ��Ķ���*/
package stack.useStack;

import stack.array_to_stack.CharStack;

public class DelimiterMatches {
	public boolean check(String s){
		char[] stringArray=s.toCharArray();
		CharStack stack=new CharStack(s.length());//ջ�����ڴ���ַ����е���ָ���
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
						System.out.println("���ַ����еķָ�����ƥ��,error at string s["+i+"]:"+stringArray[i]+"û��ƥ��ķ���");
						return false;
					}
				default:
					break;
			}
		}
		if(!stack.isEmpty()){
			System.out.println("���ַ����еķָ�����ƥ��");
			int l=stack.length();
			for(int j=0;j<l;j++){
				System.out.println("��ƥ��ķ���"+stack.peek());
			}
			return false;
		}else{
			System.out.println("���ַ����еķָ���ƥ����ȷ");
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
