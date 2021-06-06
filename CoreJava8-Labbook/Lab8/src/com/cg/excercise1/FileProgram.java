package com.cg.excercise1;

import java.io.File;

public class FileProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File sb_source=new File("F:\\Capgemini Exceller SW\\Sprint 1 resources\\Lab Books\\Lab8\\src\\com\\cg\\excercise1\\source.txt");
		File sb_target=new File("F:\\Capgemini Exceller SW\\Sprint 1 resources\\Lab Books\\Lab8\\src\\com\\cg\\excercise1\\target.txt");
		CopyDataThread cdt = new CopyDataThread(sb_source,sb_target);
		cdt.start();
	}

}
