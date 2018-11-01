/*
 * Copyright (C) 2018 Reincarnation Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */
package reincarnation.statement;

import reincarnation.Node;
import reincarnation.coder.Code;
import reincarnation.coder.Coder;

/**
 * @version 2018/10/27 21:55:57
 */
public class While extends Loopable {

    /** The code. */
    private final Code condition;

    /** The code. */
    private final Statement inner;

    /** The following. */
    private final Statement follow;

    /**
     * While statement.
     * 
     * @param inner
     * @param elze
     */
    public While(Node that, Node condition, Node inner, Node follow) {
        super(that, condition, inner, follow, condition);

        this.condition = condition;
        this.inner = that.process(inner);
        this.follow = that.process(follow);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void write(Coder coder) {
        coder.writeWhile(condition, () -> {
            if (inner != null) {
                inner.write(coder);
            }
        }, follow);
    }
}
