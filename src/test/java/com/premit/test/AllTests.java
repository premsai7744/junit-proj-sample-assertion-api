package com.premit.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.premit.test")
@SelectClasses({TestArrayValues.class,TestEmployee.class,TestMessage.class,TestMultiple.class})
public class AllTests {

}
