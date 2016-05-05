/*
 * Copyright 2015 JBoss, by Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.uberfire.ext.editor.commons.client.file;

import org.uberfire.backend.vfs.Path;
import org.uberfire.client.mvp.UberView;

public interface CopyPopupView extends UberView<CopyPopupView.Presenter> {

    interface Presenter {

        void onCancel();

        void onCopy();

        Path getPath();
    }

    String getNewName();

    Path getTargetPath();

    String getCheckInComment();

    void handleInvalidFileName();

    void handleDuplicatedFileName();

    void show();

    void hide();

}
