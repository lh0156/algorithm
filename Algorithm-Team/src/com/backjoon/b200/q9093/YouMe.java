package com.backjoon.b200.q9093;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class YouMe {
	/*
		문장이 주어졌을 때 단어를 모두 뒤집어서 출력하는 프로그램 작성
		
		설계
		1. 필드에서 Scanner, Stack<Character> 객체 생성
		2. case 변수 선언 후 입력 값으로 초기화함.
		3. for문 case 반복
			> nextLine으로 입력 받은 문자열을 input 변수에 초기화함.
			> input을 매개로 setSentence 호출
			> reverse() 호출
		4. setSentence 메소드
			> for문 input의 길이만큼 반복
				> i 번째 글자를 stack에 저장.
		5. reverse() 호출
			> while문 stack이 안 비어있는지?
				> print로 stack.pop 출력  
	 */
	private static BufferedReader reader;
	
	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static void main(String[] args) throws Exception {
		int num = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<num; i++) {
			String input = reader.readLine();
			reverse(input);
		}
	}

	private static void reverse(String input) {
		Stack<Character> stack = new Stack<>();
		
		for (int i=0; i<input.length(); i++){
			stack.push(input.charAt(i));
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		System.out.println();
	}
}