package on2014_06.on2014_06_28_Addepar_Hackathon.Yaxis;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2014_06/on2014_06_28_Addepar_Hackathon/Yaxis/Yaxis.task"))
			Assert.fail();
	}
}
