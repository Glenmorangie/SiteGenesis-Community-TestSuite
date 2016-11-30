/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.catalog;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test select sort by option on catalog page.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Sort by via position</li>
 * <li>Validate result page</li>
 * <li>Sort by via random</li>
 * <li>Validate result page</li>
 * <li>Sort by via all labels</li>
 * <li>Validate result page</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName("tests.us.catalog.TCatalogProductListing_SortBy")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TCatalogProductListing_SortBy extends AbstractAnnotatedScriptTestCase {
}