/*
 * Copyright (C) 2018 Nameless Production Committee
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://opensource.org/licenses/mit-license.php
 */
package reincarnation;

/**
 * @version 2018/10/02 19:57:24
 */
public interface Code {

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface Int extends Code {

        /**
         * Write testable code.
         * 
         * @return
         */
        int run();
    }
}
