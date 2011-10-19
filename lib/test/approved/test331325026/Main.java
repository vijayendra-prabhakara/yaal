package approved.test331325026;

import net.egork.utils.test.Test;
import java.util.Collection;
import net.egork.utils.Exit;
import net.egork.utils.io.StreamInputReader;
import java.io.*;
import net.egork.utils.io.InputReader;
import net.egork.utils.Solver;
public class Main {
	public static void main(String[] args) {
		InputReader in;
		PrintWriter out;
		try {
			in = new StreamInputReader(new FileInputStream("input.txt"));
			out = new PrintWriter(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		run(in, out);
	}

	public static void run(InputReader in, PrintWriter out) {
		Solver solver = new TaskF();
		solver.solve(1, in, out);
		Exit.exit(in, out);
	}
}


class MainChecker {
	public static String check(InputReader input, InputReader expectedOutput, InputReader actualOutput) {
		return new TaskFChecker().check(input, expectedOutput, actualOutput);
	}

	public static Collection<Test> generateTests() {
		return new TaskFChecker().generateTests();
	}
}
