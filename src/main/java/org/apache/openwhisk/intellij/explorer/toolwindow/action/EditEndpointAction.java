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

package org.apache.openwhisk.intellij.explorer.toolwindow.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.diagnostic.Logger;
import org.apache.openwhisk.intellij.common.whisk.model.WhiskEndpoint;
import org.apache.openwhisk.intellij.explorer.dialog.endpoint.EditEndpointDialog;

import static com.intellij.icons.AllIcons.Actions.Edit;

public class EditEndpointAction extends AnAction {
    private static final Logger LOG = Logger.getInstance(EditEndpointAction.class);

    private WhiskEndpoint whiskEndpoint;

    public EditEndpointAction(WhiskEndpoint whiskEndpoint) {
        super("Edit Endpoint", "Edit Endpoint", Edit);
        this.whiskEndpoint = whiskEndpoint;
    }

    @Override
    public void actionPerformed(AnActionEvent event) {
        EditEndpointDialog dialog = new EditEndpointDialog(event.getProject(), whiskEndpoint);
        if (dialog.showAndGet()) {
            LOG.info("closed");
        }
    }
}
