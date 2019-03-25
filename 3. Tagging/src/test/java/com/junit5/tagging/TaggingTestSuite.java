package com.junit5.tagging;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.junit5.tagging")
@IncludeTags({"production", "development"})
class TaggingTestSuite
{}
