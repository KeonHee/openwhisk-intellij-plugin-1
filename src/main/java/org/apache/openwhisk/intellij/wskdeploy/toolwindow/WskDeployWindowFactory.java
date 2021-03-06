/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.openwhisk.intellij.wskdeploy.toolwindow;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.apache.openwhisk.intellij.common.notification.SimpleNotifier;
import org.apache.openwhisk.intellij.wskdeploy.toolwindow.ui.WskDeployWindowForm;
import org.jetbrains.annotations.NotNull;

public class WskDeployWindowFactory implements ToolWindowFactory {
    private static final Logger LOG = Logger.getInstance(WskDeployWindowFactory.class);
    private static final SimpleNotifier NOTIFIER = SimpleNotifier.getInstance();

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        WskDeployWindowForm wskDeployWindowForm = new WskDeployWindowForm(project, toolWindow);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(wskDeployWindowForm.getContent(), null, false);
        toolWindow.getContentManager().addContent(content);
    }
}
