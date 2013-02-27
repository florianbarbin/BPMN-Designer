/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpmn2.validation;

import org.eclipse.bpmn2.FlowElement;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.bpmn2.CategoryValue}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CategoryValueValidator {
    boolean validate();

    boolean validateValue(String value);

    boolean validateCategorizedFlowElements(EList<FlowElement> value);
}