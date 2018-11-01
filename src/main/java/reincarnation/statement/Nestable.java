/*
 * Copyright (C) 2018 Nameless Production Committee
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://opensource.org/licenses/mit-license.php
 */
package reincarnation.statement;

import java.util.LinkedList;

import reincarnation.Node;
import reincarnation.coder.Coder;

/**
 * @version 2018/11/01 16:32:29
 */
public abstract class Nestable extends Statement {

    /** The children manager. */
    private final LinkedList<Statement> children = new LinkedList();

    /**
     * @param node
     */
    protected Nestable(Node node) {
        super(node);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void write(Coder coder) {
        for (Statement child : children) {
            if (child != null) {
                child.write(coder);
            }
        }
    }
}
