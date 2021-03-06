/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.apex.rule.codesize;

import net.sourceforge.pmd.lang.apex.ast.ASTUserClass;
import net.sourceforge.pmd.lang.apex.rule.design.ExcessiveLengthRule;
import static apex.jorje.semantic.symbol.type.AnnotationTypeInfos.IS_TEST;

/**
 * This rule detects when a class exceeds a certain threshold. i.e. if a class
 * has more than 1000 lines of code.
 */
public class ExcessiveClassLengthRule extends ExcessiveLengthRule {
	public ExcessiveClassLengthRule() {
		super(ASTUserClass.class);
		setProperty(MINIMUM_DESCRIPTOR, 1000d);
	}

	@Override
	public Object visit(ASTUserClass node, Object data) {
		if(node.getNode().getModifiers().getModifiers().not(IS_TEST)) {
			return super.visit(node, data);
		}
		
		return data;
	}
}