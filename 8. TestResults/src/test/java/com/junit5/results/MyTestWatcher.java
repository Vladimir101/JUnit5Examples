package com.junit5.results;

import java.util.Optional;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

public class MyTestWatcher implements TestWatcher
{
	public void testAborted(ExtensionContext extensionContext, Throwable throwable)
	{
		// do something
	}

	public void testDisabled(ExtensionContext extensionContext, Optional<String> optional)
	{
		// do something
	}

	public void testFailed(ExtensionContext extensionContext, Throwable throwable)
	{
		System.out.println("'" + extensionContext.getDisplayName() + "' failed");
	}

	public void testSuccessful(ExtensionContext extensionContext)
	{
		System.out.println("'" + extensionContext.getDisplayName() + "' passed");
	}
}