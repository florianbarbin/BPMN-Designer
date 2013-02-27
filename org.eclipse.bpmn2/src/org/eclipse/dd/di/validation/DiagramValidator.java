/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.dd.di.validation;

import org.eclipse.dd.di.DiagramElement;
import org.eclipse.dd.di.Style;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.dd.di.Diagram}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DiagramValidator {
    boolean validate();

    boolean validateName(String value);

    boolean validateDocumentation(String value);

    boolean validateResolution(float value);

    boolean validateOwnedStyle(EList<Style> value);

    boolean validateRootElement(DiagramElement value);
}