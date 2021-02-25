package ffs.hashcode2021.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import ffs.hashcode2021.beans.InputFile;
import ffs.hashcode2021.beans.OutputFile;

public class FileParser_Zaki {

	// {1} Sample Read Input File Into InputObject
	public static InputFile readInput() {
		InputFile inObj = new InputFile();
		String ln;
		try {
			FileReader f = new FileReader("TestCases/testcase.txt");
			BufferedReader r = new BufferedReader(f);

			// sample parse line values separated by space
			ln = r.readLine();
			inObj.setX1(Integer.parseInt(ln.split(" ")[0]));
			inObj.setX2(Integer.parseInt(ln.split(" ")[1]));

			// sample parse line contain one value
			int n = Integer.parseInt(r.readLine());
			inObj.setN(n);

			// sample parse N line , and each line contain two values separated by space
			Map<Integer, Integer> nMap = new HashMap<>();
			for (int i = 0; i < n; i++) {
				ln = r.readLine();
				nMap.put(Integer.parseInt(ln.split(" ")[0]), Integer.parseInt(ln.split(" ")[1]));
			}
			inObj.setnMap(nMap);

			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inObj;
	}

	// {3} Sample Write output to file
	public static void writeOutput(OutputFile solution) {

		try {
			FileWriter f = new FileWriter("Output/testcase_out.txt", false);
			BufferedWriter w = new BufferedWriter(f);

			w.write(solution.getY1() + " " + solution.getY2());
			w.newLine();
			w.write(String.valueOf(solution.getN()));

			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
