/*
 * Copyright (C) 2018 Nameless Production Committee
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://opensource.org/licenses/mit-license.php
 */
package reincarnation.structure;

import java.util.Objects;

import kiss.I;
import kiss.Signal;
import reincarnation.Node;
import reincarnation.coder.Coder;

/**
 * @version 2018/11/01 9:40:49
 */
public class Fragment extends Structure {

    /** The actual code. */
    private final Node code;

    /** The following structure. */
    private final Structure follow;

    /**
     * Code fragment.
     * 
     * @param code
     */
    public Fragment(Node code) {
        this(code, null);
    }

    /**
     * Code fragment.
     * 
     * @param code
     */
    public Fragment(Node code, Structure follow) {
        super(code);

        this.code = Objects.requireNonNull(code);
        this.follow = Objects.requireNonNullElse(follow, Structure.Empty);
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
        code.write(coder);
        follow.write(coder);
    }
}