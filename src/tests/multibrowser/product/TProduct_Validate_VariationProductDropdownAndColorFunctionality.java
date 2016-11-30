/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.product;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Verifies if a value of a variation dropdown can be changed after selecting a
 * color. It retests a known issue (RAP-4413).
 * </p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Search product leads to pdp</li>
 * <li>Validate preconditions</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <ul>
 * <li>Select variation from dropdown</li>
 * <li>Select color</li>
 * <li>Select another variation from dropdown</li>
 * </ul>
 */
@ScriptName("tests.us.product.TProduct_Validate_VariationProductDropdownAndColorFunctionality")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TProduct_Validate_VariationProductDropdownAndColorFunctionality extends AbstractAnnotatedScriptTestCase {
}