/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.bpmn2.bpmdi.validation;

import org.eclipse.bpmn2.BaseElement;

import org.eclipse.bpmn2.bpmdi.BPMNLabel;
import org.eclipse.bpmn2.bpmdi.MessageVisibleKind;

import org.eclipse.dd.di.DiagramElement;

/**
 * A sample validator interface for {@link org.eclipse.bpmn2.bpmdi.BPMNEdge}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BPMNEdgeValidator {
    boolean validate();

    boolean validateLabel(BPMNLabel value);

    boolean validateBpmnElement(BaseElement value);

    boolean validateSourceElement(DiagramElement value);

    boolean validateTargetElement(DiagramElement value);

    boolean validateMessageVisibleKind(MessageVisibleKind value);
}