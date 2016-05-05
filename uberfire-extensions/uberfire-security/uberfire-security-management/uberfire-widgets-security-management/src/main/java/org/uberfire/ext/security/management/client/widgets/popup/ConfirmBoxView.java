/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.ext.security.management.client.widgets.popup;


import org.uberfire.ext.widgets.common.client.common.popups.YesNoCancelPopup;
import org.uberfire.mvp.Command;

/**
 * <p>A confirm box view using <code>org.uberfire.ext.widgets.common.client.common.popups.YesNoCancelPopup</code>.</p>
 *
 * @since 0.8.0
 */
public class ConfirmBoxView implements ConfirmBox.View {

    @Override
    public void show(final String title, final String message, final Command yesCommand,
                     final Command noCommand, final Command cancelCommand) {
        YesNoCancelPopup.newYesNoCancelPopup(title, message, yesCommand, noCommand, cancelCommand).show();
    }

    @Override
    public void show(String title, String message, Command yesCommand, Command noCommand) {
        YesNoCancelPopup.newYesNoCancelPopup(title, message, yesCommand, noCommand, null).show();
    }

    @Override
    public void show(String title, String message, Command yesCommand) {
        YesNoCancelPopup.newYesNoCancelPopup(title, message, yesCommand, null, null).show();
    }

}
