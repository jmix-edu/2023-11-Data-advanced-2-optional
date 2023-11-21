package com.company.inventorycontrolsystem.screen.shipper;

import com.company.inventorycontrolsystem.entity.Shipper;
import io.jmix.ui.screen.EditedEntityContainer;
import io.jmix.ui.screen.StandardEditor;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("ics_Shipper.edit")
@UiDescriptor("shipper-edit.xml")
@EditedEntityContainer("shipperDc")
public class ShipperEdit extends StandardEditor<Shipper> {
}