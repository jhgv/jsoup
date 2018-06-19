/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 19 12:03:19 GMT 2018
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Attribute_ESTest extends Attribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attribute attribute0 = new Attribute("allowfullscreen", "allowfullscreen");
      String string0 = attribute0.toString();
      assertEquals("allowfullscreen", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("4wR>bH3~T#OT", "org.jsoup.nodes.Element");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      boolean boolean0 = attribute0.shouldCollapseAttribute(document_OutputSettings0);
      assertFalse(boolean0);
      assertEquals("org.jsoup.nodes.Element", attribute0.getValue());
      assertEquals("4wr>bh3~t#ot", attribute0.getKey());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attribute attribute0 = new Attribute("C2$;>:`f@L", "");
      String string0 = attribute0.setValue("C2$;>:`f@L");
      assertEquals("", string0);
      assertEquals("C2$;>:`f@L", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("5n\"X%0N`@Qx)Et8ma", "");
      String string0 = attribute0.getValue();
      assertEquals("5n\"x%0n`@qx)et8ma", attribute0.getKey());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attribute attribute0 = new Attribute(", n1_2,p/B)[", ", n1_2,p/B)[");
      // Undeclared exception!
      try { 
        attribute0.shouldCollapseAttribute((Document.OutputSettings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("iX ", "iX ");
      // Undeclared exception!
      try { 
        attribute0.setValue((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("xhtml", "");
      // Undeclared exception!
      try { 
        attribute0.setKey("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("vK'?dS", "vK'?dS");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        attribute0.html((StringBuilder) null, document_OutputSettings0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Attribute attribute0 = null;
      try {
        attribute0 = new Attribute((String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("iD `/5p;6DnR%-z", "iD `/5p;6DnR%-z");
      attribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("4wR>bH3~T#OT", "org.jsoup.nodes.Element");
      Attribute attribute1 = attribute0.clone();
      assertEquals("4wr>bh3~t#ot", attribute1.getKey());
      
      attribute1.setKey("7(~w}Qh}_");
      boolean boolean0 = attribute0.equals(attribute1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("4wR>bH3~T#OT", "org.jsoup.nodes.Element");
      boolean boolean0 = attribute0.equals(attribute0);
      assertEquals("4wr>bh3~t#ot", attribute0.getKey());
      assertEquals("org.jsoup.nodes.Element", attribute0.getValue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("ismap", "cOoU<a-r+{fv]i");
      Object object0 = new Object();
      boolean boolean0 = attribute0.equals(object0);
      assertEquals("cOoU<a-r+{fv]i", attribute0.getValue());
      assertEquals("ismap", attribute0.getKey());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Attribute attribute0 = new Attribute("_\"BLBW~$NCLyw#&{y')", "_\"BLBW~$NCLyw#&{y')");
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      attribute0.html(stringBuilder0, document_OutputSettings1);
      assertEquals("_\"blbw~$nclyw#&{y')=\"_&quot;BLBW~$NCLyw#&amp;{y')\"", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("*f )g:DMVbq5", "");
      String string0 = attribute0.html();
      assertEquals("*f )g:dmvbq5=\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("4wR>bH3~T#OT", "org.jsoup.nodes.Element");
      boolean boolean0 = attribute0.isDataAttribute();
      assertFalse(boolean0);
      assertEquals("org.jsoup.nodes.Element", attribute0.getValue());
      assertEquals("4wr>bh3~t#ot", attribute0.getKey());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attribute attribute0 = new Attribute("autofocus", "autofocus");
      String string0 = attribute0.html();
      assertEquals("autofocus", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("iD `/5p;6DnR%-z", "iD `/5p;6DnR%-z");
      String string0 = attribute0.setValue("iD `/5p;6DnR%-z");
      assertEquals("iD `/5p;6DnR%-z", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("iD `/5p;6DnR%-z", "iD `/5p;6DnR%-z");
      String string0 = attribute0.getValue();
      assertEquals("iD `/5p;6DnR%-z", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("4wR>bH3~T#OT", "org.jsoup.nodes.Element");
      Attribute attribute1 = attribute0.clone();
      boolean boolean0 = attribute0.equals(attribute1);
      assertEquals("4wr>bh3~t#ot", attribute1.getKey());
      assertEquals("org.jsoup.nodes.Element", attribute1.getValue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("4wR>bH3~T#OT", "org.jsoup.nodes.Element");
      String string0 = attribute0.getKey();
      assertEquals("org.jsoup.nodes.Element", attribute0.getValue());
      assertEquals("4wr>bh3~t#ot", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        Attribute.createFromEncoded("", "declare");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
