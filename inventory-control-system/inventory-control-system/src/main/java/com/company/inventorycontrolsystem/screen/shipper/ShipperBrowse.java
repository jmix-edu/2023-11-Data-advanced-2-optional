package com.company.inventorycontrolsystem.screen.shipper;

import com.company.inventorycontrolsystem.entity.Shipper;
import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("ics_Shipper.browse")
@UiDescriptor("shipper-browse.xml")
@LookupComponent("shippersTable")
public class ShipperBrowse extends StandardLookup<Shipper> {
}