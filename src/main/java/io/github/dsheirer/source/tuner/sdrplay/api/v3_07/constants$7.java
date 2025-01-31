/*
 * *****************************************************************************
 * Copyright (C) 2014-2023 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * ****************************************************************************
 */

// Generated by jextract

package io.github.dsheirer.source.tuner.sdrplay.api.v3_07;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
class constants$7 {

    static final FunctionDescriptor sdrplay_api_Open$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle sdrplay_api_Open$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_Open",
        constants$7.sdrplay_api_Open$FUNC
    );
    static final FunctionDescriptor sdrplay_api_Close$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle sdrplay_api_Close$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_Close",
        constants$7.sdrplay_api_Close$FUNC
    );
    static final FunctionDescriptor sdrplay_api_ApiVersion$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sdrplay_api_ApiVersion$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_ApiVersion",
        constants$7.sdrplay_api_ApiVersion$FUNC
    );
    static final FunctionDescriptor sdrplay_api_LockDeviceApi$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle sdrplay_api_LockDeviceApi$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_LockDeviceApi",
        constants$7.sdrplay_api_LockDeviceApi$FUNC
    );
    static final FunctionDescriptor sdrplay_api_UnlockDeviceApi$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle sdrplay_api_UnlockDeviceApi$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_UnlockDeviceApi",
        constants$7.sdrplay_api_UnlockDeviceApi$FUNC
    );
    static final FunctionDescriptor sdrplay_api_GetDevices$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle sdrplay_api_GetDevices$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_GetDevices",
        constants$7.sdrplay_api_GetDevices$FUNC
    );
}


