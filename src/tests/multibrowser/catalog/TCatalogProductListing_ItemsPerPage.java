/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.catalog;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test select items per page option on catalog page.
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Select Items per page via position</li>
 * <li>Validate result page</li>
 * <li>Select Items per page via random</li>
 * <li>Validate result page</li>
 * <li>Select Items per page via all labels</li>
 * <li>Validate result page</li>
 * </ul>
 * <h2 id="note">Note</h2>
 * <p>
 * Executing this test case using script developer leads to the following
 * message: &quot;The following test data placeholders could not be resolved:
 * itemsPerPageCount Replay the script anyway?&quot;
 * </p>
 * <p>
 * Please ignore this message, it is a known script developer issue (
 * <a href="https://lab.xceptance.de/issues/2349">https://lab.xceptance.de/
 * issues/2349</a>).
 * </p>
 */
@ScriptName("tests.us.catalog.TCatalogProductListing_ItemsPerPage")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TCatalogProductListing_ItemsPerPage extends AbstractAnnotatedScriptTestCase {
}