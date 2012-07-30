package it.rcpvision.emf.components.examples.rap.ui;

import it.rcpvision.emf.components.views.AbstractSaveableTreeFormView;

import org.eclipse.emf.common.util.URI;

public class SaveableView extends AbstractSaveableTreeFormView {
	public static final String ID = "it.rcpvision.emf.components.examples.rap.ui.saveableview";

	@Override
	protected URI createResourceURI() {
		return URI.createURI("dummy:/My.model");
	}
}