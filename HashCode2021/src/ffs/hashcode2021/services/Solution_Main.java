package ffs.hashcode2021.services;

import ffs.hashcode2021.beans.InputFile;
import ffs.hashcode2021.beans.OutputFile;

public class Solution_Main {

	// {2} Main method for solution
	public static OutputFile solve(InputFile testcase) {

		OutputFile o = new OutputFile();
		o.setN(testcase.getN() * 2);

		o.setY1(testcase.getX1() * 2);
		o.setY2(testcase.getX2() * 2);

		return o;
	}
}
