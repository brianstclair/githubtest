package moduleA;

import static org.junit.Assert.assertTrue;

import java.io.PrintStream;

public class ClassOneTest {

  public void testOutput() throws Exception {
    ClassOne classOne = new ClassOne();
    PrintStream out = System.out;
    classOne.write(out, "hi");
    assertTrue(true);
  }
}
