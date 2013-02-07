/**
 */
package it.rcpvision.emf.components.dsl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposal Creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.rcpvision.emf.components.dsl.model.ProposalCreator#getProposalsSpecifications <em>Proposals Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getProposalCreator()
 * @model
 * @generated
 */
public interface ProposalCreator extends EObject
{
  /**
   * Returns the value of the '<em><b>Proposals Specifications</b></em>' containment reference list.
   * The list contents are of type {@link it.rcpvision.emf.components.dsl.model.ProposalSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proposals Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proposals Specifications</em>' containment reference list.
   * @see it.rcpvision.emf.components.dsl.model.ModelPackage#getProposalCreator_ProposalsSpecifications()
   * @model containment="true"
   * @generated
   */
  EList<ProposalSpecification> getProposalsSpecifications();

} // ProposalCreator
