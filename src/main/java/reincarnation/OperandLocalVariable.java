/*
 * Copyright (C) 2019 Reincarnation Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */
package reincarnation;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import reincarnation.coder.Coder;
import reincarnation.structure.Structure;

/**
 * @version 2018/10/22 18:08:07
 */
public class OperandLocalVariable extends Operand {

    /** The variable name. */
    String name;

    /** Check whether this local variable is declared or not. */
    private boolean declared = false;

    /** Check whether this local variable's declaration location is clear or unclear. */
    private boolean unclear;

    /** The declration type. */
    private final LocalVariableDeclaration declaration;

    /** Holds all nodes that refer to this local variable. */
    final Set<Node> references = new HashSet();

    /**
     * Create local variable with index.
     * 
     * @param index A local index.
     */
    OperandLocalVariable(Class type, String name) {
        this(type, name, LocalVariableDeclaration.None);
    }

    /**
     * Create local variable with index.
     * 
     * @param index A local index.
     */
    OperandLocalVariable(Class type, String name, LocalVariableDeclaration declaration) {
        this.name = Objects.requireNonNull(name);
        this.type.set(type);
        this.declaration = declaration;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void writeCode(Coder coder) {
        if (name.equals("this")) {
            coder.writeThis();
        } else if (declaration == LocalVariableDeclaration.Only) {
            coder.writeLocalVariable(type.v, name, declaration);
        } else {
            coder.writeLocalVariable(type.v, name, declared ? LocalVariableDeclaration.None : LocalVariableDeclaration.With);

            if (!Debugger.whileDebug) {
                declared();
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        // don't call #write, it will throw error in debug mode.
        return name;
    }

    /**
     * <p>
     * Analyze at which node this local variable is declared. Some local variables are used across
     * multiple nodes, and it is not always possible to uniquely identify the declaration location.
     * </p>
     * <p>
     * Check the lowest common dominator node of all nodes that refer to this local variable, and if
     * the dominator node is included in the reference node, declare it at the first reference.
     * Otherwise, declare in the header of the dominator node.
     * </p>
     */
    void analyze(Structure root) {
        // calculate the lowest common dominator node
        Node common = Node.getLowestCommonDominator(references);

        if (common == null || references.contains(common)) {
            // do nothing
        } else {
            // insert variable declaration at the header of common dominator node
            OperandLocalVariable variable = new OperandLocalVariable(type.v, name, LocalVariableDeclaration.Only);
            root.unclearLocalVariable(variable);
            declared();
        }
    }

    OperandLocalVariable declared() {
        if (declared == false) {
            this.declared = true;

            if (name.equals("old2")) {
                new Error().printStackTrace();
            }
        }
        return this;
    }
}
