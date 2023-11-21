package com.company.inventorycontrolsystem.screen.storage;

import com.company.inventorycontrolsystem.entity.Storage;
import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("ics_Storage.browse")
@UiDescriptor("storage-browse.xml")
@LookupComponent("storagesTable")
public class StorageBrowse extends StandardLookup<Storage> {
}