/*
 * Copyright (C) 2018 Reincarnation Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */
package reincarnation.structure;

import kiss.I;
import kiss.Signal;
import reincarnation.Node;
import reincarnation.coder.Coder;

/**
 * @version 2018/11/05 13:21:59
 */
public class InfiniteLoop extends Loopable {

    /** The code. */
    private final Structure inner;

    /** The following. */
    private final Structure follow;

    /**
     * Loop structure.
     * 
     * @param inner
     * @param follow
     */
    public InfiniteLoop(Node that, Node inner, Node follow) {
        super(that, inner, follow, inner, inner);

        this.inner = that.process(inner);
        this.follow = that.process(follow);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Signal<Structure> inner() {
        return I.signal(inner);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Signal<Structure> follower() {
        return I.signal(follow);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void writeCode(Coder coder) {
        coder.writeInfinitLoop(label(), () -> {
            if (inner != null) {
                inner.write(coder);
            }
        }, follow);
    }
}