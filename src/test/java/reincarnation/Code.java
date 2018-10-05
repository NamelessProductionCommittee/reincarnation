/*
 * Copyright (C) 2018 Reincarnation Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
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
         * @return A result.
         */
        int run();
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface IntParam extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        int run(int param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface IntParamBoolean extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        boolean run(int param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface Long extends Code {

        /**
         * Write testable code.
         * 
         * @return A result.
         */
        long run();
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface LongParam extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        long run(long param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface LongParamBoolean extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        boolean run(long param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface Float extends Code {

        /**
         * Write testable code.
         * 
         * @return A result.
         */
        float run();
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface FloatParam extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        float run(float param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface FloatParamBoolean extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        boolean run(float param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface Double extends Code {

        /**
         * Write testable code.
         * 
         * @return A result.
         */
        double run();
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface DoubleParam extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        double run(double param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface DoubleParamBoolean extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        boolean run(double param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface Byte extends Code {

        /**
         * Write testable code.
         * 
         * @return A result.
         */
        byte run();
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface ByteParam extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        byte run(byte param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface ByteParamBoolean extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        boolean run(byte param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface Short extends Code {

        /**
         * Write testable code.
         * 
         * @return A result.
         */
        short run();
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface ShortParam extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        short run(short param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface ShortParamBoolean extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        boolean run(short param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface Char extends Code {

        /**
         * Write testable code.
         * 
         * @return A result.
         */
        char run();
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface CharParam extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        char run(char param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface CharParamBoolean extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        boolean run(char param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface Boolean extends Code {

        /**
         * Write testable code.
         * 
         * @return A result.
         */
        boolean run();
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface BooleanParam extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        boolean run(boolean param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface Text extends Code {

        /**
         * Write testable code.
         * 
         * @return A result.
         */
        String run();
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface TextParam extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        String run(String param);
    }

    /**
     * @version 2018/04/04 16:29:00
     */
    public interface TextParamBoolean extends Code {

        /**
         * Write testable code.
         * 
         * @param A parameter.
         * @return A result.
         */
        boolean run(String param);
    }
}
