/*
 * Copyright (c) 2007, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.sun.max.asm.x86;

import com.sun.max.asm.*;
import com.sun.max.util.*;

/**
 */
public enum DebugRegister implements EnumerableArgument<DebugRegister> {

    DR0(0), DR1(1), DR2(2), DR3(3), DR6(6), DR7(7);

    private final int number;

    private DebugRegister(int number) {
        this.number = number;
    }

    public int value() {
        return number;
    }

    public long asLong() {
        return value();
    }

    public String externalValue() {
        return "%" + name().toLowerCase();
    }

    public String disassembledValue() {
        return name().toLowerCase();
    }

    public Enumerator<DebugRegister> enumerator() {
        return ENUMERATOR;
    }

    public DebugRegister exampleValue() {
        return DR0;
    }

    public static final Enumerator<DebugRegister> ENUMERATOR = new Enumerator<DebugRegister>(DebugRegister.class);

}
