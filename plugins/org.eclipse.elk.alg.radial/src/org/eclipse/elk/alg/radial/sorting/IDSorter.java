/*******************************************************************************
 * Copyright (c) 2017 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.alg.radial.sorting;

import java.util.Comparator;
import java.util.List;

import org.eclipse.elk.alg.radial.options.RadialOptions;
import org.eclipse.elk.graph.ElkNode;

/**
 * Sort nodes by the {@link RadialOptions.ORDER_ID} option.
 */
public class IDSorter implements IRadialSorter {
    /**
     * Define how to compare two nodes by {@link RadialOptions.ORDER_ID}.
     */
    private final Comparator<ElkNode> idSorter = (node1, node2) -> {
        Integer orderID1 = node1.getProperty(RadialOptions.ORDER_ID);
        Integer orderID2 = node2.getProperty(RadialOptions.ORDER_ID);
        return orderID1.compareTo(orderID2);

    };

    /**
     * Sort nodes by the {@link RadialOptions.ORDER_ID} option.
     */
    @Override
    public void sort(final List<ElkNode> nodes) {
        nodes.sort(idSorter);
    }

    @Override
    public void initialize(ElkNode root) {
        // nothing to do here
    }

}
