/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.multibrowser.cart;

import com.xceptance.xlt.api.engine.scripting.ScriptName;

import xltutil.AbstractAnnotatedScriptTestCase;
import xltutil.annotation.TestTargets;

/**
 * <p>
 * Test add and remove product option in cart.
 * </p>
 * <h1 id="setup-and-preparation">Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies</li>
 * <li>Add option product with configured quantity and no selected option to
 * cart</li>
 * <li>Go to cart</li>
 * </ul>
 * <h1 id="scope">Scope</h1>
 * <ul>
 * <li>Add product option</li>
 * <li>Validate calculated option price (product quantity &#42; option price)
 * </li>
 * <li>Validate calculated subtotal (product price total + option price total)
 * </li>
 * <li>Remove option and validate it</li>
 * </ul>
 * <p>
 * Note: Different options are handled as data driven test configured in a
 * dataset file. Please execute the generated wrapper class as JUnit test for
 * testing all options.
 * </p>
 */
@ScriptName("tests.us.cart.TCart_AddRemoveProductOption")
@TestTargets({ "FF_1500x1000","Chrome_1280x900" })
public class TCart_AddRemoveProductOption extends AbstractAnnotatedScriptTestCase {
}