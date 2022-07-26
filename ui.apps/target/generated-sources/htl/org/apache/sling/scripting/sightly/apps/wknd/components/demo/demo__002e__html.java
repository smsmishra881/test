/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.demo;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class demo__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
out.write("\n<h1>Demo</h1>\n");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Demo.class.getName(), obj().with("firstvariable", "reached"));
out.write("<div>\n    <p class=\"cmp-helloworld__item-label\">");
{
    String var_0 = ("Model message: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "Text"), "text")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</p>\n    <p class=\"cmp-helloworld__item-label\">");
{
    String var_1 = ("Model message: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "pageTitle"), "text")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\n    <p class=\"cmp-helloworld__item-label\">");
{
    String var_2 = ("Model message: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "frontendValue"), "text")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\n</div>\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

