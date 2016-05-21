/*
   Copyright (c) 2014,2015,2016 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ait.lienzo.client.core.shape.json.validators;

import com.ait.lienzo.client.core.shape.BoundingBoxPathClipper;
import com.google.gwt.json.client.JSONValue;

public class BoundingBoxPathClipperValidator extends AbstractPathClipperValidator
{
    public static final BoundingBoxPathClipperValidator INSTANCE = new BoundingBoxPathClipperValidator();

    public BoundingBoxPathClipperValidator()
    {
        super(BoundingBoxPathClipper.TYPE);
    }

    @Override
    public void validate(final JSONValue jval, final ValidationContext ctx) throws ValidationException
    {
        super.validate(jval, ctx);

        checkHardcodedAttribute("type", BoundingBoxPathClipper.TYPE, jval, ctx);
    }
}
