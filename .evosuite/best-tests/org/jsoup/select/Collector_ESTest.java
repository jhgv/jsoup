/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 19 12:07:42 GMT 2018
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Element;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Collector_ESTest extends Collector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Elements elements0 = Collector.collect((Evaluator) null, (Element) null);
      assertTrue(elements0.isEmpty());
  }
}
