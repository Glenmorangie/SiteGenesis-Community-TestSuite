/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.search;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test search and expect a search result with multiple products.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>Search for text</li>
 * <li>Returns multiple products aka a product listing page</li>
 * <li>Validate result page (similar to catalog page)</li>
 * <li>Select a product</li>
 * <li>Validate product detail page</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies</li>
 * </ul>
 */
@ScriptName
("tests.search.TSearchProducts_ProductsOnly")
public class TSearchProducts_ProductsOnly extends AbstractScriptTestCase
{
}