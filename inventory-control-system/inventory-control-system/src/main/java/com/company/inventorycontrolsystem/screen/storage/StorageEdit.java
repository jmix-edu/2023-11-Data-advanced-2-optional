package com.company.inventorycontrolsystem.screen.storage;

import com.company.inventorycontrolsystem.entity.Storage;
import io.jmix.ui.screen.EditedEntityContainer;
import io.jmix.ui.screen.StandardEditor;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("ics_Storage.edit")
@UiDescriptor("storage-edit.xml")
@EditedEntityContainer("storageDc")
public class StorageEdit extends StandardEditor<Storage> {
}