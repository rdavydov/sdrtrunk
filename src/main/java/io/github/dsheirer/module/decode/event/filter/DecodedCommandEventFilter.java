/*
 * *****************************************************************************
 * Copyright (C) 2014-2022 Dennis Sheirer
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

package io.github.dsheirer.module.decode.event.filter;

import io.github.dsheirer.module.decode.event.DecodeEventType;
import java.util.Arrays;

public class DecodedCommandEventFilter extends EventFilter
{
    public DecodedCommandEventFilter()
    {
        super("Commands", Arrays.asList(
                DecodeEventType.ANNOUNCEMENT,
                DecodeEventType.STATION_ID,
                DecodeEventType.ACKNOWLEDGE,
                DecodeEventType.PAGE,
                DecodeEventType.QUERY,
                DecodeEventType.RADIO_CHECK,
                DecodeEventType.STATUS,
                DecodeEventType.COMMAND,
                DecodeEventType.EMERGENCY,
                DecodeEventType.NOTIFICATION,
                DecodeEventType.FUNCTION
        ));
    }
}
