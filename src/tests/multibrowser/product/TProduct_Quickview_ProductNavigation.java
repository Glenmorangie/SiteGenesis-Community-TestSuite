/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.product;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Verifies product navigation on quickview
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>start session, open homepage and delete all visible cookies</li>
 * <li>search products</li>
 * <li>refine by color</li>
 * <li>sort by randomly</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <ul>
 * <li>store some product positions and names used for validation of navigation
 * </li>
 * <li>open quickview for first product</li>
 * <li>navigate to next quickview product</li>
 * <li>close quickview</li>
 * <li>open quickview for last product</li>
 * <li>navigate to previous product</li>
 * </ul>
 */
@ScriptName("tests.us.product.TProduct_Quickview_ProductNavigation")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TProduct_Quickview_ProductNavigation extends AbstractAnnotatedScriptTestCase {
}