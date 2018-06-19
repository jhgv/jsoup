/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 19 12:01:23 GMT 2018
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Tag_ESTest extends Tag_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Tag tag0 = Tag.valueOf("select");
      Tag tag1 = tag0.setSelfClosing();
      tag1.isFormListed();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = "keygen";
      Tag tag0 = Tag.valueOf("keygen");
      Tag tag1 = tag0.setSelfClosing();
      String string1 = "must be false";
      Tag tag2 = Tag.valueOf("must be false");
      tag2.setSelfClosing();
      tag1.setSelfClosing();
      // Undeclared exception!
      try { 
        Tag.valueOf((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tag tag0 = Tag.valueOf("1FmPGQp1I^X-zPC]z");
      Tag tag1 = tag0.setSelfClosing();
      tag1.setSelfClosing();
      Tag tag2 = Tag.valueOf("wzJ4'C1^$iB");
      tag1.equals(tag0);
      tag2.setSelfClosing();
      Tag tag3 = Tag.valueOf("base");
      tag2.canContainBlock();
      tag0.canContainBlock();
      tag2.isData();
      tag3.isSelfClosing();
      tag0.isData();
      tag0.isFormSubmittable();
      tag0.setSelfClosing();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Tag tag0 = Tag.valueOf("command");
      Tag tag1 = tag0.setSelfClosing();
      Tag tag2 = tag1.setSelfClosing();
      tag2.setSelfClosing();
      Tag tag3 = tag1.setSelfClosing();
      Tag tag4 = tag1.setSelfClosing();
      Tag tag5 = tag2.setSelfClosing();
      Tag tag6 = tag0.setSelfClosing();
      tag6.setSelfClosing();
      Tag tag7 = Tag.valueOf("command");
      tag1.isData();
      tag4.setSelfClosing();
      tag1.preserveWhitespace();
      tag4.formatAsBlock();
      tag0.hashCode();
      tag3.getName();
      tag7.preserveWhitespace();
      tag7.isData();
      tag0.isFormListed();
      tag5.isEmpty();
      Tag.valueOf("Array must not contain any null objects");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Tag tag0 = Tag.valueOf("zyN;[]@#n0B9I{ct[99");
      Tag tag1 = tag0.setSelfClosing();
      tag0.isFormSubmittable();
      tag0.isEmpty();
      tag0.getName();
      tag1.setSelfClosing();
      tag0.isKnownTag();
      tag1.isInline();
      tag0.isData();
      Tag tag2 = Tag.valueOf("zyN;[]@#n0B9I{ct[99");
      Tag.valueOf("zyn;[]@#n0b9i{ct[99");
      tag1.equals(tag2);
      Tag tag3 = tag2.setSelfClosing();
      Tag tag4 = tag3.setSelfClosing();
      tag3.equals(tag4);
      tag0.isInline();
      tag0.isSelfClosing();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Tag tag0 = Tag.valueOf("button");
      tag0.setSelfClosing();
      tag0.setSelfClosing();
      // Undeclared exception!
      try { 
        Tag.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Tag tag0 = Tag.valueOf("fieldset");
      Tag tag1 = Tag.valueOf("org.jsoup.helper.Validate");
      Tag tag2 = Tag.valueOf("uE");
      Tag.valueOf("fieldset");
      Tag tag3 = Tag.valueOf("Tt_.Nt#d");
      Tag.valueOf("R,ma\bp&E7wKQ#%h{");
      tag0.hashCode();
      tag2.isFormListed();
      tag0.getName();
      tag3.setSelfClosing();
      tag1.canContainBlock();
      tag2.formatAsBlock();
      tag3.isBlock();
      tag0.equals(tag1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Tag tag0 = Tag.valueOf("mark");
      Tag tag1 = tag0.setSelfClosing();
      tag1.setSelfClosing();
      Tag tag2 = Tag.valueOf("mark");
      tag2.setSelfClosing();
      Tag.valueOf("K==ooD");
      tag0.canContainBlock();
      tag0.setSelfClosing();
      tag2.isData();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Tag tag0 = Tag.valueOf("command");
      Tag tag1 = tag0.setSelfClosing();
      Tag tag2 = tag1.setSelfClosing();
      Tag tag3 = tag2.setSelfClosing();
      Tag tag4 = tag1.setSelfClosing();
      Tag tag5 = tag1.setSelfClosing();
      tag2.setSelfClosing();
      Tag tag6 = tag0.setSelfClosing();
      tag6.setSelfClosing();
      Tag tag7 = Tag.valueOf("command");
      tag1.isData();
      Tag tag8 = tag5.setSelfClosing();
      tag8.setSelfClosing();
      tag1.preserveWhitespace();
      tag5.formatAsBlock();
      tag3.hashCode();
      tag4.getName();
      tag7.preserveWhitespace();
      tag7.isData();
      tag0.isFormListed();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Tag tag0 = Tag.valueOf("_p9.R\".");
      Tag.valueOf("_p9.R\".");
      Tag.valueOf("param");
      tag0.formatAsBlock();
      tag0.isBlock();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Tag tag0 = Tag.valueOf("select");
      Tag.valueOf("select");
      tag0.isSelfClosing();
      tag0.isKnownTag();
      tag0.preserveWhitespace();
      // Undeclared exception!
      try { 
        Tag.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Tt");
      Tag tag1 = tag0.setSelfClosing();
      tag1.isInline();
      tag1.isFormSubmittable();
      Tag tag2 = Tag.valueOf("Tt");
      tag1.formatAsBlock();
      Tag tag3 = Tag.valueOf("Tt");
      tag0.isData();
      Tag.valueOf("Tt");
      tag2.setSelfClosing();
      Tag.valueOf("Tt");
      tag1.preserveWhitespace();
      Tag tag4 = Tag.valueOf("Tt");
      tag4.hashCode();
      Tag tag5 = tag0.setSelfClosing();
      tag3.equals(tag5);
      Tag.isKnownTag("");
      tag2.equals(tag1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Array must not contain any null objects");
      tag0.hashCode();
      tag0.isData();
      tag0.preserveWhitespace();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Tag.isKnownTag("");
      Tag tag0 = Tag.valueOf("map");
      Tag tag1 = tag0.setSelfClosing();
      tag1.setSelfClosing();
      tag1.setSelfClosing();
      Tag.valueOf("details");
      tag1.toString();
      tag0.hashCode();
      tag0.isBlock();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Tag tag0 = Tag.valueOf(";%IRqpRM.tTB4)5OA$");
      Tag tag1 = Tag.valueOf(";%IRqpRM.tTB4)5OA$");
      tag0.isInline();
      tag1.setSelfClosing();
      tag0.equals(";%IRqpRM.tTB4)5OA$");
      Tag tag2 = tag0.setSelfClosing();
      tag2.setSelfClosing();
      Tag.valueOf("JpLqqd `;gz4-%5*");
      tag0.isFormListed();
      tag0.formatAsBlock();
      tag0.getName();
      tag0.isEmpty();
      tag1.formatAsBlock();
      tag1.preserveWhitespace();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Tag tag0 = Tag.valueOf("(gM.4'o0\"A?ULq");
      Tag.valueOf("(gM.4'o0\"A?ULq");
      Tag tag1 = Tag.valueOf("(gM.4'o0\"A?ULq");
      tag1.setSelfClosing();
      Tag tag2 = tag0.setSelfClosing();
      tag2.preserveWhitespace();
      tag0.equals(tag1);
      tag0.isSelfClosing();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Tag tag0 = Tag.valueOf(" S?");
      Tag tag1 = tag0.setSelfClosing();
      tag1.isBlock();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Tag tag0 = Tag.valueOf("dd");
      Tag tag1 = tag0.setSelfClosing();
      Tag tag2 = Tag.valueOf("dd");
      Tag tag3 = Tag.valueOf("dd");
      Tag.valueOf("dd");
      tag0.formatAsBlock();
      tag2.isInline();
      tag3.isKnownTag();
      tag2.isBlock();
      tag1.formatAsBlock();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Tag tag0 = Tag.valueOf("oMcp~:tPD6ba.U");
      Tag tag1 = tag0.setSelfClosing();
      tag1.canContainBlock();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Must be false");
      Tag tag1 = tag0.setSelfClosing();
      tag1.setSelfClosing();
      tag0.isInline();
      tag0.formatAsBlock();
      tag0.isFormSubmittable();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Tag tag0 = Tag.valueOf("style");
      Tag tag1 = tag0.setSelfClosing();
      tag1.setSelfClosing();
      tag0.isKnownTag();
      Tag.isKnownTag((String) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Tag tag0 = Tag.valueOf(" qsrp");
      tag0.setSelfClosing();
      String string0 = "";
      // Undeclared exception!
      try { 
        Tag.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Object must not be null");
      tag0.isBlock();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Tag tag0 = Tag.valueOf("s 'dQpcmq");
      tag0.isKnownTag();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Bj 4>)");
      Tag tag1 = tag0.setSelfClosing();
      tag1.canContainBlock();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Tag tag0 = Tag.valueOf("BnOp4?]!Q+!Z$");
      Tag tag1 = tag0.setSelfClosing();
      tag1.formatAsBlock();
      tag0.setSelfClosing();
      tag1.hashCode();
      tag0.toString();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Array must not contain any null objects");
      Tag tag1 = tag0.setSelfClosing();
      tag1.setSelfClosing();
      tag1.isFormSubmittable();
      tag1.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Must be false");
      Tag tag1 = tag0.setSelfClosing();
      Tag tag2 = tag1.setSelfClosing();
      Tag tag3 = tag1.setSelfClosing();
      Tag tag4 = tag3.setSelfClosing();
      tag3.getName();
      tag4.equals(tag2);
      tag4.isInline();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Tag.isKnownTag("canvas");
      Tag tag0 = Tag.valueOf("canvas");
      Tag tag1 = tag0.setSelfClosing();
      tag1.setSelfClosing();
      tag1.isFormListed();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Tag tag0 = Tag.valueOf("WB");
      tag0.setSelfClosing();
      tag0.isEmpty();
      tag0.isSelfClosing();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Tag tag0 = Tag.valueOf("?");
      tag0.isFormSubmittable();
      tag0.isFormSubmittable();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Tag tag0 = Tag.valueOf("KwY");
      Tag tag1 = tag0.setSelfClosing();
      tag1.isFormListed();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Tag.isKnownTag("U_g<=#L9`)c<mW");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Tag tag0 = Tag.valueOf("html");
      tag0.isSelfClosing();
      // Undeclared exception!
      try { 
        Tag.valueOf("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Tag tag0 = Tag.valueOf(",DWJs");
      tag0.formatAsBlock();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Tag tag0 = Tag.valueOf("String must not be empty");
      Tag tag1 = tag0.setSelfClosing();
      tag1.setSelfClosing();
      tag1.setSelfClosing();
      tag1.getName();
      tag0.isData();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Tag tag0 = Tag.valueOf("92,n");
      tag0.preserveWhitespace();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Tag tag0 = Tag.valueOf(" pmNvK}");
      Tag tag1 = tag0.setSelfClosing();
      Tag tag2 = tag0.setSelfClosing();
      Tag.valueOf(" pmNvK}");
      tag1.getName();
      tag2.setSelfClosing();
      Tag tag3 = Tag.valueOf(" pmNvK}");
      Tag tag4 = tag3.setSelfClosing();
      tag2.toString();
      Tag tag5 = tag2.setSelfClosing();
      Tag.isKnownTag("pmnvk}");
      Tag tag6 = tag2.setSelfClosing();
      Tag tag7 = tag6.setSelfClosing();
      Tag.isKnownTag("pmnvk}");
      tag2.isKnownTag();
      tag5.equals(tag2);
      tag5.getName();
      tag4.isData();
      tag2.getName();
      Tag tag8 = tag3.setSelfClosing();
      tag7.isKnownTag();
      tag8.toString();
      Tag tag9 = Tag.valueOf("style");
      tag5.equals(tag9);
      Tag.isKnownTag("pmnvk}");
      tag5.isKnownTag();
      tag9.equals(tag0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Tag tag0 = Tag.valueOf("title");
      Tag tag1 = tag0.setSelfClosing();
      Tag tag2 = tag1.setSelfClosing();
      Tag tag3 = tag0.setSelfClosing();
      Tag tag4 = Tag.valueOf("h6");
      tag4.setSelfClosing();
      tag3.setSelfClosing();
      tag1.getName();
      Tag tag5 = tag2.setSelfClosing();
      tag0.isData();
      tag0.isEmpty();
      tag0.isEmpty();
      Tag tag6 = Tag.valueOf("title");
      Tag tag7 = tag6.setSelfClosing();
      tag5.hashCode();
      tag0.setSelfClosing();
      Tag.valueOf("title");
      Tag tag8 = tag2.setSelfClosing();
      Tag tag9 = tag8.setSelfClosing();
      tag0.setSelfClosing();
      tag1.hashCode();
      tag8.setSelfClosing();
      tag2.isFormSubmittable();
      Tag.isKnownTag("title");
      tag8.setSelfClosing();
      Tag.valueOf("title");
      tag6.isData();
      tag9.isData();
      tag1.preserveWhitespace();
      tag7.isKnownTag();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Tag tag0 = Tag.valueOf("command");
      Tag tag1 = tag0.setSelfClosing();
      Tag tag2 = tag1.setSelfClosing();
      Tag tag3 = tag1.setSelfClosing();
      Tag tag4 = tag1.setSelfClosing();
      tag1.setSelfClosing();
      Tag tag5 = tag0.setSelfClosing();
      tag5.setSelfClosing();
      Tag tag6 = Tag.valueOf("command");
      tag1.isData();
      Tag tag7 = tag4.setSelfClosing();
      tag7.setSelfClosing();
      tag1.preserveWhitespace();
      tag4.formatAsBlock();
      tag2.hashCode();
      tag3.getName();
      tag6.preserveWhitespace();
      tag6.isData();
      tag0.isFormListed();
      Tag.isKnownTag("command");
      tag5.setSelfClosing();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Tag.isKnownTag("+g`");
      Tag.valueOf("w*1+9d7EwNDS.$Qx_+");
      Tag tag0 = Tag.valueOf("+g`");
      Tag tag1 = Tag.valueOf("w*1+9d7EwNDS.$Qx_+");
      tag0.toString();
      tag1.hashCode();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Tag tag0 = Tag.valueOf("form");
      Tag tag1 = tag0.setSelfClosing();
      Tag tag2 = Tag.valueOf("`+y@e,I}oP)/");
      Tag tag3 = Tag.valueOf("`+y@e,I}oP)/");
      tag1.getName();
      tag0.isInline();
      tag0.hashCode();
      Tag tag4 = Tag.valueOf("'*f5i\"O+kYa?n,<%/");
      tag2.isSelfClosing();
      Tag.valueOf("Must be false");
      tag4.equals(tag1);
      tag3.isEmpty();
      tag1.isEmpty();
      tag2.isSelfClosing();
      tag4.isInline();
      tag3.getName();
      tag2.isFormSubmittable();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Tag tag0 = Tag.valueOf("(gM.4'o0\"A?ULq");
      Tag tag1 = Tag.valueOf("(gM.4'o0\"A?ULq");
      Tag tag2 = Tag.valueOf("(gM.4'o0\"A?ULq");
      tag2.setSelfClosing();
      Tag tag3 = Tag.valueOf("(gM.4'o0\"A?ULq");
      Tag tag4 = tag0.setSelfClosing();
      tag4.preserveWhitespace();
      tag0.equals(tag2);
      tag4.hashCode();
      tag1.isFormListed();
      tag3.equals(tag2);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Tag tag0 = Tag.valueOf("I");
      Tag tag1 = tag0.setSelfClosing();
      tag1.getName();
      tag0.hashCode();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Tag tag0 = Tag.valueOf("wzJ4'C1^$iB");
      tag0.setSelfClosing();
      Tag tag1 = Tag.valueOf("base");
      tag0.canContainBlock();
      tag0.isData();
      tag1.isSelfClosing();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Tag tag0 = Tag.valueOf("VH]{o{WY93");
      tag0.setSelfClosing();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Tag tag0 = Tag.valueOf("org.jsoup.helper.Validate");
      Tag tag1 = Tag.valueOf("q");
      Tag tag2 = Tag.valueOf("q");
      assertFalse(tag2.isSelfClosing());
      
      Tag tag3 = tag2.setSelfClosing();
      Tag tag4 = tag0.setSelfClosing();
      tag4.setSelfClosing();
      Tag tag5 = Tag.valueOf("/yp!O(GJ%v~i'O");
      tag0.isEmpty();
      Tag tag6 = tag2.setSelfClosing();
      tag0.toString();
      tag1.setSelfClosing();
      tag0.preserveWhitespace();
      tag2.isInline();
      tag0.hashCode();
      tag2.isKnownTag();
      tag0.isData();
      tag2.isSelfClosing();
      Tag tag7 = Tag.valueOf("org.jsoup.helper.Validate");
      tag2.isKnownTag();
      Tag tag8 = Tag.valueOf("org.jsoup.helper.validate");
      Tag.isKnownTag("n;scri{");
      Tag tag9 = Tag.valueOf("org.jsoup.helper.Validate");
      tag1.preserveWhitespace();
      tag6.isBlock();
      tag3.formatAsBlock();
      tag7.isKnownTag();
      tag8.isSelfClosing();
      tag4.formatAsBlock();
      tag3.equals("q");
      tag9.setSelfClosing();
      tag5.isFormListed();
      tag0.preserveWhitespace();
      tag9.setSelfClosing();
      boolean boolean0 = tag8.isBlock();
      assertFalse(boolean0);
  }
}
