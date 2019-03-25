package com.jsuite.pack1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ Test1.class, Test2.class })
class TestSuitePack1
{}
