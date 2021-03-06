/*******************************************************************************
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.elk.graph.text.ide

import org.eclipse.elk.graph.text.ide.contentassist.ElkGraphProposalProvider
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider

/**
 * Use this class to register ide components.
 */
class ElkGraphIdeModule extends AbstractElkGraphIdeModule {
    
    def Class<? extends IdeContentProposalProvider> bindIdeContentProposalProvider() {
        ElkGraphProposalProvider
    }
    
}
