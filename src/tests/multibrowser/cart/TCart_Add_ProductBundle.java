/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.cart;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test add product bundle to cart from quickview and product detail page.
 * </p>
 * <h1 id="setup">Setup</h1>
 * <ul>
 * <li>open the session</li>
 * <li>search for products</li>
 * <li>open quickview</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <ul>
 * <li>add to cart from quickview</li>
 * <li>verify cart</li>
 * <li>remove product from cart</li>
 * <li>go to product and add to cart from product detail page</li>
 * <li>verify cart</li>
 * </ul>
 */
@ScriptName("tests.cart.TCart_Add_ProductBundle")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TCart_Add_ProductBundle extends AbstractAnnotatedScriptTestCase {
}