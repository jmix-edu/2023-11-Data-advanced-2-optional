package com.company.inventorycontrolsystem.screen.receiptdocument;

import com.company.inventorycontrolsystem.entity.ReceiptDocument;
import io.jmix.ui.screen.EditedEntityContainer;
import io.jmix.ui.screen.StandardEditor;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("ics_ReceiptDocument.edit")
@UiDescriptor("receipt-document-edit.xml")
@EditedEntityContainer("receiptDocumentDc")
public class ReceiptDocumentEdit extends StandardEditor<ReceiptDocument> {
}