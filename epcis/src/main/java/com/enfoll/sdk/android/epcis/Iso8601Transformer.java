/*
 * Copyright (C) 2018. Enfoll Pty Ltd
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.enfoll.sdk.android.epcis;

import org.simpleframework.xml.transform.Transform;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/*
 *  Converts Date to ISO8601 format.
 *
 *
 * @author Darren O'Connor (doconnor@enfoll.com)
 * @version 1.0
 * @since 1.0
 *
 */

public class Iso8601Transformer implements Transform<Date> {

private  SimpleDateFormat dateFormat;


@SuppressWarnings("WeakerAccess")
public Iso8601Transformer()
        {
            this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'+00:00'", Locale.US);
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

//@SuppressWarnings("WeakerAccess")
//public Iso8601Transformer(SimpleDateFormat dateFormat)
//        {
//        this.dateFormat = dateFormat;
//        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//        }
//
//@SuppressWarnings("WeakerAccess")
//public Iso8601Transformer(SimpleDateFormat dateFormat, TimeZone timeZone)
//        {
//            this.dateFormat = dateFormat;
//            dateFormat.setTimeZone(timeZone);
//        }

@Override
public Date read(String value) throws Exception
        {
        return dateFormat.parse(value);
        }


@Override
public String write(Date value) throws Exception
        {
        return dateFormat.format(value);
        }
}
