/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.lastcalc;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.lastcalc.TokenList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Consumer;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TokenList_SSTest extends TokenList_SSTest_scaffolding {
// allCoveredLines:[23, 31, 35, 39, 40, 43, 47, 48, 49, 50, 54, 58, 62, 66, 70, 71, 72, 73, 75, 85, 88, 118, 124, 125, 127, 137, 138, 140, 141, 142, 146, 152, 157, 162, 171, 172, 173, 175, 176, 177, 178, 179, 180, 181, 185, 188, 193, 211, 212, 214, 215, 216, 217, 218, 220, 221, 222, 224, 225, 229, 244, 249, 254, 255, 256, 257, 258, 259, 261, 269, 270, 271, 273]

  @Test(timeout = 4000)
  public void test_replaceWithTokenList_00()  throws Throwable  {
      //caseID:41800933dab405de5e7a4fed14e256f6
      //CoveredLines: [23, 35, 58, 66, 88, 137, 138, 140, 141, 142, 171, 172, 173, 175, 177, 179, 180, 181, 193, 211, 212, 214, 215, 216, 217, 218, 220, 221, 222, 224, 225]
      //Input_0_int: 1
      //Input_1_int: 0
      //Input_2_TokenList: {size=1 418 2959 62, get=\"4\" tokenList_SimpleTokenList0 object0}
      
      Object object0 = new Object();
      Object[] objectArray0 = new Object[0];
      
      TokenList.SimpleTokenList tokenList_SimpleTokenList0 = TokenList.createD(objectArray0);
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      doReturn("4", tokenList_SimpleTokenList0, object0).when(tokenList0).get(anyInt());
      doReturn(1, 418, 2959, 62).when(tokenList0).size();
      
      //Call method: replaceWithTokenList
      tokenList0.replaceWithTokenList(1, 0, tokenList0);
  }

  @Test(timeout = 4000)
  public void test_replaceWithTokens_01()  throws Throwable  {
      //caseID:8de84494861caaa956620ccda7b24ca2
      //CoveredLines: [23, 58, 62, 88, 137, 138, 140, 141, 142, 152, 171, 172, 173, 175, 177, 179, 180, 181, 193, 211, 212, 214, 215, 216, 217, 218, 220, 221, 222, 224, 225]
      //Input_0_int: 31
      //Input_1_int: 2
      //Input_2_Object[]: objectArray0
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      doReturn(1577).when(tokenList0).size();
      Object[] objectArray0 = new Object[8];
      
      //Call method: replaceWithTokens
      tokenList0.replaceWithTokens(31, 2, objectArray0);
  }

  @Test(timeout = 4000)
  public void test_getPosInParent_02()  throws Throwable  {
      //caseID:f2db1147334985ab938b31aa7d0eaf36
      //CoveredLines: [23, 88, 118, 124, 125, 214, 215, 216, 217, 218, 220, 221, 222, 224, 225, 244, 254, 255, 256, 257, 258, 259]
      //Input_0_int: 3
      
      ArrayList<TokenList> arrayList0 = new ArrayList<TokenList>();
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      
      arrayList0.add(tokenList0);
      
      arrayList0.add(tokenList0);
      TokenList.CompositeTokenList tokenList_CompositeTokenList0 = new TokenList.CompositeTokenList(arrayList0);
      //mock consumer0
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      tokenList_CompositeTokenList0.forEach(consumer0);
      
      //Call method: getPosInParent
      // Undeclared exception!
      try { 
        tokenList_CompositeTokenList0.getPosInParent(3);
      } catch(Throwable e) {
         verifyException("com.lastcalc.TokenList$CompositeTokenList", e);
         assertEquals("org.smartunit.runtime.mock.java.lang.MockArrayIndexOutOfBoundsException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_append_03()  throws Throwable  {
      //caseID:d956e00fab1b66f0049db417f5a150fc
      //CoveredLines: [23, 70, 71, 72, 73, 75, 88, 214, 215, 216, 217, 218, 220, 221, 222, 224, 225]
      //Input_0_TokenList[]: tokenListArray0
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      TokenList[] tokenListArray0 = new TokenList[4];
      tokenListArray0[0] = tokenList0;
      tokenListArray0[1] = tokenList0;
      tokenListArray0[2] = tokenList0;
      tokenListArray0[3] = tokenList0;
      
      //Call method: append
      tokenList0.append(tokenListArray0);
  }

  @Test(timeout = 4000)
  public void test_replaceWithTokenList_04()  throws Throwable  {
      //caseID:8ff3b7a5258ea723874a7f78dd92927f
      //CoveredLines: [23, 88, 171, 172, 173, 175, 176, 214, 215, 216, 217, 218, 220, 221, 222, 224, 225]
      
      int int0 = 31;
      int int1 = 3;
      int int2 = 2;
      int int3 = 31;
      ArrayList<TokenList> arrayList0 = new ArrayList<TokenList>();
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      
      arrayList0.add(tokenList0);
      TokenList.CompositeTokenList tokenList_CompositeTokenList0 = new TokenList.CompositeTokenList(arrayList0);
      Integer integer0 = new Integer(10);
      TokenList.SubTokenList tokenList_SubTokenList0 = null;
      try {
        tokenList_SubTokenList0 = new TokenList.SubTokenList((TokenList) null, (-1), 255);
      } catch(Throwable e) {
         verifyException("com.lastcalc.TokenList$SubTokenList", e);
         assertEquals("org.smartunit.runtime.mock.java.lang.MockIllegalArgumentException", e.getClass().getName());
         assertEquals("Start must be >= 0", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_addAllTo_05()  throws Throwable  {
      //caseID:6314d28835433873fe09328813c14a65
      //CoveredLines: [23, 31, 35, 47, 48, 49, 50, 88, 118, 124, 125, 127, 137, 138, 140, 141, 142]
      //Input_0_Collection<Object>: linkedList1
      
      Object object0 = new Object();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      //mock object1
      Object object1 = mock(Object.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("End must be less than or equal to size of parent TokenList").when(object1).toString();
      
      linkedList0.add(object1);
      
      TokenList.create(linkedList0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = object0;
      TokenList.SimpleTokenList tokenList_SimpleTokenList0 = new TokenList.SimpleTokenList(objectArray0);
      Object object2 = new Object();
      Object[] objectArray1 = new Object[8];
      objectArray1[0] = object0;
      objectArray1[1] = object0;
      objectArray1[2] = object0;
      objectArray1[3] = object0;
      objectArray1[4] = object0;
      objectArray1[5] = object0;
      objectArray1[6] = object0;
      objectArray1[7] = object0;
      
      TokenList.createD(objectArray1);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      //mock object3
      Object object3 = mock(Object.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      arrayList0.add(object3);
      TokenList.SimpleTokenList tokenList_SimpleTokenList1 = new TokenList.SimpleTokenList(arrayList0);
      Object object4 = new Object();
      Integer integer0 = new Integer(2634);
      Object[] objectArray2 = new Object[6];
      objectArray2[0] = object0;
      objectArray2[1] = object0;
      objectArray2[2] = object0;
      objectArray2[3] = object0;
      objectArray2[4] = object0;
      objectArray2[5] = object0;
      
      TokenList.SimpleTokenList tokenList_SimpleTokenList2 = TokenList.createD(objectArray2);
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      doReturn(object0, tokenList_SimpleTokenList2, object0).when(tokenList0).get(anyInt());
      doReturn(1, (-1), 45, 3).when(tokenList0).size();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      //mock object5
      Object object5 = mock(Object.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      linkedList1.add(object5);
      
      //Call method: addAllTo
      tokenList0.addAllTo(linkedList1);
  }

  @Test(timeout = 4000)
  public void test_getPosInParent_06()  throws Throwable  {
      //caseID:b9a2d9cbe5c50cfe399cf3fb1fd76453
      //CoveredLines: [23, 88, 214, 215, 216, 217, 218, 220, 221, 222, 224, 225, 254, 255, 261]
      //Input_0_int: 3
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      ArrayList<TokenList> arrayList0 = new ArrayList<TokenList>();
      //mock tokenList_TLPos0
      TokenList.TLPos tokenList_TLPos0 = mock(TokenList.TLPos.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("fjn").when(tokenList_TLPos0).toString();
      //mock tokenList1
      TokenList tokenList1 = mock(TokenList.class, CALLS_REAL_METHODS);
      doReturn(tokenList_TLPos0).when(tokenList1).getPosInParent(anyInt());
      doReturn(31).when(tokenList1).size();
      
      arrayList0.add(tokenList1);
      TokenList.CompositeTokenList tokenList_CompositeTokenList0 = new TokenList.CompositeTokenList(arrayList0);
      
      //Call method: getPosInParent
      tokenList_CompositeTokenList0.getPosInParent(3);
  }

  @Test(timeout = 4000)
  public void test_get_07()  throws Throwable  {
      //caseID:dba7d999a8485e9d6074ef1755d40f55
      //CoveredLines: [23, 88, 211, 212, 214, 215, 216, 217, 220, 221, 224, 225, 229]
      //Input_0_int: 31
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      TokenList[] tokenListArray0 = new TokenList[0];
      TokenList.CompositeTokenList tokenList_CompositeTokenList0 = new TokenList.CompositeTokenList(tokenListArray0);
      
      //Call method: get
      // Undeclared exception!
      try { 
        tokenList_CompositeTokenList0.get(31);
      } catch(Throwable e) {
         verifyException("com.lastcalc.TokenList$CompositeTokenList", e);
         assertEquals("java.lang.ArrayIndexOutOfBoundsException", e.getClass().getName());
         assertEquals("31", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_size_08()  throws Throwable  {
      //caseID:483c15b7f524aaf9de7db428e0ab9c3e
      //CoveredLines: [23, 88, 214, 215, 216, 217, 218, 220, 221, 222, 224, 225, 249]
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      ArrayList<TokenList> arrayList0 = new ArrayList<TokenList>();
      //mock tokenList1
      TokenList tokenList1 = mock(TokenList.class, CALLS_REAL_METHODS);
      
      arrayList0.add(tokenList1);
      TokenList.CompositeTokenList tokenList_CompositeTokenList0 = new TokenList.CompositeTokenList(arrayList0);
      
      //Call method: size
      tokenList_CompositeTokenList0.size();
  }

  @Test(timeout = 4000)
  public void test_get_09()  throws Throwable  {
      //caseID:3bdcc52052d063e32511849c7526f743
      //CoveredLines: [23, 88, 171, 172, 173, 175, 177, 179, 180, 181, 185, 188]
      //Input_0_int: 0
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      TokenList.SubTokenList tokenList_SubTokenList0 = new TokenList.SubTokenList(tokenList0, 0, 0);
      
      //Call method: get
      // Undeclared exception!
      try { 
        tokenList_SubTokenList0.get(0);
      } catch(Throwable e) {
         verifyException("com.lastcalc.TokenList$SubTokenList", e);
         assertEquals("org.smartunit.runtime.mock.java.lang.MockArrayIndexOutOfBoundsException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_getPosInParent_10()  throws Throwable  {
      //caseID:86e51e093f5dc3716aa21cca77020f9f
      //CoveredLines: [23, 88, 137, 138, 140, 141, 142, 162, 269, 270, 271, 273]
      //Input_0_int: 3
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) tokenList0;
      objectArray0[1] = (Object) tokenList0;
      objectArray0[2] = (Object) tokenList0;
      TokenList.SimpleTokenList tokenList_SimpleTokenList0 = new TokenList.SimpleTokenList(objectArray0);
      
      //Call method: getPosInParent
      tokenList_SimpleTokenList0.getPosInParent(3);
  }

  @Test(timeout = 4000)
  public void test_replaceWithTokenList_11()  throws Throwable  {
      //caseID:2f95419a5f5c720a8b64c2d8c60572c3
      //CoveredLines: [23, 58, 66, 88, 171, 172, 173, 175, 177, 178]
      //Input_0_int: 1
      //Input_1_int: 0
      //Input_2_TokenList: {}
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      
      //Call method: replaceWithTokenList
      // Undeclared exception!
      try { 
        tokenList0.replaceWithTokenList(1, 0, tokenList0);
      } catch(Throwable e) {
         verifyException("com.lastcalc.TokenList$SubTokenList", e);
         assertEquals("org.smartunit.runtime.mock.java.lang.MockIllegalArgumentException", e.getClass().getName());
         assertEquals("End must be less than or equal to size of parent TokenList", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_indexOf_12()  throws Throwable  {
      //caseID:98288e3eaeeac735e0878fcd13779fb0
      //CoveredLines: [23, 39, 40, 43, 88, 140, 141, 142]
      //Input_0_Object: arrayList1
      
      ArrayList<TokenList.CompositeTokenList> arrayList0 = new ArrayList<TokenList.CompositeTokenList>();
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      doReturn(arrayList0).when(tokenList0).get(anyInt());
      doReturn(1024).when(tokenList0).size();
      ArrayList<Object> arrayList1 = new ArrayList<Object>();
      //mock object0
      Object object0 = mock(Object.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      arrayList1.add(object0);
      TokenList.SimpleTokenList tokenList_SimpleTokenList0 = new TokenList.SimpleTokenList(arrayList1);
      
      //Call method: indexOf
      tokenList0.indexOf(tokenList_SimpleTokenList0);
  }

  @Test(timeout = 4000)
  public void test_get_13()  throws Throwable  {
      //caseID:bfbdae10473cab374acaf0ecd01c4e89
      //CoveredLines: [23, 88, 137, 138, 140, 141, 142, 146]
      //Input_0_int: 31
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      Object[] objectArray0 = new Object[3];
      //mock object0
      Object object0 = mock(Object.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      objectArray0[0] = object0;
      objectArray0[1] = (Object) tokenList0;
      objectArray0[2] = (Object) tokenList0;
      TokenList.SimpleTokenList tokenList_SimpleTokenList0 = new TokenList.SimpleTokenList(objectArray0);
      
      //Call method: get
      // Undeclared exception!
      try { 
        tokenList_SimpleTokenList0.get(31);
      } catch(Throwable e) {
         verifyException("java.util.ArrayList", e);
         assertEquals("java.lang.IndexOutOfBoundsException", e.getClass().getName());
         assertEquals("Index: 31, Size: 3", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test_iterator_14()  throws Throwable  {
      //caseID:87eeddd6f677d36505575eb7bc5d8652
      //CoveredLines: [23, 88, 140, 141, 142, 157]
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      //mock object0
      Object object0 = mock(Object.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      arrayList0.add(object0);
      TokenList.SimpleTokenList tokenList_SimpleTokenList0 = new TokenList.SimpleTokenList(arrayList0);
      
      //Call method: iterator
      tokenList_SimpleTokenList0.iterator();
  }

  @Test(timeout = 4000)
  public void test_toString_15()  throws Throwable  {
      //caseID:f7785e5a37523ef63d5d471cd26e6108
      //CoveredLines: [54, 118, 124, 125]
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      
      //Call method: toString
      tokenList0.toString();
  }

  @Test(timeout = 4000)
  public void test_isEmpty_16()  throws Throwable  {
      //caseID:536a476f981a5b4419c22f4191aa2a2a
      //CoveredLines: [85]
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      
      //Call method: isEmpty
      tokenList0.isEmpty();
  }

  @Test(timeout = 4000)
  public void test_isEmpty_17()  throws Throwable  {
      //caseID:68c25c9488e1c89d0d0409b082e7911f
      //CoveredLines: [85]
      
      //mock tokenList0
      TokenList tokenList0 = mock(TokenList.class, CALLS_REAL_METHODS);
      doReturn(3).when(tokenList0).size();
      
      //Call method: isEmpty
      tokenList0.isEmpty();
  }
}
