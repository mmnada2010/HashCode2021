package ffs.hashcode2021;

import ffs.hashcode2021.beans.InputFile;
import ffs.hashcode2021.beans.OutputFile;
import ffs.hashcode2021.services.FileParser_Zaki;
import ffs.hashcode2021.services.Solution_Main;

public class Main {

	public static void main(String[] args) {

		InputFile testcase = FileParser_Zaki.readInput();
		OutputFile solution = Solution_Main.solve(testcase);
		FileParser_Zaki.writeOutput(solution);
	}

	

}
