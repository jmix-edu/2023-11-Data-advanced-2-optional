package com.company.inventorycontrolsystem.screen.receiptdocument;

import com.company.inventorycontrolsystem.entity.ReceiptDocument;
import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("ics_ReceiptDocument.browse")
@UiDescriptor("receipt-document-browse.xml")
@LookupComponent("receiptDocumentsTable")
public class ReceiptDocumentBrowse extends StandardLookup<ReceiptDocument> {
}