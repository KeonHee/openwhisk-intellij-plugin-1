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

package org.apache.openwhisk.intellij.explorer.toolwindow.listener;

import com.intellij.util.messages.Topic;
import org.apache.openwhisk.intellij.common.whisk.model.WhiskAuth;
import org.apache.openwhisk.intellij.common.whisk.model.action.ExecutableWhiskAction;

import java.util.EventListener;

public interface OpenActionControlActionListener extends EventListener {

    Topic<OpenActionControlActionListener> TOPIC = Topic.create("Open Action Control", OpenActionControlActionListener.class);

    void openActionControlWindow(WhiskAuth whiskAuth, ExecutableWhiskAction executableWhiskAction);

}
