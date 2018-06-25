package com.example.demo;

class Main{

    public void add(OnAddListener listener,int a ,int b) {
    	
	}
}

interface OnAddListener{
	void onSuccess(int result);

}

public class Calculator implements OnAddListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		calculator.start();
	}

	private void start() {
		Main main = new Main();
		main.add(this, 1, 2);
	}
	@Override
	public void onSuccess(int result) {

		System.out.println("xxx="+result);
	}

}
